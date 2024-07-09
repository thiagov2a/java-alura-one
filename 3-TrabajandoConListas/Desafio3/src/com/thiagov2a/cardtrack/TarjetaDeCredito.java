package com.thiagov2a.cardtrack;

import java.util.ArrayList;
import java.util.List;

public class TarjetaDeCredito {

    private double limite;
    private double saldo;
    private List<Compra> compras;

    public TarjetaDeCredito(double limite) {
        this.limite = limite;
        this.saldo = limite;
        this.compras = new ArrayList<>();
    }

    public boolean hacerCompra(Compra compra) {
        if (compra.getValor() > saldo) {
            return false; // No hay saldo suficiente
        }
        saldo -= compra.getValor();
        compras.add(compra);
        return true; // Compra realizada con éxito
    }

    public double getLimite() {
        return limite;
    }

    public double getSaldo() {
        return saldo;
    }

    public List<Compra> getCompras() {
        return compras;
    }
}
