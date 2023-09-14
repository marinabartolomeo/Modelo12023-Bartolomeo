
package ej2autobart;

import javax.swing.ImageIcon;
import javax.swing.JOptionPane;


public class EJ2AutoBart {

    
    public static void main(String[] args) {
       String marcaA="";
       String modeloA="";
       String estadoA="";
       
       ImageIcon Icon = new ImageIcon ("src/imegenes/auto3.png");
       
       Auto A= new Auto();
               
       A.getDatosVehiculos();
       marcaA = A.dato1;
       modeloA = A.dato2;
       
       A.estadoAuto();
       estadoA = A.dato3;
       
       JOptionPane.showMessageDialog(null,
             "\n El vehiculo: \n" +marcaA+ "\n El modelo: \n"+modeloA+ "\n"+estadoA,"",JOptionPane.INFORMATION_MESSAGE,Icon);
    }
    
}
