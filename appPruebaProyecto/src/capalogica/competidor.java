/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package capalogica;

import otherclass.categorias;
import otherclass.equipos;

/**
 *
 * @author David y Sebas 
 */
public class competidor {
  private int edad;
  private int id;
  private int tiempo;
  private categorias categorias;
  private equipos equipos;

    public competidor(int edad, int id) {
        this.edad = edad;
        this.id = id;
        this.tiempo = 0;
        selectCategorias();
        selectEquipos();
    }
    public void setEdad(int edad) {
        this.edad = edad;
    }
    public void setId(int id) {
        this.id = id;
    }
    public void setTiempo(int tiempo) {
        this.tiempo = tiempo;
    }
    public int getTiempo() {
        return tiempo;
    }
    public int getEdad() {
        return edad;
    }
    public int getId() {
        return id;
    }
    public categorias getCategorias() {
        return categorias;
    }
    public equipos getEquipos() {
        return equipos;
    }
    public Enum selectCategorias(){
     if(edad>17 && edad < 26){
        categorias = categorias.Juvenil;
     }else if(edad > 25 && edad <36){
         categorias = categorias.Adulto;
     }else if(edad > 35 && edad <46) {
         categorias = categorias.Adulto_Mayor;
     }else if(edad > 45 && edad < 56){
         categorias=categorias.Veterano;
     }else{
         categorias=categorias.Oro;
     } return categorias;
    }
 public Enum selectEquipos(){
    if(edad >  17 && edad <21){
       equipos = equipos.Rapidos_y_Furiosos;
    }else if (edad>20 && edad <31){
    equipos= equipos.Velocidad_Total;
    }else if (edad>30 && edad < 51){
        equipos=equipos.Prudencia;
    }else{
        equipos= equipos.Prudencia_Total;
    }
    return equipos;
 }
  @Override
 public String toString(){
   return "" + edad + "" + id + "" + categorias + "" + equipos;
 }

    categorias getCategoria() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}

