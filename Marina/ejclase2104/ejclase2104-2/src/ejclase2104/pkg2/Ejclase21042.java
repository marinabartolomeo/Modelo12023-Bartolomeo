
package ejclase2104.pkg2;

import java.util.Scanner;


public class Ejclase21042 {

    public static void main(String[] args) {
        // variables
  /*      int contarnumpar= 0;
        int contarimp= 0;         
        for(int ini = 0; ini <= 100; ini++){
        
          
    System.out.println("Mostrar numero " +ini);
        
        if(ini %2 == 0 ){
            contarnumpar ++;
        }else {
            contarimp ++;
        } 
        
    }
     System.out.println("cantidad de numeros pares son; " +contarnumpar);
     System.out.println("cantidad de numeros impares son; " +contarimp);


    
    //Multiplos de 3
    
    int num=0;
    Scanner leer = new Scanner (System.in);
    System.out.println("Ingrese un numero: ");
    num= leer.nextInt();
    
   for (int i =0; i<num; i++)
       
       if (i%3==0) {
       System.out.println("El numero " +i + "Es multiplo de 3");
       
       }else {
           System.out.println("El numero " +num + "No es multiplo de 3");
       }
   
  */ 
   
   //4)Mostrar y calcular el factorial de un numero (5)
   int num = 0;
   int resultado=0;
   Scanner leer = new Scanner (System.in);
    System.out.println("Ingrese un numero: ");
    num = leer.nextInt();
        
   for(int i = num; i >=1; i--){
   
   //5 = 5* 4* 3* 2* 1*
   if(resultado ==0){
   resultado=i;
   System.out.println(i);
   }else {
   resultado *=i;
   System.out.println(i);
   System.out.println(resultado);
   }
   }
   
     
    
    }
       }
     
      


        
 //  Ejercicio en clase
//1)Generar una escalera de numero de 1 a 100
//2)Ingresar números  y clasificar si son pares o no
//3)Recorrer un lote de números y determinar culés son números múltiples de 3

//4)Mostrar y calcular el factorial de un numero (5)
//5)Crear un programa que recorra del 1 a100 y informe al final del la cantidad de números prares e impares del lote.
