package sistematizacao;

public class FuncionarioCLT extends Funcionario {

    public FuncionarioCLT(String nome, String cpf, String cargo, int cargaHoraria, String email, String doenca, String contatoEmergenciaNome, String contatoEmergenciaTelefone, String tipoSanguineo) {
        super(nome, cpf, cargo, cargaHoraria, email, doenca, contatoEmergenciaNome, contatoEmergenciaTelefone, tipoSanguineo);
    }

    @Override
    public String toString() {
        return "Funcion�rio CLT{" +
                "nome='" + nome + '\'' +
                ", cpf='" + cpf + '\'' +
                ", cargo='" + cargo + '\'' +
                ", carga hor�ria=" + cargaHoraria +
                ", email=" + email + '\'' +
                ", doen�a='" + doenca + '\'' +
                ", contato de emerg�ncia='" + contatoEmergenciaNome + " (" + contatoEmergenciaTelefone + ")" + '\'' +
                ", tipo sangu�neo='" + tipoSanguineo + '\'' +
                '}';
    }
}
