
package ej1vehiculosbart2;

import javax.swing.ImageIcon;
import javax.swing.JOptionPane;


public class Motos {
    
      String marcas= "";
      String tipos= "";
    
    
ImageIcon Icon2 = new ImageIcon ("src/imegenes/moto.jpg");
ImageIcon Icon3 = new ImageIcon ("src/imegenes/moto1.jpg");
       
      String[]marca ={"Honda","Yamaha","BMW"};
      String[]tipo={"Base","FUll"};
        
      
        public void marcasM(){
        marcas=(String)JOptionPane.showInputDialog(null,
           "Seleccione el Modelo: ",
           "Marcas",
           JOptionPane.QUESTION_MESSAGE,Icon2,marca,marca);
        }
               
         public void tiposM(){
        tipos = (String)JOptionPane.showInputDialog(null,
           "Marca Seleccionada: "+marcas+ "\n Tipo de Moto:"+tipos,
           "Motos",
           JOptionPane.QUESTION_MESSAGE,Icon3,
           new Object[]{"Impresion de Selección"},"");
         }
         public void impresionM(){
         JOptionPane.showOptionDialog(null,
           "Marca Elegida: " + marcas+"\n Tipo de Moto; "+tipos,
           "Vehiculos",
           JOptionPane.YES_NO_CANCEL_OPTION,
           JOptionPane.QUESTION_MESSAGE,Icon3,
           new Object[]{"Impresion Elección"},"");
        }
}
    
