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
public class VentanaProyecto extends JFrame implements InterfazVista {
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
    
    public VentanaProyecto(){
        super("Gestor de Tareas");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        JPanel panelPrincipal = new JPanel();
        panelPrincipal.setLayout(new BorderLayout(200,200));
        
        //lista = new JTable();
        
        f1=new JFrame("Gestor de Tareas");
        
        
        /*txtdescripcion_breve = new JTextField(8);
        txtdescripcion_detallada = new JTextField(8);
        txtfecha_inicial = new JTextField(8);
        txtprioridad = new JTextField(8);
        txtduracion_dias = new JTextField(8);
        txtestado = new JTextField(8);
        JPanel panelaux= new JPanel(); 
        panelaux.add(txtdescripcion_breve);
        panelaux.add(txtdescripcion_detallada);
        panelaux.add(txtfecha_inicial);
        panelaux.add(txtprioridad);
        panelaux.add(txtduracion_dias);
        panelaux.add(txtestado);
        panelPrincipal.add(panelaux, BorderLayout.EAST);*/
        
        informacion= new JLabel("Pulse uno de los botones");
        JPanel panelaux2= new JPanel();
        panelaux2.add(informacion);
        panelPrincipal.add(panelaux2, BorderLayout.CENTER);
        
        //JScrollPane pane = new JScrollPane(lista);
        
        nuevaTarea = new JButton("Nueva Tarea");
        nuevaTarea.setActionCommand(NTAREA);
        modificar = new JButton("Modificar");
        modificar.setActionCommand(MODIF);
        eliminar = new JButton("Eliminar");
        eliminar.setActionCommand(ELIM);
        mostrarInformacion = new JButton("Mostrar Informacion");
        mostrarInformacion.setActionCommand(INFO);
        listaDeTareas = new JButton("Lista de Tareas");
        listaDeTareas.setActionCommand(SHALL);
        JPanel botonera = new JPanel();
        botonera.add(nuevaTarea);
        botonera.add(modificar);
        botonera.add(eliminar);
        botonera.add(mostrarInformacion);
        botonera.add(listaDeTareas);
        panelPrincipal.add(botonera, BorderLayout.SOUTH);
        getContentPane().add(panelPrincipal);
    }
    
    public void escribeCambio(String s){
        informacion.setText(s);
    }
    
    public void setTexto(String descripcion_breve, String descripcion_detallada, String fecha_inicial, int prioridad, int duracion_dias){
        /*descripcion_breve = txtdescripcion_breve.getText();
        descripcion_detallada = txtdescripcion_detallada.getText();
        fecha_inicial = txtfecha_inicial.getText();
        prioridad = Integer.parseInt(txtprioridad.getText());
        duracion_dias = Integer.parseInt(txtduracion_dias.getText());*/
        
    }
    
    public void setControlador(ControlProyecto c){
        nuevaTarea.addActionListener(c);
        modificar.addActionListener(c);
        eliminar.addActionListener(c);
        mostrarInformacion.addActionListener(c);
        listaDeTareas.addActionListener(c);
    }
    
    public void arranca(){
        pack();
        setLocationRelativeTo(null);
        setVisible(true);
    }
    
}
