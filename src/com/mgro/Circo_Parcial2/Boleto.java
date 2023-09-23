package com.mgro.Circo_Parcial2;

class Boleto {
    private Acto acto;
    private int cantidad;
    private String localidad;

    public Boleto(Acto acto, int cantidad, String localidad) {
        this.acto = acto;
        this.cantidad = cantidad;
        this.localidad = localidad;
    }

    public Acto getActo() {
        return acto;
    }

    public int getCantidad() {
        return cantidad;
    }

    public String getLocalidad() {
        return localidad;
    }
}
