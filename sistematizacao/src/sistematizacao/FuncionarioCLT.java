package sistematizacao;

import java.util.List;

public class FuncionarioCLT extends Funcionario {
    public FuncionarioCLT(String nome, String cpf, String cargo, int cargaHoraria, String email, List<String> problemasSaude, String contatoEmergenciaNome, String contatoEmergenciaTelefone, String tipoSanguineo) {
        super(nome, cpf, cargo, cargaHoraria, email, problemasSaude, contatoEmergenciaNome, contatoEmergenciaTelefone, tipoSanguineo);
    }

    @Override
    public String toString() {
        return "FuncionarioCLT{" +
                "nome='" + nome + '\'' +
                ", cpf='" + cpf + '\'' +
                ", cargo='" + cargo + '\'' +
                ", cargaHoraria=" + cargaHoraria +
                ", email='" + email + '\'' +
                ", problemasSaude=" + problemasSaude +
                ", contatoEmergenciaNome='" + contatoEmergenciaNome + '\'' +
                ", contatoEmergenciaTelefone='" + contatoEmergenciaTelefone + '\'' +
                ", tipoSanguineo='" + tipoSanguineo + '\'' +
                '}';
    }
}
