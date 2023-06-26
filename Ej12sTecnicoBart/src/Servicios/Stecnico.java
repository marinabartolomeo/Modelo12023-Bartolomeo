
package Servicios;

import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

public class Stecnico {
    protected int Ncliente = 0;   
    protected String servicio, Celular,Tablet,Joystick,Marca, Modelo,bateria,defecto,imprimir;
    
    ImageIcon logo = new ImageIcon("src/imagenes/stecnico.png");
    ImageIcon logo1 = new ImageIcon("src/imagenes/stecnico1.png");
    ImageIcon Icon1 = new ImageIcon("src/imagenes/cliente.png");

   //Registro
    public void PedirDatos(){
    String v1 = (String) JOptionPane.showInputDialog(null,
              "Ingrese su Número de Cliente: ",
              "REGISTRO",
              JOptionPane.QUESTION_MESSAGE,Icon1,
              null,
              "");
    Ncliente = Integer.parseInt(v1);
         
    String v2 = (String) JOptionPane.showInputDialog(null, 
              "Ingrese la Marca: ",
              "MARCA",
              JOptionPane.QUESTION_MESSAGE,
              null,
              null,
              "");
   
    String v3 = (String) JOptionPane.showInputDialog(null, 
              "Ingrese el Modelo: ",
              "MODELO",
              JOptionPane.QUESTION_MESSAGE,
              null,
              null,
              "");
    
    int v4 = JOptionPane.showOptionDialog(null,
             "Seleccione el tipo de Bateria: ",
              "BATERIA",
             JOptionPane.YES_NO_CANCEL_OPTION,
             JOptionPane.QUESTION_MESSAGE,logo1,
             new Object[]{"3000ma 5hs","4000ma 9hs","7000ma 12hs"},"");
   
    
    String v5 = (String) JOptionPane.showInputDialog(null, 
              "Escriba brevemente el Desperfecto: ",
              "DESPERFECTO",
              JOptionPane.QUESTION_MESSAGE,
              null,
              null,
              "");
    }
       
    //metodo para mostrar datos
    public void imprimir() {
       
        JOptionPane.showOptionDialog(null,
            "Nro. del CLIENTE :"+Ncliente+"\n MARCA :"+Marca+"\n MODELO :"+Modelo+"\n BATERIA :"+bateria+"\n DESPERFECTO :"+defecto,
            "Registro del Celular",
            JOptionPane.YES_NO_CANCEL_OPTION,
            JOptionPane.QUESTION_MESSAGE,logo1,
            new Object[]{"IMPRIMIR REGISTRO"},"imprimir");
        
     }
    
}
    
 
