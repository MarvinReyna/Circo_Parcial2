package com.mgro.Circo_Parcial2;

class Acto {
    private String nombre;
    private int duracion;

    public Acto(String nombre, int duracion) {
        this.nombre = nombre;
        this.setDuracion(duracion);
    }

    public String getNombre() {
        return nombre;
    }

	public int getDuracion() {
		return duracion;
	}

	public void setDuracion(int duracion) {
		this.duracion = duracion;
	}
}