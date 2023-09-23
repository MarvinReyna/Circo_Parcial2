package com.mgro.Circo_Parcial2;

import java.util.ArrayList;
import java.util.List;

public class Circo {
 public static void main(String[] args) {
    
     Circo circo = new Circo();

   
     Acto malabaristas = new Acto("Malabaristas", 5);
     Acto payasos = new Acto("Payasos", 7);

    
     circo.agregarActo(malabaristas);
     circo.agregarActo(payasos);


     circo.venderBoletos(malabaristas, 10, "Front Row");
     circo.venderBoletos(payasos, 15, "VIP");

     
     circo.mostrarInformacion();
 }

 private List<Acto> actos = new ArrayList<>();
 private List<Boleto> boletos = new ArrayList<>();

 
 public void agregarActo(Acto acto) {
     actos.add(acto);
 }


 public void venderBoletos(Acto acto, int cantidad, String localidad) {
     Boleto boleto = new Boleto(acto, cantidad, localidad);
     boletos.add(boleto);
 }


 public void mostrarInformacion() {
     System.out.println("---- Informacion del Circo ----");
     for (Acto acto : actos) {
         System.out.println("Acto: " + acto.getNombre());
         System.out.println("Boletos Vendidos:");
         for (Boleto boleto : boletos) {
             if (boleto.getActo() == acto) {
                 System.out.println("  - Localidad: " + boleto.getLocalidad() + ", Cantidad: " + boleto.getCantidad());
             }
         }
         System.out.println("-----------------------------");
     }
 }
}