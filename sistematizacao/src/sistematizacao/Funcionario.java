package sistematizacao;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

//Atributos
public class Funcionario {
    protected String nome;
    protected String cpf;
    protected String cargo;
    protected int cargaHoraria;
    protected String email;
    protected String doenca;
    protected String contatoEmergenciaNome;
    protected String contatoEmergenciaTelefone;
    protected String tipoSanguineo;

    
//Constructor
    public Funcionario(String nome, String cpf, String cargo, int cargaHoraria, String email, String doenca, String contatoEmergenciaNome, String contatoEmergenciaTelefone, String tipoSanguineo) {
        this.nome = nome;
        this.cpf = cpf;
        this.cargo = cargo;
        this.cargaHoraria = cargaHoraria;
        this.email = email;
        this.doenca = doenca;
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
    
    public String getDoenca() {
        return doenca;
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
        return "Funcionário{" +
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
