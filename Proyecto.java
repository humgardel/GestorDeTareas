/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyecto;

import java.util.ArrayList;
import java.util.Date;

/**
 *
 * @author usuario1
 */
public class Proyecto {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Agenda agenda=new Agenda();
       agenda.cargar("‪‪‪C:\\Users\\HUMGARDEL\\Desktop\\agenda1");
       ArrayList<Tarea> tareas=agenda.getTareas();
       
       //todas las tareas
//        System.out.println("Todas las tareas");
//       for(int i=0;i<tareas.size();i++){
//           tareas.get(i).setDescripcionBreve("descripcion breve "+(i+1));
//       }
       
       //agenda.ordenar_tareas();
       agenda.salvar("‪‪‪C:\\Users\\HUMGARDEL\\Desktop\\agenda1");
    
////////////////////////////////////////////////

        Agenda modelo = new Agenda();
        
        InterfazVista vista = new VentanaProyecto();
        
        ControlProyecto control = new ControlProyecto(vista, modelo);
       
        vista.setControlador(control);
        
        vista.arranca();
    }
    //public static void main(String[] args) {
        /*SimpleTable2 frame = new SimpleTable2();
        frame.pack();
        frame.setVisible(true);
    }*/
    
}
