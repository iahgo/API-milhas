
import java.util.*;


public class Pagamento {


    public Pagamento() {
    }

    public Date dataPagamento;
    public Float valor;
    public String nomePagante;
    public String nomeRecebedor;
    public Integer id;
    
    public Integer getId() {
        return id;
    }
    public void setId(Integer id) {
        this.id = id;
    }

    public Date getDataPagamento() {
        return dataPagamento;
    }

    public void setDataPagamento(Date dataPagamento) {
        this.dataPagamento = dataPagamento;
    }

    public Float getValor() {
        return valor;
    }

    public void setValor(Float valor) {
        this.valor = valor;
    }

    public String getNomePagante() {
        return nomePagante;
    }

    public void setNomePagante(String nomePagante) {
        this.nomePagante = nomePagante;
    }

    public String getNomeRecebedor() {
        return nomeRecebedor;
    }

    public void setNomeRecebedor(String nomeRecebedor) {
        this.nomeRecebedor = nomeRecebedor;
    }

}