package sistematizacao;

import java.util.List;

public class Funcionario {
    protected String nome;
    protected String cpf;
    protected String cargo;
    protected int cargaHoraria;
    protected String email;
    protected List<String> problemasSaude;
    protected String contatoEmergenciaNome;
    protected String contatoEmergenciaTelefone;
    protected String tipoSanguineo;

    public Funcionario(String nome, String cpf, String cargo, int cargaHoraria, String email, List<String> problemasSaude, String contatoEmergenciaNome, String contatoEmergenciaTelefone, String tipoSanguineo) {
        this.nome = nome;
        this.cpf = cpf;
        this.cargo = cargo;
        this.cargaHoraria = cargaHoraria;
        this.email = email;
        this.problemasSaude = problemasSaude;
        this.contatoEmergenciaNome = contatoEmergenciaNome;
        this.contatoEmergenciaTelefone = contatoEmergenciaTelefone;
        this.tipoSanguineo = tipoSanguineo;
    }

    public String getNome() {
        return nome;
    }

    public String getCpf() {
        return cpf;
    }

    public String getCargo() {
        return cargo;
    }

    public int getCargaHoraria() {
        return cargaHoraria;
    }

    public String getEmail() {
        return email;
    }

    public List<String> getProblemasSaude() {
        return problemasSaude;
    }

    public String getContatoEmergenciaNome() {
        return contatoEmergenciaNome;
    }

    public String getContatoEmergenciaTelefone() {
        return contatoEmergenciaTelefone;
    }

    public String getTipoSanguineo() {
        return tipoSanguineo;
    }

    @Override
    public String toString() {
        return "Funcionario{" +
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
