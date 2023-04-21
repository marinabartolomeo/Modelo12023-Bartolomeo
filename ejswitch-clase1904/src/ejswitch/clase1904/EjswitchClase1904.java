
package ejswitch.clase1904;

import java.util.Scanner;

public class EjswitchClase1904 {

   
    public static void main(String[] args) {
        //Variables
       int dias;
       String mes = "";
       
       //Scanner.
        Scanner leerdia = new Scanner(System.in);
        Scanner leermes = new Scanner(System.in);
        
        
        
        System.out.println("--------Dias de la Semana---------");
        System.out.println("----------------------------------");
        System.out.println("------------1 Lunes---------------");
        System.out.println("------------2 Martes--------------");
        System.out.println("------------3 Miercoles-----------");
        System.out.println("------------4 Jueves--------------");
        System.out.println("------------5 Viernes-------------");
        System.out.println("------------6 Sabado--------------");
        System.out.println("------------7 Domingo-------------");
        System.out.println("----------------------------------");
        System.out.println("---Que dia es hoy de la semana?---");
        dias = leerdia.nextInt();
        
        //logica del switch
        switch (dias)
        {
            case 1:
                System.out.println("Arranca la semana, vamos por todo!");
            break;
            case 2:
                System.out.println("Hoy es un nuevo dia, con muchas oportunidades");
            break;
            case 3:
                System.out.println("Llegaste a la mitad");
            break;
            case 4:
                System.out.println("Vamos que falta menos");
            break;
            case 5:
                System.out.println("Ultimo dia, festejemos!!");
            break;
            case 6:
                System.out.println("Llego el fin de semana para que lo disfrutes como quieras");
            break;
            case 7:
                System.out.println("A juntar energia que mañana empieza la semana, animo!!");
            break;
            default:
                System.out.println("No es un dia de la semana, vuelve a intentarlo!!");
            break;
          
        }     
        
        
     //Cuantos dias tiene un mes   
        System.out.println("----------Meses del Año-----------");
        System.out.println("----------------------------------");
        System.out.println("------------1 Enero---------------");
        System.out.println("------------2 Febrero-------------");
        System.out.println("------------3 Marzo---------------");
        System.out.println("------------4 Abril---------------");
        System.out.println("------------5 Mayo----------------");
        System.out.println("------------6 Junio---------------");
        System.out.println("------------7 Julio---------------");
        System.out.println("------------8 Agosto--------------");
        System.out.println("------------9 Septiembre----------");
        System.out.println("-----------10 Octubre-------------");
        System.out.println("-----------11 Noviembre-----------");
        System.out.println("-----------12 Diciembre-----------");
        System.out.println("----------------------------------");
        System.out.println("Elija un mes para saber cuantos dias tiene");
        mes = leermes.nextLine();
        
        
        //logica del switch
        switch (mes)
        {
            
            //Grupo 28/29 dias
            case "Febrero":
                System.out.println("El mes que elegiste tiene 28 o 29 dias dependiendo del año");
            break;
            
            //Grupo 30 dias
            case "Abril":
            case "Junio":
            case "Septiembre":
            case "Noviembre":
                System.out.println("El mes que elegiste tiene 30 dias");
            break;
            
             //Grupo 31 dias
            case "Enero":
            case "Marzo":
            case "Mayo": 
            case "Julio":
            case "Agosto": 
            case "Octubre":
            case "Diciembre": 
                  System.out.println("El mes que elegiste tiene 31 dias");
            
            break;
            default:
                System.out.println("No es un dia del año, vuelve a intentarlo!!");
            break;
          
        }             
    }
  
}   
        
    
    
