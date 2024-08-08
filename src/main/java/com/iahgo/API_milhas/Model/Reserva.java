import com.iahgo.API_milhas.Model.Passageiros;

import java.util.*;


public class Reserva {


    public Reserva() {
    }

    public String codigoReserva;
    public Date dataEmissao;
    public String companhia;
    public Voo voo;
    public Passageiros passageiro;
    public integer id;
    
    public integer getId() {
        return id;
    }
    
    public void setId(integer id) {
        this.id = id;
    }
    
    public String getCodigoReserva() {
        return codigoReserva;
    }
    
    public void setCodigoReserva(String codigoReserva) {
        this.codigoReserva = codigoReserva;
    }
    
    public Date getDataEmissao() {
        return dataEmissao;
    }
    
    public void setDataEmissao(Date dataEmissao) {
        this.dataEmissao = dataEmissao;
    }
    
    public String getCompanhia() {
        return companhia;
    }
    
    public void setCompanhia(String companhia) {
        this.companhia = companhia;
    }
    
    public Voo getVoo() {
        return voo;
    }
    
    public void setVoo(Voo voo) {
        this.voo = voo;
    }
    
    public Passageiros getPassageiro() {
        return passageiro;
    }
    
    public void setPassageiro(Passageiros passageiro) {
        this.passageiro = passageiro;
    }

}