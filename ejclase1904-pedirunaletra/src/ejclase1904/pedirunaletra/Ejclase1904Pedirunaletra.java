
package ejclase1904.pedirunaletra;

import java.util.Scanner;

public class Ejclase1904Pedirunaletra {

     
    public static void main(String[] args) {
        //Variables
       String letra;
      
       
       //Scanner.
        Scanner leer = new Scanner(System.in);
           

        System.out.println("----------------------------------");
        System.out.println("Elija una letra del abecedario para saber si es vocal o consonante");
        System.out.println("----------------------------------");
        letra = leer.nextLine();
                
        //logica del switch
        switch (letra)
        {
            //Vocales - Abiertas
            case "a":
            case "A":
            case "e":
            case "E":
            case "o":
            case "O":
                System.out.println("Son Vocales Abiertas");
            break;
            
            //Vocales - Cerradas
            
            case "i":
            case "I":
            case "u":
            case "U":
                System.out.println("Son Vocales Cerradas");
            break;
            
            default:
                System.out.println("Son Consonantes");
            break;
          
        }             
    }
  
}   
        
    
    

