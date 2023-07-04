
package ej13polimorfismobart;

import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import operaciones.Operaciones;
import operaciones.Resta;
import operaciones.Suma;

public class Ej13PolimorfismoBart {
   
    public static void main(String[] args) {
         
        int operacion = 0;
             
        ImageIcon logo = new ImageIcon("src/imagen/operaciones.png");
        ImageIcon logo1 = new ImageIcon("src/imagen/operaciones2.png");
        
         JOptionPane.showMessageDialog(null,
              "Podra realizar las operaciones con Herencia",
              "Bienvenidos a Calculin",
              JOptionPane.INFORMATION_MESSAGE, logo);
        
          operacion = JOptionPane.showOptionDialog(null,
             "Elija la Operacion que quiera Realizar",
              "Bienvenidos a Calculin",
             JOptionPane.YES_NO_CANCEL_OPTION,
             JOptionPane.QUESTION_MESSAGE,logo1,
             new Object[]{"Suma","Resta"},null)+1;
        
            if(operacion ==1){
                    Operaciones msjs = new Suma();
                    msjs.PedirDatos();
                    msjs.Operaciones();
                    msjs.MostrarResultados();
                    
             }if(operacion ==2){
                   Operaciones msjr = new Resta();
                    msjr.PedirDatos();
                    msjr.Operaciones();
                    msjr.MostrarResultados();
            }   
        }
        
    }
    
