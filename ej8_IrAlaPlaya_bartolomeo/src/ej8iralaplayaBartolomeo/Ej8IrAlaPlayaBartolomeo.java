
package ej8iralaplayaBartolomeo;

import java.util.Scanner;

public class Ej8IrAlaPlayaBartolomeo {

    
    public static void main(String[] args) {
        // Variables
        
       int temp = 0;
       String nombre;
       
       //scanner
      Scanner leer = new Scanner(System.in);
      Scanner leertemp = new Scanner(System.in);
       
       System.out.println("--------------------------------------------------");
       System.out.println("---------Bienvenido al Pronostico de Clima--------");        
       System.out.println("--------------------------------------------------");
       System.out.println("Ingrese su Nombre: ");
       nombre = leer.next();
       
       System.out.println("------------------------------------------------");
         System.out.println("Ingrese la Temperatura para Recibir un Consejo: ");
         System.out.println("------------------------------------------------");
         temp = leertemp.nextInt();  
       
       
       if (temp >= 30){
         System.out.println("------------------------------------------------");
         System.out.println("-------Hace mucho calor: Ir a la Playa!!!------ ");
         System.out.println("------------------------------------------------");  
       }else if (temp < 25 && temp >= 11){
         System.out.println("------------------------------------------------");
         System.out.println("--------Clima ideal: Ir a Caminar!!!----------- ");
         System.out.println("------------------------------------------------");  
       }else if (temp < 10){
         System.out.println("------------------------------------------------");
         System.out.println("--------Clima Frio: Abrigarse!!!----------- ");
         System.out.println("------------------------------------------------"); 
         
                 
       }
    }
    
}


/*Crear un proyecto que pida la temperatura en pantalla y
dependiendo los grados imprimir en pantalla acción.
Pedir Nombre y dato de la temperatura 

mayor o igual  a 30 grados ir a la playa
menor a 25 grados ir a caminar
menor de 10 grados abrigarse

Imprimir nombre , temperatura y Acción 

Subir a repositorio y subir al ejercicio*/