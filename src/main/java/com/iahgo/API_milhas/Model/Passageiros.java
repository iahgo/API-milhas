
import java.util.*;


public class Passageiros {


    public Passageiros() {
    }


    public String nome;
    public String cpf;
    public Date dataNasc;
    public String email;
    public String telefone;
    public Boolean isAdulto;
    public Integer id;
    
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public Date getDataNasc() {
        return dataNasc;
    }

    public void setDataNasc(Date dataNasc) {
        this.dataNasc = dataNasc;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public Boolean getIsAdulto() {
        return isAdulto;
    }

    public void setIsAdulto(Boolean isAdulto) {
        this.isAdulto = isAdulto;
    }

    public void listarPassageiros() {
        // TODO implement here
    }

}