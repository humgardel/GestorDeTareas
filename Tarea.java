/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyecto;

import java.util.Calendar;

/**
 *
 * @author usuario1
 */
public class Tarea {
    
    public static enum Estado {pendiente, cumplido, vencido}
    
    private String descripcion_breve;
    private String descripcion_detallada;
    private String fecha_inicial;
    private int prioridad;
    private int duracion_dias;
    private Estado estado;
    
    public Tarea(String descripcion_breve, String descripcion_detallada, String fecha_inicial, int prioridad, int duracion_dias){
    
        this.descripcion_breve = descripcion_breve;
        this.descripcion_detallada = descripcion_detallada;
        this.fecha_inicial = fecha_inicial;
        this.prioridad = prioridad;
        this.duracion_dias=duracion_dias;
        this.estado = Estado.pendiente;
    
    }

    @Override
    public String toString() {
        return "Descripcion: " + this.descripcion_breve + "\nDescripcion detallada: " + this.descripcion_detallada+"\nEstado: " + this.estado + "\n"; //To change body of generated methods, choose Tools | Templates.
    }
    
//    getter
    public String getDescripcionBreve(){
    return this.descripcion_breve;
    }
//   setter
    public void setDescripcionBreve(String nueva_descripcion_breve){
    this.descripcion_breve = nueva_descripcion_breve;
    }

    public String getDescripcion_detallada() {
        return descripcion_detallada;
    }

    public void setDescripcion_detallada(String descripcion_detallada) {
        this.descripcion_detallada = descripcion_detallada;
    }

    public String getFecha_inicial() {
        return fecha_inicial;
    }

    public void setFecha_inicial(String fecha_inicial) {
        this.fecha_inicial = fecha_inicial;
    }

    public int getPrioridad() {
        return prioridad;
    }

    public void setPrioridad(int prioridad) {
        this.prioridad = prioridad;
    }
    
    public int getDuracionDias() {
        return duracion_dias;
    }

    public void setDuracionDias(int duracion_dias) {
        this.duracion_dias = duracion_dias;
    }

    public Estado getEstado() {
        return estado;
    }

    public void setEstado(Estado estado) {
        this.estado = estado;
    }


}

