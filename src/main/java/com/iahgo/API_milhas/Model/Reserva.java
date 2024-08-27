package com.iahgo.API_milhas.Model;

public class Reserva {


    public Reserva() {
    }

    public String codigoReserva;
    public String companhia;
    public Passageiros passageiro;
    public Integer id;
    
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getCodigoReserva() {
        return codigoReserva;
    }

    public void setCodigoReserva(String codigoReserva) {
        this.codigoReserva = codigoReserva;
    }

    public String getCompanhia() {
        return companhia;
    }

    public void setCompanhia(String companhia) {
        this.companhia = companhia;
    }

    public Passageiros getPassageiro() {
        return passageiro;
    }

    public void setPassageiro(Passageiros passageiro) {
        this.passageiro = passageiro;
    }

}