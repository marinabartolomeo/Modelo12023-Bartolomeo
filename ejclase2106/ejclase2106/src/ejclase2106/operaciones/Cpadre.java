
package ejclase2106.operaciones;

import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

public class Cpadre {
    protected int valor1,valor2,resultado;
    int operacion = 0;
    
    ImageIcon logo = new ImageIcon("src/imagen/operaciones.png");
    ImageIcon Icon= new ImageIcon("src/imagen/operaciones2.png");
    
    //Metodo para Bienvenida
    public void PedirDatos(){
     
      String v1 = (String) JOptionPane.showInputDialog(null, 
              "Ingrese el Primer Valor",
              "Calculin Sumas, Restas y Multiplicacion",
              JOptionPane.QUESTION_MESSAGE,
              Icon,
              null,
              "");
      
      String v2 = (String) JOptionPane.showInputDialog(null, 
              "Ingrese el Primer Valor",
              "Calculin Sumas, Restas y Multiplicacion",
              JOptionPane.QUESTION_MESSAGE,
              Icon,
              null,
              "");
      
      valor1 = Integer.parseInt(v1);
      valor2 = Integer.parseInt(v2);
      
    }
    //metodo para mostrar datos
    public void MostrarResultados(){
        JOptionPane.showMessageDialog(null,
              "El Resultado de la operacion fue: " + resultado,
              "El resultado de la operacion",
              JOptionPane.INFORMATION_MESSAGE, logo);
        
    }
    
    
    
}
