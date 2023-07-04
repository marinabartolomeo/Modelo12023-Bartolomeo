
package ej17botonesbart;

import java.awt.event.ActionEvent;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.event.AWTEventListener;
import java.awt.event.ActionListener;

public class Ej17BotonesBart extends JFrame {
private JLabel etiq;
private JButton Boton1,Boton2,Boton3;


public Ej17BotonesBart (){
      //indicar con coordenaas la ubicacion del form
      setLayout (null);
      
    //Crear la etiqueta
    etiq = new JLabel("PRESIONE UN BOTON");
    etiq.setBounds(130,50,300,30);
    add(etiq);
    
      //mensaje de etiqueta
      Boton1 = new JButton ("Botón 1");
      Boton2 = new JButton ("Botón 2");
      Boton3 = new JButton ("Botón 3");
      
      
      
      
      //ubicacion x , y , ancho, alto
      Boton1.setBounds(10,100,100,50);
      Boton1.setHorizontalAlignment(JLabel.HORIZONTAL);
      add(Boton1);
      Boton1.addActionListener(Presiono);
      
      Boton2.setBounds(140,100,100,50);
      Boton2.setHorizontalAlignment(JLabel.HORIZONTAL);
      add(Boton2);
      Boton2.addActionListener(Presiono);
      
      Boton3.setBounds(270,100,100,50);
      Boton3.setHorizontalAlignment(JLabel.HORIZONTAL);
      add(Boton3);
      Boton3.addActionListener(Presiono);
      
  }
ActionListener Presiono = new ActionListener(){
    @Override
     public void actionPerformed(ActionEvent e){
        if(e.getSource()==Boton1){
            etiq.setText("Presiono el Boton 1"+Boton1.getText());
            
        }else if(e.getSource()==Boton2){
            etiq.setText("Presiono el Boton 2"+Boton2.getText());
            
    }else {
            etiq.setText("Presiono el Boton 3"+Boton3.getText());
            
        }
    }
    };
    
    public static void main(String[] args) {
         Ej17BotonesBart ford = new Ej17BotonesBart();
        
        //tamaño
        ford.setBounds (0,0,390,200);
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

