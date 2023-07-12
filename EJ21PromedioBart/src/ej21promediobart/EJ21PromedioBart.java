
package ej21promediobart;

import java.awt.Color;
import java.awt.Container;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

public class EJ21PromedioBart extends JFrame implements ActionListener{
    
private int promedio; 
private JLabel etiq, etiq1, etiq2, etiq3, etiqProm, nombre, grado, div,respuesta;
private JButton boton;
private JTextField nota1Field, nota2Field, nota3Field, nombreField, gradoField,divField; 
   
   
public EJ21PromedioBart(){
    setLayout (null);
      
    //Crear la etiqueta
    etiq = new JLabel("INGRESE SUS DATOS PARA SABER SU NOTA FINAL");
    etiq.setBounds(100,30,300,30);
    //add(etiq);
    
    
    nombre = new JLabel("Nombre y Apellido: ");
    nombre.setBounds(25,100,200,30);
    //add(nombre);
    
    nombreField = new JTextField();
    nombreField.setBounds(140,100,200,30);
    //add(nombreField);
    
    grado = new JLabel("Grado: ");
    grado.setBounds(25,140,200,30);
    //add(grado);
    
    gradoField = new JTextField();
    gradoField.setBounds(140,140,50,30);
    //add(gradoField);
    
    div = new JLabel("División: ");
    div.setBounds(25,180,200,30);
    //add(div);
    
    divField = new JTextField();
    divField.setBounds(140,180,50,30);
    //add(divField);
        
    etiq1 = new JLabel("Primer Nota: ");
    etiq1.setBounds(25,220,300,30);
    //add(etiq1);
     
    nota1Field = new JTextField();
    nota1Field.setBounds(140,220,50,30);
    //add(nota1Field);
    
    etiq2 = new JLabel("Segunda Nota");
    etiq2.setBounds(25,260,300,30);
    //add(etiq2);
       
    nota2Field = new JTextField();
    nota2Field.setBounds(140,260,50,30);
    //add(nota2Field);
    
    etiq3 = new JLabel("Tercer Nota");
    etiq3.setBounds(25,310,300,30);
    //add(etiq3);
    
    nota3Field = new JTextField();
    nota3Field.setBounds(140,310,50,30);
    //add(nota3Field);
    
    etiqProm = new JLabel("");
    etiqProm.setBounds(25,430,300,30);
    //add(etiqProm);
    
    respuesta = new JLabel();
    respuesta.setBounds(25,450,300,30);
    //add(respuesta);
    
    //mensaje de etiqueta
      boton = new JButton ("PROMEDIO");
      boton.setBounds(190,360,100,50);
      //add(boton);
      boton.addActionListener(this);
      
    Container pane1 = getContentPane();
    pane1.setLayout(null);
    pane1.add(etiq);
    pane1.add(nombre);
    pane1.add(grado);
    pane1.add(div);
    pane1.add(nombreField);
    pane1.add(gradoField);
    pane1.add(divField);
    pane1.add(etiq1);
    pane1.add(nota1Field);
    pane1.add(etiq2);
    pane1.add(nota2Field);
    pane1.add(etiq3);
    pane1.add(nota3Field);
    pane1.add(etiqProm);
    pane1.add(boton);
    pane1.add(respuesta);
    pane1.setBackground(Color.PINK);
    
    
    
}     
      
    @Override
    public void actionPerformed(ActionEvent e) {
      if(e.getSource()==boton){  
        String nombre = nombreField.getText();  
        String grado = gradoField.getText(); 
        String div = divField.getText();  
        int nota1 = Integer.parseInt(nota1Field.getText());
        int nota2 = Integer.parseInt(nota2Field.getText());
        int nota3 = Integer.parseInt(nota3Field.getText());
        promedio = (nota1 + nota2 + nota3) / 3;
        etiqProm.setText("EL PROMEDIO FINAL ES: " + promedio);
        
        if(promedio >=6){
            respuesta.setText("A APROBADO :) ");
        }else {
            respuesta.setText("A DESAPROBADO :( ");
        }
       
        JOptionPane.showMessageDialog(null,
                "Nombre y Apellido: " + nombreField.getText() + "\n"+
                "Grado:" + gradoField.getText()+ "\n"+
                "División:" + divField.getText()+ "\n"+
                "Usted " + respuesta.getText()+ "\n"+
                "Promedio: " + promedio,
                "NOTA FINAL",
                JOptionPane.INFORMATION_MESSAGE,null);
            }
    } 
    public static void main(String[] args){
        EJ21PromedioBart ford = new EJ21PromedioBart();
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
    
}

