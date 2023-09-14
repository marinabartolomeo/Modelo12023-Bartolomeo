
package ej1vehiculosbart2;

import javax.swing.ImageIcon;
import javax.swing.JOptionPane;


public class Ej1VehiculosBart2 {

    
    public static void main(String[] args) {
        String [] vehiculos={"Autos","Motos"};
              
       
        ImageIcon Icon = new ImageIcon ("src/imegenes/auto3.png");
       
        // Constructor
        Autos A = new Autos ();
        Motos M = new Motos ();
        
         int rodados = JOptionPane.showOptionDialog(null,
           "Seleccione la opción deseada: ",
           "Vehiculos",
           JOptionPane.YES_NO_CANCEL_OPTION,
           JOptionPane.QUESTION_MESSAGE,Icon,
           new Object[]{"Autos","Motos"},"");
        
        switch(rodados){
        case 0: 
            A.marcasA(); A.tiposA(); A.impresionA();
        break;
        
        case 1:
            M.marcasM(); M.tiposM(); M.impresionM();
        break;
        }
    }
}
           
       