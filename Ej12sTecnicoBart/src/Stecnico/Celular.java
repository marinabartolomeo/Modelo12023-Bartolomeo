
package Stecnico;

import Servicios.Stecnico;
import java.util.Scanner;

public class Celular extends Stecnico{
    
    Scanner leer = new Scanner(System.in);

    
public void setCelular(String Celular) {
       
            System.out.println("--------------------------------------------");
            System.out.println("-----------REGISTRO del CELULAR-------------");
            System.out.println("--------------------------------------------");
            System.out.println("------------------D A T O S-----------------");
            System.out.println("MARCA :" +Marca);
            Marca=leer.nextLine();
            System.out.println("MODELO :" + Modelo);
            Modelo=leer.nextLine();
            System.out.println("--------------------------------------------");
            System.out.println("Elija el Tipo de Bateria :" + bateria);
            System.out.println("--------------1 - 3000ma 5hs. --------------");
            System.out.println("--------------1 - 4000ma 9hs. --------------");
            System.out.println("--------------1 - 7000ma 12hs. --------------");
            bateria=leer.nextLine();
            System.out.println("--------------------------------------------");
            System.out.println("DESPERFECTO :" + defecto);
            defecto=leer.nextLine();
            
           
    }
     }
         
           