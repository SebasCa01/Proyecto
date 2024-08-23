/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package capalogica;

import otherclass.categorias;
import otherclass.equipos;

/**
 *
 * @author Usuario
 */
public class simulador {
  private competidor[]competidor;
  private carrera[]carrera;
  private int[]diferencia;
  private String[] competencias ={"Mangos","Hato","Chuchecas","Ganaderos","Pampa"};

    public simulador(competidor[] competidor, carrera[] carrera, int[] diferencia) {
        this.competidor = new competidor[50];
        this.carrera = new carrera[50];
        this.diferencia = new int[4];
    }
    public void ordenaTiempo(carrera ocarrera){
        for (int i = 0; i < this.competidor.length -1; i++) { // recorre normal
             for (int j = i +1; j < this.competidor.length; j++) { // compara con el que esta a la par
                 if (this.competidor[i].getTiempo() > this.competidor[j].getTiempo()) {
                     competidor nuevo = this.competidor[i];
                     this.competidor[i] = this.competidor[j];
                     this.competidor[j] = nuevo;
                 }
             }
        }     
    }
  
  public void clasfequipos(equipos equipo){
//        int[] tiempototal = null;
//        int menortiempo = 0;
//        
//        for (int i = 0; i < this.competidor.length; i++) {
//            if (this.competidor[i].getEquipo() == equipo.Rapidos_y_Furiosos) {
//                tiempototal[i] += competidor[i].getTiempo();
//            }else if (this.competidor[i].getEquipo() == equipo.Velocidad_Total) {
//                tiempototal[i] += competidor[i].getTiempo();
//            }else if (this.competidor[i].getEquipo() == equipo.Prudencia) {
//                tiempototal[i] += competidor[i].getTiempo();
//            }else if (this.competidor[i].getEquipo() == equipo.Prudencia_Total) {
//                tiempototal[i] += competidor[i].getTiempo();
//            }
//        }
//        for (int i = 0; i < tiempototal.length; i++) {
//            if (tiempototal[i] < tiempototal[i]) {
//                menortiempo = tiempototal[i];
//                diferencia[i] = tiempototal[i] - menortiempo;
//            }
//        }
           // Inicializar el arreglo para acumular tiempos por categoría
        int[] tiempoTotalPorCategoria = new int[categorias.values().length];

        // Inicializar el arreglo de diferencia a cero
        for (int i = 0; i < diferencia.length; i++) {
            diferencia[i] = 0;
        }

        // Sumar tiempos por categoría
        for (competidor compi : competidor) {
            if (compi != null) {
                categorias categoria = compi.getCategoria();
                int clasif = categoria.ordinal(); // Obtener el índice basado en la posición en la enumeración
                tiempoTotalPorCategoria[clasif] += compi.getTiempo();
            }
        }

        // Encontrar el menor tiempo total
        int menortiempo = Integer.MAX_VALUE;
        for (int tiempo : tiempoTotalPorCategoria) {
            if (tiempo < menortiempo) {
                menortiempo = tiempo;
            }
        }

        // Calcular diferencias
        for (int i = 0; i < tiempoTotalPorCategoria.length; i++) {
            diferencia[i] = tiempoTotalPorCategoria[i] - menortiempo;
        }
}

}
