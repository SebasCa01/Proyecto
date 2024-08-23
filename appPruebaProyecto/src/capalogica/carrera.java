/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package capalogica;

import java.util.HashSet;

/**
 *
 * @author Sebas y david
 * Estudiantes: Sebastián Castro Murillo y David Cruz Alfaro
 * profesora: Laura Aguero Castro
 * Universidad Técnica Nacional
 * carrera Ingenieria del software
 * curso ISW-211 Programación I
 */
public class carrera {
    private competidor[] competidor;
    private double km;
    private int vuelta;
    private int[] tiempos;
    private String[] competencias ={"Mangos","Hato","Chuchecas","Ganaderos","Pampa"};

    public carrera() {
        this.competidor = new competidor[50];
        this.tiempos = new int[50];
        this.km = km;
        this.vuelta = vuelta;
    }
    //crea el competidor
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
    // ordena los competidores por el id de forma ascendente
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
     // ordena los competidores por el id de forma descendente
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
    //genera la cantidad de vueltas
    public int vueltas(){
        vuelta = (int) (Math.random()*21)+30;
        return vuelta;
    }
    // genera la cantidad de kilometros
    public void cantkm(int vueltas){
        for (int i = 0; i < competencias.length; i++) {
           double pulgadas = 8150 * vueltas;
        km = pulgadas * 0.0254;
        competencias[i] = "competencia: " + competencias[i] + "\t" + "vueltas:" +vueltas + "\t"+ "km" + km + "\n"; 
        }
    }
    // genera los tiempos de los corredores
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

    public String[] getCompetencias() {
        return competencias;
    }

    @Override
    public String toString() {
        StringBuilder result = new StringBuilder();
        for (competidor compi : competidor) {
        result.append("id: ").append(compi.getId()).append("\t");
        result.append("edad: ").append(compi.getEdad()).append("\t");
        result.append("equipos: ").append(compi.getEquipos()).append("\t");;
        result.append("categorias: ").append(compi.getCategorias()).append("\n");
        }
        return result.toString();
    }  
     public String[] toStringcompe() {
         return getCompetencias();
    }  
}
