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
        System.out.println("Digite o nome do funcionário:");
        String nome = scanner.nextLine();

        System.out.println("Digite o CPF do funcionário:");
        String cpf = scanner.nextLine();

        // Verifica se o CPF já está cadastrado
        if (cpfJaCadastrado(cpf)) {
            System.out.println("Erro: CPF já cadastrado. Funcionário não cadastrado.");
            return;
        }

        System.out.println("Digite o cargo do funcionário:");
        String cargo = scanner.nextLine();

        System.out.println("Digite a carga horária do funcionário:");
        int cargaHoraria = scanner.nextInt();
        scanner.nextLine(); 

        System.out.println("Digite o email do funcionário:");
        String email = scanner.nextLine();

        // Funcionário pode ter mais de um problema - Array
        List<String> problemasSaude = new ArrayList<>();
        while (true) {
            System.out.println("Informe a condição de saúde do funcionário (digite 'fim' para terminar):");
            System.out.println("1 - Problema cardíaco");
            System.out.println("2 - Alergia");
            System.out.println("3 - Diabetes");
            System.out.println("4 - Nenhuma");
            System.out.println("5 - Outros (Especificar)");
            System.out.print("Escolha uma opção: ");
            int opcaoDoenca = scanner.nextInt();
            scanner.nextLine();

            String doenca;
            switch (opcaoDoenca) {
                case 1:
                    doenca = "Problema cardíaco";
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
                    System.out.println("Especifique a condição de saúde:");
                    doenca = scanner.nextLine();
                    break;
                default:
                    System.out.println("Opção inválida.");
                    continue;
            }

            problemasSaude.add(doenca);
            System.out.println("Deseja adicionar mais condições de saúde? (sim/não)");
            String resposta = scanner.nextLine();
            if (resposta.equalsIgnoreCase("não") || resposta.equalsIgnoreCase("nao")) {
                break;
            }
        }

        System.out.println("Digite o nome do contato para emergências:");
        String contatoEmergenciaNome = scanner.nextLine();

        System.out.println("Digite o telefone do contato para emergências:");
        String contatoEmergenciaTelefone = scanner.nextLine();

        System.out.println("Digite o tipo sanguíneo do funcionário:");
        String tipoSanguineo = scanner.nextLine();

        System.out.println("Tipo de funcionário:");
        System.out.println("1 - Funcionário CLT");
        System.out.println("2 - Estagiário");
        System.out.print("Escolha uma opção: ");
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
                System.out.println("Opção inválida. Funcionário não cadastrado.");
        }
    }

    // Função para verificar o CPF
    private boolean cpfJaCadastrado(String cpf) {
        for (Funcionario funcionario : funcionarios) {
            if (funcionario.getCpf().equals(cpf)) {
                return true;
            }
        }
        return false;
    }

    public Funcionario consultarPorCpfViaTerminal() {
        System.out.println("Digite o CPF do funcionário para consulta:");
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
            System.out.println("1 - Cadastrar funcionário");
            System.out.println("2 - Consultar funcionário por CPF");
            System.out.println("3 - Imprimir todos os funcionários cadastrados");
            System.out.println("0 - Sair");
            System.out.print("Escolha uma opção: ");
            opcao = scanner.nextInt();
            scanner.nextLine(); 

            switch (opcao) {
                case 1:
                    cadastro.cadastrarFuncionarioViaTerminal();
                    break;
                case 2:
                    Funcionario funcionarioEncontrado = cadastro.consultarPorCpfViaTerminal();
                    if (funcionarioEncontrado != null) {
                        System.out.println("Funcionário encontrado:");
                        System.out.println(funcionarioEncontrado);
                    } else {
                        System.out.println("Funcionário com CPF não encontrado.");
                    }
                    break;
                case 3:
                    System.out.println("\nTodos os funcionários cadastrados:");
                    cadastro.imprimirTodosFuncionarios();
                    break;
                case 0:
                    System.out.println("Saindo...");
                    break;
                default:
                    System.out.println("Opção inválida. Tente novamente.");
            }

        } while (opcao != 0);

        scanner.close();
    }
}
