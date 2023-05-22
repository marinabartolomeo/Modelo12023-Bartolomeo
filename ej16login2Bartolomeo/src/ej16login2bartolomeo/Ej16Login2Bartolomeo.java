package ej16login2bartolomeo;

import java.util.Scanner;
import javax.swing.JOptionPane;

public class Ej16Login2Bartolomeo {

 
    public static void main(String[] args) {
      //Variables  
        String User = "Marina";
        String Pass = "aa123";
        int intento = 0;
    Scanner leer = new Scanner(System.in);  

    
    do{
    JOptionPane.showMessageDialog(null,"Para ingresar le pediremos su Usuario y Contraseña","INFO", JOptionPane.INFORMATION_MESSAGE );    
     
    User = JOptionPane.showInputDialog(null,"Ingrese el Usuario", "INPUT", JOptionPane.QUESTION_MESSAGE);
    Pass = JOptionPane.showInputDialog(null,"Ingrese su Contraseña", "INPUT", JOptionPane.QUESTION_MESSAGE);
    
    
    if (User.equals("Marina")&& Pass.equals("aa123")){
       JOptionPane.showMessageDialog(null,"Acceso Correcto, BIENVENIDO","Mensaje de Informacion", JOptionPane.INFORMATION_MESSAGE ); 
       intento = leer.nextInt(); //guardo la entrada del usuario
       intento = 3;   
    }else {
        JOptionPane.showMessageDialog(null,"La Contraseña es incorrecta, intente nuevamente!!!","ERROR",JOptionPane.ERROR_MESSAGE);  
        intento = intento +1;
        if (intento == 3){
       JOptionPane.showMessageDialog(null,"La Contraseña es incorrecta, ACCESO DENEGADO!!!!!!","ERROR",JOptionPane.WARNING_MESSAGE);
    }
  
    }
    }while (intento < 3);
    
    }
}   
    