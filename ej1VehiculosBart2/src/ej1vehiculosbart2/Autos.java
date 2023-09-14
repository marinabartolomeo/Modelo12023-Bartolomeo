
package ej1vehiculosbart2;

import javax.swing.ImageIcon;
import javax.swing.JOptionPane;


public class Autos {
     String marcas="";
     String tipos="";
     
    
ImageIcon Icon = new ImageIcon ("src/imegenes/auto1.jpg");
ImageIcon Icon1 = new ImageIcon ("src/imegenes/auto2.jpg");
    
    String [] marca = {"Chevrolet","Fiat","Ford"};
    String [] tipo= {"Base","Full"};
        

    //Marcas
        public void marcasA(){
        marcas = (String)JOptionPane.showInputDialog(null,
           "Seleccione el Modelo: ",
           "Marcas",
           JOptionPane.QUESTION_MESSAGE,Icon,marca,marca);
        }
           
        public void tiposA(){
        tipos = (String)JOptionPane.showInputDialog(null,
           "Seleccione el Tipo: ",
           "Tipos",
           JOptionPane.QUESTION_MESSAGE,Icon,tipo,tipo);
         }
        
        public void impresionA(){
         JOptionPane.showOptionDialog(null,
           "Marca Elegida: " + marcas+"\n Tipo de Vehiculo; "+tipos,
           "Vehiculos",
           JOptionPane.YES_NO_CANCEL_OPTION,
           JOptionPane.QUESTION_MESSAGE,Icon,
           new Object[]{"Impresion Elección"},"");
        }
}

