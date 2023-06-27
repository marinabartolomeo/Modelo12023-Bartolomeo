
package ej12stecnicobart;

import Stecnico.Celular;
import Stecnico.Joystick;
import Stecnico.Tablet;


import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

public class Ej12sTecnicoBart {

   
    public static void main(String[] args) {
      
        int servicio = 0;
        
        ImageIcon logo = new ImageIcon("src/imagenes/stecnico.png");
        ImageIcon logo1 = new ImageIcon("src/imagenes/stecnico1.png");
        
         JOptionPane.showInternalMessageDialog(null,
                "Para comenzar le solicitaremos que complete el registro",
                "Servicio Tecnico LOS PATOS",
                JOptionPane.QUESTION_MESSAGE,logo1);
         
         
         servicio = JOptionPane.showOptionDialog(null,
             "Elija el Produto que quiere Arreglar",
              "Servicio Tecnico LOS PATOS",
             JOptionPane.YES_NO_CANCEL_OPTION,
             JOptionPane.QUESTION_MESSAGE,logo1,
             new Object[]{"Celular","Tablet","Joystick"},null)+1;
      
        if(servicio ==1){
                    Celular msjs = new Celular();
                    msjs.PedirDatos();
                    msjs.imprimir();
                    
             }if(servicio ==2){
                    Tablet msjr = new Tablet();
                    msjr.PedirDatos();
                    msjr.imprimir();
                    
            }if(servicio ==3){
                    Joystick msjm = new Joystick();
                    msjm.PedirDatos();
                    msjm.imprimir();
        
    }
            
    }
    
}
