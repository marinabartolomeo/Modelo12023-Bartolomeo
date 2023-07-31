
   
package ej19formnrosbart;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class EJ19FormNrosBart extends JFrame implements ActionListener{
    
private int promedio; 
private JLabel etiq, etiq1, etiq2, etiqProm;
private JButton boton, salida;
private JTextField nota1Field, nota2Field;
   
   
public EJ19FormNrosBart(){
    setLayout (null);
      
    //Crear la etiqueta
    etiq = new JLabel("CALCULE EL NUMERO MAYOR");
    etiq.setBounds(100,20,300,30);
    add(etiq);
    
    etiq1 = new JLabel("Ingrese el 1er. Número");
    etiq1.setBounds(25,80,300,30);
    add(etiq1);
     
    nota1Field = new JTextField();
    nota1Field.setBounds(180,80,60,30);
    add(nota1Field);
    
    etiq2 = new JLabel("Ingrese el 2ddo. Número ");
    etiq2.setBounds(25,130,300,30);
     add(etiq2);
       
    nota2Field = new JTextField();
    nota2Field.setBounds(180,130,60,30);
    add(nota2Field);
    
       
    etiqProm = new JLabel("" );
    etiqProm.setBounds(25,220,300,30);
    add(etiqProm);
    
    //mensaje de etiqueta
      boton = new JButton ("COMPARAR");
      boton.setBounds(130,175,110,30);
      add(boton);
      boton.addActionListener(this);
      
      salida = new JButton ("SALIR");
      salida.setBounds(230,270,110,30);
      add(salida);
      salida.addActionListener(this);
}     
      
    @Override
    public void actionPerformed(ActionEvent e) {
      if(e.getSource()==boton){     
        int nota1 = Integer.parseInt(nota1Field.getText());
        int nota2 = Integer.parseInt(nota2Field.getText());
        if (nota1 > nota2 ){
        etiqProm.setText("EL NUMERO MAS GRANDE ES: " + nota1);
        }else if (nota1 < nota2 ){
        etiqProm.setText("EL NUMERO MAS GRANDE ES: " + nota2);
        }else if (nota1 == nota2 ){
        etiqProm.setText("LOS NUMEROS SON IGUALES");
        }
        
      }else if(e.getSource()==salida){
          System.exit(0);
      }
      
    }
    public static void main(String[] args){
        EJ19FormNrosBart ford = new EJ19FormNrosBart();
        //tamaño
        ford.setBounds (0,0,400,350);
        //hacer visible formulario
        ford.setVisible(true);
        //centrar formulario
        ford.setLocationRelativeTo(null);
        //pedir la edicion del tamaño
        ford.setResizable(false);
        //titulo para el formulario
        ford.setTitle("Calcule el Número Mayor");
        
    }
}
