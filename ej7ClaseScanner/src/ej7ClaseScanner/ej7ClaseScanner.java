package ej7ClaseScanner;


import java.util.Scanner;



public class ej7ClaseScanner {
    
  
 
    public static void main(String[] args) {
        
        //variables
        int num;
        int nac;
        int fecha;
        int resta;
        String nombre;
        String apellido;
        
        //datos neesarios
        fecha = 2023;
        //crear objeto Sacanner
        Scanner lector = new Scanner(System.in);
               
       //pedir datos
       System.out.print("Ingrese su Nombre: ");
       nombre = lector.nextLine();
       System.out.print("Ingrese su Apellido: ");
       apellido = lector.nextLine();
       System.out.print("Ingrese el año de su nacimeinto: ");
       nac = lector.nextInt();
       
       // Resta
       resta = fecha - nac;
               
       //Imprime la edad en pantalla
       System.out.println("---edad---:" + resta);
               
        
    }
    
}


