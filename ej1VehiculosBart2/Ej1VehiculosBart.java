
package ej1vehiculosbart;



import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

public class Ej1VehiculosBart {

    public static void main(String[] args) {
        String Auto="";
        String Moto="";
        String color="";
        String marca="";
        
       
        ImageIcon Icon = new ImageIcon ("src/imegenes/auto1.jpg");
        ImageIcon Icon1 = new ImageIcon ("src/imegenes/auto2.jpg");
        ImageIcon Icon2 = new ImageIcon ("src/imegenes/moto.jpg");
        ImageIcon Icon3 = new ImageIcon ("src/imegenes/moto1.jpg");
        
        // Construtor
        Auto V = new Auto();
        Moto M = new Moto();
        
        //Pedir
        
        V.marca();
        V.color();
        V.TicketAuto();
        
        M.marca();
        M.color();
        M.TicketMoto();
        
           JOptionPane.showOptionDialog(null,
           "Seleccione la opción deseada: ",
           "Autos - Motos",
           JOptionPane.YES_NO_CANCEL_OPTION,
           JOptionPane.QUESTION_MESSAGE,Icon,
           new Object[]{"Autos","Motos"},"");
        int Tipos = 0;
        
        switch(Tipos){
            case 0: 
                    V.marca();
                    V.color();
                    
            break;
            case 1: M.marca();
                    M.color();
            break;
        }
       
    
    }
    
}
