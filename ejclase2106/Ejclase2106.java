
package ejclase2106;
import ejclase2106.operaciones.ChijaSuma;
import ejclase2106.operaciones.ChijaResta;
import ejclase2106.operaciones.ChijaMult;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
public class Ejclase2106 {

   
    public static void main(String[] args) {
       ImageIcon logo = new ImageIcon("src/imagenes/logo.png");
        
        
            JOptionPane.showOptionDialog(null,
             "Podra realizar elegir una operacion de Herencia",
              "Bienvenidos a Calculin",
             JOptionPane.YES_NO_CANCEL_OPTION,
             JOptionPane.QUESTION_MESSAGE,logo,
             new Object[]{"Suma","Resta","Multiplicacion"},"Suma");
        
        
        
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
    
