package ej.clase140423.bartolomeo;

import java.util.Scanner;

public class EjClase140423Bartolomeo {

    public static void main(String[] args) {
        // TODO code application logic here
        
              
        Scanner entrada = new Scanner(System.in);
        String nombre ="";
        int area=0, antiguedad=0;
             
        
        System.out.println("----------------");
        System.out.println("---Liquidacion de vacaiones");
        System.out.println("----Tatooine S.A.");
        System.out.print("----------------");
        System.out.println("----------------");
        System.out.print("---Ingrese el nombre del Trabajador:" +nombre);
        nombre= entrada.nextLine();
        
        System.out.print("---Cantidad de años de servicio:" +antiguedad);
        antiguedad= entrada.nextInt();
        
        System.out.print("----------------");
        System.out.println("----------------");
        System.out.println("---01 = Departamento de Atencion al Cliente-------" );
        System.out.println("---02 = Departamento de Logistica---");
        System.out.println("---02 = Departamento de Gerencia---");
        System.out.print("----------------");
        System.out.println("----------------");
        
        System.out.print("---Ingrese el numero de area de trabajo al que pertenece:");
        area= entrada.nextInt();
        
         
// escribo las variables!! 
        
        If(area ==1){
            if(antiguedad ==1){
            System.out.print("Escriba su nombre:" + nombre "Antiguedad= " + antiguedad);    
            System.out.println("Del area de Atencion al Cliente");
            System.out.println("Tiene 6 dias de vacaciones");    
        
            }else if(antiguedad >=2 && antiguedad <=6){
            System.out.print("Escriba su nombre:" + nombre "antiguedad= " +antiguedad);    
            System.out.println("Del area de Atencion al Cliente");
            System.out.println("Tiene 14 dias de vacaciones");
            
            }else if(antiguedad >=7){
            System.out.print("Escriba su nombre:" +nombre "antiguedad" +antiguedad);    
            System.out.println("Del area de Atencion al Cliente");
            System.out.println("Tiene 20 dias de vacaciones");        
    }
    }
        
    If(area ==2){
            if(antiguedad ==1){
            System.out.print("Escriba su nombre:" + nombre "antiguedad=" + antiguedad);    
            System.out.println("Del area de Logistica");
            System.out.println("Tiene 7 dias de vacaciones");    
        
            }else if(antiguedad >=2 && antiguedad <=6) {
            System.out.print("Escriba su nombre:" +nombre "antiguedad=" +antiguedad);    
            System.out.println("Del area de atnion al cliente");
            System.out.println("Tiene 15 dias de vacaciones");
            
            }else if(antiguedad >=7) {
            System.out.print("Escriba su nombre:" +nombre "antiguedad=" +antiguedad);    
            System.out.println("Del area de atnion al cliente");
            System.out.println("Tiene 22 dias de vacaciones");        
    }    
    }
    If(area ==3){
            if(antiguedad ==1){
            System.out.print("Escriba su nombre:" +nombre "antiguedad=" +antiguedad);    
            System.out.println("Del area de Gerencia");
            System.out.println("Tiene 10 dias de vacaciones");    
        
            }else if(antiguedad >=2 && antiguedad <=6) {
            System.out.print("Escriba su nombre:" +nombre "antiguedad=" +antiguedad);    
            System.out.println("Del area de atnion al cliente");
            System.out.println("Tiene 20 dias de vacaciones");
            
            }else if(antiguedad >=7) {
            System.out.print("Escriba su nombre:" +nombre "antiguedad=" +antiguedad);    
            System.out.println("Del area de atnion al cliente");
            System.out.println("Tiene 30 dias de vacaciones");        
    }           
            
}
}
}


//Ejercicio:
//1) Liquidación de vacaciones empleados 

//    La empresa  Tatooine S.A solicita un sistema que determine los días de vacaciones a
//los que tiene derecho un trabajador, tomando en cuenta las siguientes características:
//Existen tres departamentos dentro de la empresa con sus respectivas claves: 


//1. Departamento de Atención al cliente. (Clave 1) 
//2. Departamento de Logística. (Clave 2) 
//3. Gerencia. (Clave 3)


//Trabajadores con clave 1(Atención al cliente):  

 //   Con 1 año de servicio, reciben 6 días de vacaciones. 

 //   Con 2 a 6 años de servicio, reciben 14 días de vacaciones. 
 ///   A partir de 7 años de servicio, reciben 20 días de vacaciones. 

//Trabajadores con clave 2(Logística): 
  //   Con 1 año de servicio, reciben 7 días de vacaciones.
  //   Con 2 a 6 años de servicio, reciben 15 días de vacaciones. 
  //   A partir de 7 años de servicio, reciben 22 días de vacaciones.

 //Trabajadores con clave 3(Gerencia): 
   //  Con 1 año de servicio, reciben 10 días de vacaciones. 
   //  Con 2 a 6 años de servicio, reciben 20 días de vacaciones. 
   //  A partir de 7 años de servicio, reciben 30 días de vacaciones.  


//2) Ejercicio para hacer en clase 
//Tomar diagrama de flujo y codificar en un proyecto nuevo

//Una vez realizado subir al repositorio y adjuntar el link del GIT