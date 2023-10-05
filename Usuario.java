/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyecto;

/**
 *
 * @author usuario1
 */
public class Usuario {
    protected String nombre;
    protected String contrasenna;
    protected Agenda agenda;
    
    public Usuario(String nombre, String contrasenna){
        this.nombre=nombre;
        this.contrasenna=contrasenna;
        this.agenda=new Agenda();
    }
    
    public String getNombre(){
        return this.nombre;
    }
    
    public void setNombre(String nombre){
        this.nombre=nombre;
    }
    
    public String getContrasenna(){
        return this.contrasenna;
    }
    
    public void setContrasenna(String contrasenna){
        this.contrasenna=contrasenna;
    }
    
    public Agenda getAgenda(){
        return this.agenda;
    }
    
    public void setAgenda(Agenda agenda){
        this.agenda=agenda;
    }
}
