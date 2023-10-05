/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyecto;

/**
 *
 * @author HUMGARDEL
 */
public interface InterfazVista {
    void setControlador(ControlProyecto c);
    void arranca();
    
    //void getTexto(String descripcion_breve, String descripcion_detallada, String fecha_inicial, int prioridad, int duracion_dias);
    void setTexto(String descripcion_breve, String descripcion_detallada, String fecha_inicial, int prioridad, int duracion_dias);
    void escribeCambio(String s);
    
    static final String NTAREA="Nueva Tarea";
    static final String MODIF="Modificar";
    static final String ELIM="Eliminar";
    static final String INFO="Mostrar Informacion";
    static final String SHALL="Lista de Tareas";
    static final String CTAREA="Crear Nueva Tarea";
    
    
}
