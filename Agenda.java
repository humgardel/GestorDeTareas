/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyecto;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
//import java.util.Calendar;

/**
 *
 * @author usuario1
 */
public class Agenda {
    protected ArrayList<Tarea> tareas;
    
    public Agenda(){
        this.tareas=new ArrayList<Tarea>();
    }
    
    public Agenda(String direccion_archivo){
        this.tareas=new ArrayList<Tarea>();
        this.cargar(direccion_archivo);
    }
    
    public ArrayList<Tarea> getTareas(){
        return this.tareas;
    }
    
    //ordenacion por burbuja, ordena de menor a mayor segun la fecha de las tareas
    /*public void ordenar_tareas()
    {
        for(int i = 0; i < tareas.size() - 1; i++)
        {
            for(int j = 0; j < tareas.size() - 1; j++)
            {
                if (tareas.get(j).getFecha_inicial().after(tareas.get(j+1).getFecha_inicial()))
                {
                    Tarea tmp = tareas.get(j+1);
                    tareas.set(j+1, tareas.get(j));
                    tareas.set(j, tmp);
                }
            }
        }       
    }*/
    
    public ArrayList<Tarea> lista_Tareas(Tarea.Estado estado){
        ArrayList<Tarea> lista=new ArrayList<Tarea>();
        for(Tarea t:tareas){
            if(t.getEstado()==estado)
                lista.add(t);
        }
        
        return lista;
    }
    
    public void cargar(String direccion_archivo){
        try{
            File fichero=new File(direccion_archivo);
            FileReader flujoLectura=new FileReader(fichero);
            BufferedReader flujoBuffer=new BufferedReader(flujoLectura);
            
            String linea;
            String descripcion_breve;
            String descripcion_detallada;
            int prioridad;
            /*int dia;
            int mes;
            int anno;*/
            String fecha;
            int duracion;
            Tarea.Estado estado;
            int estado_aux;
            Tarea tarea;
            
            String[] atributos;
           
            while((linea=flujoBuffer.readLine())!=null){
                try{
                    atributos=linea.split(",");
                    
                    descripcion_breve=extraer_valor(atributos[0]);
                    descripcion_detallada=extraer_valor(atributos[1]);
                    /*dia=Integer.parseInt(extraer_valor(atributos[2]));
                    mes=Integer.parseInt(extraer_valor(atributos[3]));
                    anno=Integer.parseInt(extraer_valor(atributos[4]));*/
                    fecha=extraer_valor(atributos[2]);
                    //fecha.set(anno, mes, dia);
                    prioridad=Integer.parseInt(extraer_valor(atributos[3]));
                    duracion=Integer.parseInt(extraer_valor(atributos[4]));                    
                    estado_aux=Integer.parseInt(extraer_valor(atributos[5]));
                    switch(estado_aux){
                        case 1:
                            estado=Tarea.Estado.pendiente;
                            break;
                        case 2:
                            estado=Tarea.Estado.cumplido;
                            break; 
                        case 3:
                            estado=Tarea.Estado.vencido;
                            break;
                        default:
                            estado=Tarea.Estado.pendiente;
                    }
                        
                   
                    tarea=new Tarea(descripcion_breve, descripcion_detallada, fecha, prioridad, duracion);
                    tarea.setEstado(estado);
                    tareas.add(tarea);
                }
                catch(Exception e){
                    System.out.println("El formato del archivo es incorrecto o no incluye toda la informacion esperada");
                }
            }
            
            
            flujoBuffer.close();
        }
        catch(FileNotFoundException e){
            System.out.println("El archivo no fue encontrado");
        }         
        catch(IOException e){
            System.out.println(e.getMessage());
        }
    }
    
    public void salvar(String direccion_archivo){
        try{
            File fichero=new File(direccion_archivo);
            FileWriter flujoEscritura=new FileWriter(fichero);
            BufferedWriter flujoBuffer=new BufferedWriter(flujoEscritura);
            
            Tarea tarea;
            String linea;
            
            for(int i=0;i<tareas.size();i++){
                tarea=tareas.get(i);                
                linea="<"+tarea.getDescripcionBreve()+">,"+
                      "<"+tarea.getDescripcion_detallada()+">,"+ 
                      "<"+tarea.getFecha_inicial()/*.get(Calendar.DAY_OF_MONTH)*/+">,"+
                      //"<"+tarea.getFecha_inicial().get(Calendar.MONTH)+">,"+
                      //"<"+tarea.getFecha_inicial().get(Calendar.YEAR)+">,"+
                      "<"+tarea.getPrioridad()+">,"+ 
                      "<"+tarea.getDuracionDias()+">,"+ 
                      "<"+(tarea.getEstado().ordinal()+1)+">";
                
                flujoBuffer.write(linea);
                flujoBuffer.newLine();
            }
           
            flujoBuffer.close();
        }
        catch(FileNotFoundException e){
            System.out.println("El archivo no fue encontrado");
        }         
        catch(IOException e){
            System.out.println(e.getMessage());
        }       
        
    }
    
    private String extraer_valor(String cadena){
        return cadena.substring(1, cadena.length()-1);
    }
    
    public void nuevaTarea(String descripcion_breve, String descripcion_detallada, String fecha_inicial, int prioridad, int duracion_dias){
        tareas.add(new Tarea(descripcion_breve, descripcion_detallada, fecha_inicial, prioridad, duracion_dias));
    }
    
    public void modificar(int coord, Tarea element){
        tareas.set(coord, element);
    }
    
    public void eliminar(int coord){
        tareas.remove(coord);
    }
    
    public void mostrarInformacion(){
        tareas.toString();
    }
    
    public void listaTareas(){
        tareas.toArray();
    }
}
