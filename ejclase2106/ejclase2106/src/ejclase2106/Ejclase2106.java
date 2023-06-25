
package ejclase2106;
import ejclase2106.operaciones.ChijaSuma;
import ejclase2106.operaciones.ChijaResta;
import ejclase2106.operaciones.ChijaMult;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
public class Ejclase2106 {

   
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
     
         
        }
        
    }
    

    
