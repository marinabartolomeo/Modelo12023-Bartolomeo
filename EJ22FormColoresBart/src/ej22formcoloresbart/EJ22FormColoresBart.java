
package ej22formcoloresbart;

import java.awt.Color;
import java.awt.Container;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class EJ22FormColoresBart extends JFrame implements ActionListener{
    
private JLabel etiq, col1, col2, col3, col4,col5;
private JButton boton, salida;
private JTextField TextField;
   
   
public EJ22FormColoresBart(){
    setLayout (null);
      
    //Crear la etiqueta
    etiq = new JLabel("ELIJA UN NUMERO PARA CAMBIAR DE COLOR");
    etiq.setBounds(35,35,300,30);
    add(etiq);
    
    col1 = new JLabel("1_Blanco");
    col1.setBounds(35,80,300,30);
    add(col1);
    
    col2 = new JLabel("2_Amarillo");
    col2.setBounds(35,100,300,30);
    add(col2);
    
    col3 = new JLabel("3_Naranja");
    col3.setBounds(35,120,300,30);
    add(col3);
    
    col4 = new JLabel("4_ROJO");
    col4.setBounds(35,140,300,30);
    add(col4);
    
    col5 = new JLabel("5_Magenta");
    col5.setBounds(35,160,300,30);
    add(col5);
     
    TextField = new JTextField();
    TextField.setBounds(90,230,150,30);
    add(TextField);
    
        
    //mensaje de etiqueta
      boton = new JButton ("ACEPTAR");
      boton.setBounds(40,300,100,30);
      add(boton);
      boton.addActionListener(this);
      
      salida = new JButton ("SALIR");
      salida.setBounds(190,300,110,30);
      add(salida);
      salida.addActionListener(this);
      
    Container panel = getContentPane();
        panel.setLayout(null);
        panel.add(col1);
        panel.add(col2);
        panel.add(col3);
        panel.add(col4);
        panel.add(col5);
        panel.add(etiq);
        panel.add(TextField);
        panel.add(boton);
      
}     
      
    @Override
    public void actionPerformed(ActionEvent e) {
        int numero = Integer.parseInt(TextField.getText());
        
      if(e.getSource()==boton){     
       Container panel = getContentPane();
       panel.setLayout(null);
       
      if (numero == 1){
          panel.setBackground(Color.WHITE);
      }else if (numero == 2){
          panel.setBackground(Color.YELLOW);
      }else if (numero == 3){
          panel.setBackground(Color.ORANGE);
      }else if (numero == 4){
          panel.setBackground(Color.RED);
      }else if (numero == 5){
          panel.setBackground(Color.MAGENTA);
      }
    }else if(e.getSource()==salida){
          System.exit(0);
      }
    }
    public static void main(String[] args){
        EJ22FormColoresBart ford = new EJ22FormColoresBart();
        //tamaño
        ford.setBounds (0,0,350,400);
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
