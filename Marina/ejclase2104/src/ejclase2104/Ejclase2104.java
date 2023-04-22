package ejclase2104;

import java.util.Scanner;

public class Ejclase2104 {

    public static void main(String[] args) {
        // variables
       int resultado = 0, num = 0;
       Scanner leer = new Scanner (System.in);
       
       System.out.print("Ingrese un numero: ");
       
       num = leer.nextInt();
       
       for(int ini = num; ini <0; ini--){
        
        resultado= num *ini;
        
      System.out.println("Ini vale: " + ini+ "de " +num);
        
    }
       
    System.out.println(resultado);
    }  
}
//4)Mostrar y calcular el factorial de un numero (5)
//Ej factorial
//5! = 5* 4* 3* 2* 1*
// 3! = 3* 2* 1*