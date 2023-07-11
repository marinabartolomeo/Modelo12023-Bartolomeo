
package ej20promediobart;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class EJ20PromedioBart extends JFrame implements ActionListener{
    
private int promedio; 
private JLabel etiq, etiq1, etiq2, etiq3, etiqProm;
private JButton boton;
private JTextField nota1Field, nota2Field, nota3Field;
   
   
public EJ20PromedioBart(){
    setLayout (null);
      
    //Crear la etiqueta
    etiq = new JLabel("INGRESE SUS NOTAS");
    etiq.setBounds(190,40,300,30);
    add(etiq);
    
    etiq1 = new JLabel("Ingrese la Primer Nota");
    etiq1.setBounds(25,80,300,30);
    add(etiq1);
     
    nota1Field = new JTextField();
    nota1Field.setBounds(180,80,60,30);
    add(nota1Field);
    
    etiq2 = new JLabel("Ingrese la Segunda Nota");
    etiq2.setBounds(25,130,300,30);
     add(etiq2);
       
    nota2Field = new JTextField();
    nota2Field.setBounds(180,130,60,30);
    add(nota2Field);
    
    etiq3 = new JLabel("Ingrese la Tercer Nota");
    etiq3.setBounds(25,180,300,30);
     add(etiq3);
    
    nota3Field = new JTextField();
    nota3Field.setBounds(180,180,60,30);
    add(nota3Field);
    
    etiqProm = new JLabel("EL PROMEDIO FINAL ES:" );
    etiqProm.setBounds(25,330,300,30);
    add(etiqProm);
    
    //mensaje de etiqueta
      boton = new JButton ("PROMEDIO");
      boton.setBounds(190,250,100,50);
      add(boton);
      boton.addActionListener(this);
}     
      
    @Override
    public void actionPerformed(ActionEvent e) {
      if(e.getSource()==boton){     
        int nota1 = Integer.parseInt(nota1Field.getText());
        int nota2 = Integer.parseInt(nota2Field.getText());
        int nota3 = Integer.parseInt(nota3Field.getText());
        promedio = (nota1 + nota2 + nota3) / 3;
        etiqProm.setText("EL PROMEDIO FINAL ES: " + promedio);
        }
    } 
    public static void main(String[] args){
        EJ20PromedioBart ford = new EJ20PromedioBart();
        //tamaño
        ford.setBounds (0,0,500,450);
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
