package sistematizacao;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class CadastroFuncionarios {
    private List<Funcionario> funcionarios;
    private Scanner scanner;

    public CadastroFuncionarios() {
        this.funcionarios = new ArrayList<>();
        this.scanner = new Scanner(System.in);
    }

    public void cadastrarFuncionarioViaTerminal() {
        System.out.println("Digite o nome do funcion�rio:");
        String nome = scanner.nextLine();

        System.out.println("Digite o CPF do funcion�rio:");
        String cpf = scanner.nextLine();

        // Verifica se o CPF j� est� cadastrado
        if (cpfJaCadastrado(cpf)) {
            System.out.println("Erro: CPF j� cadastrado. Funcion�rio n�o cadastrado.");
            return;
        }

        System.out.println("Digite o cargo do funcion�rio:");
        String cargo = scanner.nextLine();

        System.out.println("Digite a carga hor�ria do funcion�rio:");
        int cargaHoraria = scanner.nextInt();
        scanner.nextLine(); 

        System.out.println("Digite o email do funcion�rio:");
        String email = scanner.nextLine();

        // Funcion�rio pode ter mais de um problema - Array
        List<String> problemasSaude = new ArrayList<>();
        while (true) {
            System.out.println("Informe a condi��o de sa�de do funcion�rio (digite 'fim' para terminar):");
            System.out.println("1 - Problema card�aco");
            System.out.println("2 - Alergia");
            System.out.println("3 - Diabetes");
            System.out.println("4 - Nenhuma");
            System.out.println("5 - Outros (Especificar)");
            System.out.print("Escolha uma op��o: ");
            int opcaoDoenca = scanner.nextInt();
            scanner.nextLine();

            String doenca;
            switch (opcaoDoenca) {
                case 1:
                    doenca = "Problema card�aco";
                    break;
                case 2:
                    doenca = "Alergia";
                    break;
                case 3:
                    doenca = "Diabetes";
                    break;
                case 4:
                    doenca = "Nenhuma";
                    break;
                case 5:
                    System.out.println("Especifique a condi��o de sa�de:");
                    doenca = scanner.nextLine();
                    break;
                default:
                    System.out.println("Op��o inv�lida.");
                    continue;
            }

            problemasSaude.add(doenca);
            System.out.println("Deseja adicionar mais condi��es de sa�de? (sim/n�o)");
            String resposta = scanner.nextLine();
            if (resposta.equalsIgnoreCase("n�o") || resposta.equalsIgnoreCase("nao")) {
                break;
            }
        }

        System.out.println("Digite o nome do contato para emerg�ncias:");
        String contatoEmergenciaNome = scanner.nextLine();

        System.out.println("Digite o telefone do contato para emerg�ncias:");
        String contatoEmergenciaTelefone = scanner.nextLine();

        System.out.println("Digite o tipo sangu�neo do funcion�rio:");
        String tipoSanguineo = scanner.nextLine();

        System.out.println("Tipo de funcion�rio:");
        System.out.println("1 - Funcion�rio CLT");
        System.out.println("2 - Estagi�rio");
        System.out.print("Escolha uma op��o: ");
        int opcaoTipo = scanner.nextInt();
        scanner.nextLine(); 

        switch (opcaoTipo) {
            case 1:
                FuncionarioCLT funcionarioCLT = new FuncionarioCLT(nome, cpf, cargo, cargaHoraria, email, problemasSaude, contatoEmergenciaNome, contatoEmergenciaTelefone, tipoSanguineo);
                funcionarios.add(funcionarioCLT);
                break;
            case 2:
                FuncionarioEstagiario estagiario = new FuncionarioEstagiario(nome, cpf, cargo, cargaHoraria, email, problemasSaude, contatoEmergenciaNome, contatoEmergenciaTelefone, tipoSanguineo);
                funcionarios.add(estagiario);
                break;
            default:
                System.out.println("Op��o inv�lida. Funcion�rio n�o cadastrado.");
        }
    }

    // Fun��o para verificar o CPF
    private boolean cpfJaCadastrado(String cpf) {
        for (Funcionario funcionario : funcionarios) {
            if (funcionario.getCpf().equals(cpf)) {
                return true;
            }
        }
        return false;
    }

    public Funcionario consultarPorCpfViaTerminal() {
        System.out.println("Digite o CPF do funcion�rio para consulta:");
        String cpfConsulta = scanner.nextLine();

        for (Funcionario funcionario : funcionarios) {
            if (funcionario.getCpf().equals(cpfConsulta)) {
                return funcionario;
            }
        }
        return null;
    }

    public void imprimirTodosFuncionarios() {
        for (Funcionario funcionario : funcionarios) {
            System.out.println(funcionario);
        }
    }

    public static void main(String[] args) {
        CadastroFuncionarios cadastro = new CadastroFuncionarios();
        Scanner scanner = new Scanner(System.in);
        int opcao;

        do {
            System.out.println("\n### Menu ###");
            System.out.println("1 - Cadastrar funcion�rio");
            System.out.println("2 - Consultar funcion�rio por CPF");
            System.out.println("3 - Imprimir todos os funcion�rios cadastrados");
            System.out.println("0 - Sair");
            System.out.print("Escolha uma op��o: ");
            opcao = scanner.nextInt();
            scanner.nextLine(); 

            switch (opcao) {
                case 1:
                    cadastro.cadastrarFuncionarioViaTerminal();
                    break;
                case 2:
                    Funcionario funcionarioEncontrado = cadastro.consultarPorCpfViaTerminal();
                    if (funcionarioEncontrado != null) {
                        System.out.println("Funcion�rio encontrado:");
                        System.out.println(funcionarioEncontrado);
                    } else {
                        System.out.println("Funcion�rio com CPF n�o encontrado.");
                    }
                    break;
                case 3:
                    System.out.println("\nTodos os funcion�rios cadastrados:");
                    cadastro.imprimirTodosFuncionarios();
                    break;
                case 0:
                    System.out.println("Saindo...");
                    break;
                default:
                    System.out.println("Op��o inv�lida. Tente novamente.");
            }

        } while (opcao != 0);

        scanner.close();
    }
}
