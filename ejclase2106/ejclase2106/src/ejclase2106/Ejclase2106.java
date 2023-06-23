
package ejclase2106;
import ejclase2106.operaciones.ChijaSuma;
import ejclase2106.operaciones.ChijaResta;
import ejclase2106.operaciones.ChijaMult;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
public class Ejclase2106 {

   
    public static void main(String[] args) {
        
        int operacion = 0;
        int suma = 0;
        int resta = 0;
        int mult =0;
        
        
        ImageIcon logo = new ImageIcon("src/imagenes/logo.png");
        
        
            operacion = JOptionPane.showOptionDialog(null,
             "Podra realizar elegir una operacion de Herencia",
              "Bienvenidos a Calculin",
             JOptionPane.YES_NO_CANCEL_OPTION,
             JOptionPane.QUESTION_MESSAGE,logo,
             new Object[]{"Suma","Resta","Multiplicacion"},null)+1;
        
            if(operacion ==1){
                    ChijaSuma msjs = new ChijaSuma();
                    msjs.PedirDatos();
                    msjs.Suma();
                    msjs.MostrarResultados();
                    
                    
            }if(operacion ==2){
                    ChijaResta msjr = new ChijaResta();
                    msjr.PedirDatos();
                    msjr.Resta();
                    msjr.MostrarResultados();
                    
            
            }if(operacion ==3){
                    ChijaMult msjm = new ChijaMult();
                    msjm.PedirDatos();
                    msjm.Mult();
                    msjm.MostrarResultados();
                    
            
       }
        
      /* switch(operaciones){
            case 0: ChijaSuma msjs = new ChijaSuma();
                    msjs.PedirDatos();
                    msjs.Suma();
                    msjs.MostrarResultados();
                    break;
                    
            case 1: ChijaResta msjr = new ChijaResta();
                    msjr.PedirDatos();
                    msjr.Resta();
                    msjr.MostrarResultados();
                    break;
            
            case 2: ChijaMult msjm = new ChijaMult();
                    msjm.PedirDatos();
                    msjm.Mult();
                    msjm.MostrarResultados();
                    break;
            default:
       }*/
        ChijaSuma msjs = new ChijaSuma();
        msjs.PedirDatos();
        msjs.Suma();
        msjs.MostrarResultados();
        
        ChijaResta msjr = new ChijaResta();
        msjr.PedirDatos();
        msjr.Resta();
        msjr.MostrarResultados();
        
        ChijaMult msjm = new ChijaMult();
        msjm.PedirDatos();
        msjm.Mult();
        msjm.MostrarResultados();
        
         
        }
        
    }
    

    
