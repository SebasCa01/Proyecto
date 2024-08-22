/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package capalogica;

import java.util.HashSet;

/**
 *
 * @author Sebas
 */
public class carrera {
    private competidor[] competidor;
    private double km;
    private int vuelta;
    private int[] tiempos;

    public carrera() {
        this.competidor = new competidor[50];
        this.tiempos = new int[50];
        this.km = km;
        this.vuelta = vuelta;
    }
    public void creaCompetidor(){
        HashSet<Integer> idUnico = new HashSet<>();
        for (int i = 0; i < this.competidor.length; i++) {
            int edad = (int) (Math.random()*63)+18;
            int id;
            do {
                id = (int) (Math.random()*401)+100;
            } while (!idUnico.add(id));
            this.competidor[i] = new competidor(id, edad);
        }
    }
    public void idAscendente(){
        for (int i = 0; i < this.competidor.length -1; i++) {
            for (int j =  i +1; j < this.competidor.length; j++) {
                if (this.competidor[i].getId() > this.competidor[j].getId()) {
                    competidor nuevo = this.competidor[i];
                    this.competidor[i] = this.competidor[j];
                    this.competidor[j] = nuevo;
                }
            }
        }
    }
    public void idDescendente(){
        for (int i = 0; i < this.competidor.length -1; i++) {
            for (int j =  i +1; j < this.competidor.length; j++) {
                if (this.competidor[i].getId() < this.competidor[j].getId()) {
                    competidor nuevo = this.competidor[i];
                    this.competidor[i] = this.competidor[j];
                    this.competidor[j] = nuevo;
                }
            }
        }
    }
    public int vueltas(){
        vuelta = (int) (Math.random()*21)+30;
        return vuelta;
    }
    public double cantkm(int vueltas){
        double pulgadas = 8150 * vueltas;
        km = pulgadas * 0.0254;
        return km;
    }
    public void tiempos(){
        for (int i = 0; i < this.tiempos.length; i++) {
            int tiempo = (int) (Math.random()*3001) +3000;
            tiempos[i] = tiempo;
            competidor[i].setTiempo(competidor[i].getTiempo() + tiempo);
        }
    }
    public competidor[] getCompetidor() {
        return competidor;
    }

    @Override
    public String toString() {
        StringBuilder result = new StringBuilder();
        for (competidor compi : competidor) {
        result.append("id: ").append(compi.getId()).append("\t");
        result.append("edad: ").append(compi.getEdad()).append("\t");
        result.append("equipos: ").append(compi.getEquipos()).append("\t");;
        result.append("categorias: ").append(compi.getCategorias()).append("\t");
        }
        return result.toString();
    }  
}
