
package ejclase2106.operaciones;

import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

public class Cpadre {
    protected int valor1,valor2,resultado;
    ImageIcon logo = new ImageIcon("src/imagenes/logo.png");
    ImageIcon Icon= new ImageIcon("src/imagenes/signos.jpg");
    
    //Metodo para Bienvenida
    public void PedirDatos(){
      JOptionPane.showMessageDialog(null,
              "Podra realizar las operaciones con Herencia",
              "Bienvenidos a Calculin",
              JOptionPane.INFORMATION_MESSAGE, logo);
        
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
