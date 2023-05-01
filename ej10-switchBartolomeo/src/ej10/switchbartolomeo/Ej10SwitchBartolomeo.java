
package ej10.switchbartolomeo;

import java.util.Scanner;


public class Ej10SwitchBartolomeo {

 
    public static void main(String[] args) {
        
    // Variables
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
    
//Crear un programa que pida un importe y luego muestre opciones de pago:
//Efectivo
//Tarjeta Crédito
//Tarjeta Debito
//Si paga con tarjeta pedir números de la tarjeta 
//Si paga con tarjeta de crédito pedir cuotas hasta 3
//Efectivo descuento 40%
//Tarjeta Crédito 20% recargo
//Tarjeta Debito 10% recargo

//Mostrar total con recargos y modo de pago 

//Crear carpeta en el repositorio y subir el git