
package ej22colorbart;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public abstract class EJ22ColorBart extends JFrame implements ActionListener{

    private JTextFiel colorTextField;
    private JLabel etiqueta, etiq, etiq1, etiq2, etiq3, etiq4, etiq5;
    private JPanel colorPanel;
    private JButton boton;
    
    
   public EJ22ColorBart(){
   setTitle("Cambio de Color");
   setSize(400,300);
   setLayout (new FlowLayout());
      
    //Crear la etiqueta
    etiq = new JLabel("ELIJA UN COLOR PARA MOSTRAR");
    etiq.setBounds(100,30,300,30);
    add(etiq);
    
    
    etiq1 = new JLabel("1 - ROJO");
    etiq1.setBounds(25,100,200,30);
    add(etiq1);
    
    etiq2 = new JLabel("2 - VERDE");
    etiq2.setBounds(25,100,200,30);
    add(etiq2);
    
    etiq3 = new JLabel("3 - AZUL");
    etiq3.setBounds(25,100,200,30);
    add(etiq3);
    
    etiq4 = new JLabel("4 - AMARILLO");
    etiq4.setBounds(25,100,200,30);
    add(etiq4);
    
    etiq5 = new JLabel("5 - NEGRO");
    etiq5.setBounds(25,100,200,30);
    add(etiq5);
    
    etiqueta = new JTextField();
    etiqueta.setBounds(140,100,200,30);
    add(etiqueta);
   
  boton = new JButton ("CAMBIAR");
      boton.setBounds(190,360,100,50);
      //add(boton);
      boton.addActionListener(this);
   };
  
    public static void main(String[] args) {
       EJ22ColorBart ford = new EJ22ColorBart();
        //tamaño
        ford.setBounds (0,0,500,550);
        //hacer visible formulario
        ford.setVisible(true);
        //centrar formulario
        ford.setLocationRelativeTo(null);
        //pedir la edicion del tamaño
        ford.setResizable(false);
        //titulo para el formulario
        ford.setTitle("BOTONES");
        
    }

    private void add(JTextFiel colorTextField) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
}
