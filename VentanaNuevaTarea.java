/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyecto;
import java.awt.*;
import java.util.Calendar;
import javax.swing.*;
/**
 *
 * @author HUMGARDEL
 */
public class VentanaNuevaTarea implements InterfazVista {
    private String descripcion_breve;
    private String descripcion_detallada;
    private String fecha_inicial;
    private int prioridad;
    private int duracion_dias;
    private JLabel lbldescripcion_breve;
    private JLabel lbldescripcion_detallada;
    private JLabel lblfecha_inicial;
    private JLabel lblprioridad;
    private JLabel lblduracion_dias;
    private JLabel lblestado;
    private JTextField txtdescripcion_breve;
    private JTextField txtdescripcion_detallada;
    private JTextField txtfecha_inicial;
    private JTextField txtprioridad;
    private JTextField txtduracion_dias;
    private JTextField txtestado;
    private JButton nuevaTarea;
    private JButton modificar;
    private JButton eliminar;
    private JButton mostrarInformacion;
    private JButton listaDeTareas;
    //private JTable lista;
    private JLabel informacion;
    
    JFrame f1;
    JPanel p1,p2;
    GridLayout gl42,gl21;
    FlowLayout fl;
    
    public VentanaNuevaTarea(){
        f1=new JFrame("Nueva Tarea");
        f1.setLocationRelativeTo(null);
        lbldescripcion_breve = new JLabel("Descripcion Breve");
        lbldescripcion_detallada = new JLabel("Descripcion Detallada");
        lblfecha_inicial = new JLabel("Fecha Inicial");
        lblprioridad = new JLabel("Prioridad");
        lblduracion_dias = new JLabel("Duracion (dias)");
        lblestado = new JLabel("Estado");
        
        txtdescripcion_breve = new JTextField(20);
        txtdescripcion_detallada = new JTextField(50);
        txtfecha_inicial = new JTextField();
        txtprioridad = new JTextField(8);
        txtduracion_dias = new JTextField(8);
        txtestado = new JTextField(8);
        
        nuevaTarea = new JButton("Agregar");
        nuevaTarea.setActionCommand(CTAREA);
        
        p1=new JPanel();
        p2=new JPanel();
        
        gl42=new GridLayout(8,2);
        gl21=new GridLayout(2,1);
        fl=new FlowLayout();

        p1.setLayout(gl42);
        p1.add(lbldescripcion_breve);
        p1.add(txtdescripcion_breve);
        p1.add(lbldescripcion_detallada);
        p1.add(txtdescripcion_detallada);
        p1.add(lblfecha_inicial);
        p1.add(txtfecha_inicial);
        p1.add(lblprioridad);
        p1.add(txtprioridad);
        p1.add(lblduracion_dias);
        p1.add(txtduracion_dias);
        p1.add(lblestado);
        p1.add(txtestado);

        p2.setLayout(fl);
        p2.add(nuevaTarea);
        
        

        f1.setLayout(gl21);
        f1.add(p1);
        f1.add(p2);
        f1.setSize(400,300);
        f1.setVisible(true);
    }
    
    public void escribeCambio(String s){
        informacion.setText(s);
    }
    
    public void setTexto(String descripcion_breve, String descripcion_detallada, String fecha_inicial, int prioridad, int duracion_dias){
        this.descripcion_breve = txtdescripcion_breve.getText();
        this.descripcion_detallada = txtdescripcion_detallada.getText();
        this.fecha_inicial = txtfecha_inicial.getText();
        this.prioridad = Integer.parseInt(txtprioridad.getText());
        this.duracion_dias = Integer.parseInt(txtduracion_dias.getText());
     
    }
    
    public String getdescripcion_breve(){
        return this.descripcion_breve;
    }
    
    public String getdescripcion_detallada(){
        return this.descripcion_detallada;
    }
    
    public String getfecha_inicial(){
        return this.fecha_inicial;
    }
    
    public int getprioridad(){
        return this.prioridad;
    }
    
    public int getduracion_dias(){
        return this.duracion_dias;
    }
    
    public void setControlador(ControlProyecto c){
        nuevaTarea.addActionListener(c);
        
    }
    
    public void arranca(){
        
    }
}
