/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyecto;

import java.awt.*;
import javax.swing.*;

/**
 *
 * @author HUMGARDEL
 */
public class VentanaMostrar {
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
    
    public VentanaMostrar(){
        f1=new JFrame("Mostrar");
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
       
        f1.setLayout(gl21);
        f1.add(p1);
        f1.add(p2);
        f1.setSize(400,300);
        f1.setVisible(true);
    }
}
