package sistematizacao;

public class FuncionarioEstagiario extends Funcionario {

    public FuncionarioEstagiario(String nome, String cpf, String cargo, int cargaHoraria, String email, String doenca, String contatoEmergenciaNome, String contatoEmergenciaTelefone, String tipoSanguineo) {
        super(nome, cpf, cargo, cargaHoraria, email, doenca, contatoEmergenciaNome, contatoEmergenciaTelefone, tipoSanguineo);
    }

    @Override
    public String toString() {
        return "Estagiário{" +
                "nome='" + nome + '\'' +
                ", cpf='" + cpf + '\'' +
                ", cargo='" + cargo + '\'' +
                ", carga horária=" + cargaHoraria +
                ", email=" + email + '\'' +
                ", doença='" + doenca + '\'' +
                ", contato de emergência='" + contatoEmergenciaNome + " (" + contatoEmergenciaTelefone + ")" + '\'' +
                ", tipo sanguíneo='" + tipoSanguineo + '\'' +
                '}';
    }
}
