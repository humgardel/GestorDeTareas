/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyecto;
import java.awt.event.*;
/**
 *
 * @author HUMGARDEL
 */
public class ControlProyecto implements ActionListener{
    private InterfazVista vista;
    private Agenda modelo;
    private String descripcion_breve;
    private String descripcion_detallada;
    private String fecha_inicial;
    private int prioridad;
    private int duracion_dias;
    
    public ControlProyecto(InterfazVista vista, Agenda modelo){
        this.vista=vista;
        this.modelo=modelo;
    }
    
    public void actionPerformed(ActionEvent evento){
        if(evento.getActionCommand().equals(InterfazVista.NTAREA)){
            new VentanaNuevaTarea();
            
        }
        else if(evento.getActionCommand().equals(InterfazVista.CTAREA)){
            VentanaNuevaTarea a = new VentanaNuevaTarea();
            this.descripcion_breve = a.getdescripcion_breve();
            this.descripcion_detallada = a.getdescripcion_detallada();
            this.fecha_inicial = a.getfecha_inicial();
            this.prioridad = a.getprioridad();
            this.duracion_dias = a.getduracion_dias();
            modelo.nuevaTarea(descripcion_breve, descripcion_detallada, fecha_inicial, prioridad, duracion_dias);
        }
        else if(evento.getActionCommand().equals(InterfazVista.MODIF)){
            //new VentanaModificar();
            vista.escribeCambio("Seleccione primero una tarea");
            
        }
        else if(evento.getActionCommand().equals(InterfazVista.INFO)){
            //new VentanaMostrar();
            vista.escribeCambio("Seleccione primero una tarea");
        }
        
        else if(evento.getActionCommand().equals(InterfazVista.ELIM)){
            vista.escribeCambio("Seleccione primero una tarea");
        }
        
        else if(evento.getActionCommand().equals(InterfazVista.SHALL)){
            vista.escribeCambio("Por el momento no posee ninguna tarea");
        }
        else
            vista.escribeCambio("ERROR");
    }
}
