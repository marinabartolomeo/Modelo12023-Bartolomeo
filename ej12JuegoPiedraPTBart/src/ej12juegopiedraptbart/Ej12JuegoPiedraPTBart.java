
package ej12juegopiedraptbart;

import java.util.Random;
import java.util.Scanner;



public class Ej12JuegoPiedraPTBart {

   
    public static void main(String[] args) {
        
     // Variables
     String resp1 ="";
     String resp12 ="";
     String resp13 ="";
     String resp2 ="";
     String resp22 ="";
     String resp23 ="";
     
     int numerorandom;
     int contador = 0;
     int punto1 = 0;
     int punto2 = 0;
     
     String jugador1 ="La Maquina";
     String jugador2 ="";
     Random RD = new Random();
     
     
     Scanner leer = new Scanner(System.in);   
     
     //numero random- comienza desde cero por eso se agrega el +1
        numerorandom = RD.nextInt(3)+1;
        
        //inicio del juego
        System.out.println("------------------------------------");
        System.out.println("Bienvenidos a Piedra, Papel o Tijera");
        System.out.println("------------------------------------");
        
        //pedir al tipito la opcion nombre
        System.out.println("Jugador 2 Ingrese su Nombre: ");
        jugador2 = leer.next();
        System.out.println("Jugador 1: La Maquina");
        //Dar inicio al juego
        System.out.println("------------------------------------");
        System.out.println("           INICIO DEL JUEGO         ");
        System.out.println("------------------------------------");
        System.out.println("-------------La P es Piedra---------");
        System.out.println("-------------La L es Papel----------");
        System.out.println("-------------La T es Tijera---------");
        System.out.println("------------------------------------");
        
               
        //Pedir al jugador que ingrese la opcion - JUGADA 1
        System.out.print("\nIntroducir la opcion P/L/T : \n" );
        resp1 = leer.next();
        
        //convertir los numeros en letras} 
        
        switch(numerorandom){
            
            case 0:resp2="P";
                break;
            case 1:resp2="L";
                break;
            case 2:resp2="T";
                break;
        }
        //JUGADA MAQUINA 1
         System.out.println("\nLa Opcion de La Maquina fue :\n" +resp2);
                 
         
        //logica del juego- Jugada 1
        if(resp1.equals("P") && resp2.equals("P")){
        if(resp2 == resp1)
        System.out.println("EMPATE!!!" );
        punto1+=0;
        punto2+=0;
    }
        if(resp1.equals("L") && resp2.equals("L")){
        if(resp2 == resp1)
        System.out.println("EMPATE!!!");
        punto1+=0;
        punto2+=0;
    }
        if(resp1.equals("T") && resp2.equals("T")){
        if(resp2 == resp1)
        System.out.println("EMPATE!!!");
        punto1+=0;
        punto2+=0;
    }
        if(resp1.equals("P") && resp2.equals("L")){
        System.out.println("GANADOR La Máquina!!!");
        System.out.println( "Gana 1 punto");
        punto1+=1;
    }
       if(resp1.equals("P") && resp2.equals("T")){
        System.out.println("GANADOR Jugador 2!!!" + jugador2);
        System.out.println("Gana 1 punto");
        punto2+=1;
    }
        if(resp1.equals("L") && resp2.equals("P")){
        System.out.println("GANADOR Jugador 2!!!" + jugador2);
        System.out.println("Gana 1 punto");
        punto2+=1;
    }
       if(resp1.equals("L") && resp2.equals("T")){
        System.out.println("GANADOR La Máquina!!!");
        System.out.println("Gana 1 punto");
        punto1+=1;
        
    }
        if(resp1.equals("T") && resp2.equals("L")){
        System.out.println("GANADOR Jugador 2!!!" + jugador2);
        System.out.println("Gana 1 punto");
        punto2+=1;
    }
       if(resp1.equals("T") && resp2.equals("P")){
        System.out.println("GANADOR La Máquina!!!");
        System.out.println("Gana 1 punto");
        punto1+=1;
    }
        
        if(punto1<punto2){
            System.out.println("------------------------------------");
            System.out.println("El ganador es el Jugador 2 : " +jugador2);
        }else if(punto1>punto2){
            System.out.println("------------------------------------");
            System.out.println("El ganador es el Jugador 1 : " +jugador1);
        }else if(resp2 == resp1){
            System.out.println("EMPATE: Ninguno Gana" +jugador2 +jugador1);
        }
    
        System.out.println("------------------------------------");
        System.out.println("-------------La P es Piedra---------");
        System.out.println("-------------La L es Papel----------");
        System.out.println("-------------La T es Tijera---------");
        System.out.println("------------------------------------");
       
        //Pedir al jugador que ingrese la opcion - JUGADA 2
        System.out.print("\nIntroducir la opcion P/L/T : \n" );
        resp12 = leer.next();
        
        //convertir los numeros en letras} 
        
        switch(numerorandom){
            
            case 0:resp22="P";
                break;
            case 1:resp22="L";
                break;
            case 2:resp22="T";
                break;
        }
        //JUGADA MAQUINA 2
         System.out.println("\nLa Opcion de La Maquina fue :\n" +resp22);
                 
         
        //logica del juego- Jugada 2
        if(resp12.equals("P") && resp22.equals("P")){
        if(resp22 == resp12)
        System.out.println("EMPATE!!!" );
        punto1+=0;
        punto2+=0;
    }
        if(resp12.equals("L") && resp22.equals("L")){
        if(resp22 == resp12)
        System.out.println("EMPATE!!!");
        punto1+=0;
        punto2+=0;
    }
        if(resp12.equals("T") && resp22.equals("T")){
        if(resp22 == resp12)
        System.out.println("EMPATE!!!");
        punto1+=0;
        punto2+=0;
    }
        if(resp12.equals("P") && resp22.equals("L")){
        System.out.println("GANADOR La Máquina!!!");
        System.out.println( "Gana 1 punto");
        punto1+=1;
    }
       if(resp12.equals("P") && resp22.equals("T")){
        System.out.println("GANADOR Jugador 2!!!" + jugador2);
        System.out.println("Gana 1 punto");
        punto2+=1;
    }
        if(resp12.equals("L") && resp22.equals("P")){
        System.out.println("GANADOR Jugador 2!!!" + jugador2);
        System.out.println("Gana 1 punto");
        punto2+=1;
    }
       if(resp12.equals("L") && resp22.equals("T")){
        System.out.println("GANADOR La Máquina!!!");
        System.out.println("Gana 1 punto");
        punto1+=1;
        
    }
        if(resp12.equals("T") && resp22.equals("L")){
        System.out.println("GANADOR Jugador 2!!!" + jugador2);
        System.out.println("Gana 1 punto");
        punto2+=1;
    }
       if(resp12.equals("T") && resp22.equals("P")){
        System.out.println("GANADOR La Máquina!!!");
        System.out.println("Gana 1 punto");
        punto1+=1;
    }
        
        if(punto1<punto2){
            System.out.println("------------------------------------");
            System.out.println("El ganador es el Jugador 2 : " +jugador2);
        }else if(punto1>punto2){
            System.out.println("------------------------------------");
            System.out.println("El ganador es el Jugador 1 : " +jugador1);
        }else if(resp22 == resp12){
            System.out.println("EMPATE: Ninguno Gana" +jugador2 +jugador1);
        }
    
        System.out.println("------------------------------------");
        System.out.println("-------------La P es Piedra---------");
        System.out.println("-------------La L es Papel----------");
        System.out.println("-------------La T es Tijera---------");
        System.out.println("------------------------------------");
       
       //Pedir al jugador que ingrese la opcion - JUGADA 3
        System.out.print("\nIntroducir la opcion P/L/T : \n" );
        resp13 = leer.next();
        
        //convertir los numeros en letras} 
        
        switch(numerorandom){
            
            case 0:resp23="P";
                break;
            case 1:resp23="L";
                break;
            case 2:resp23="T";
                break;
        }
        //JUGADA MAQUINA 1
         System.out.println("\nLa Opcion de La Maquina fue :\n" +resp23);
                 
         
        //logica del juego- Jugada 3
        if(resp13.equals("P") && resp23.equals("P")){
        if(resp23 == resp13)
        System.out.println("EMPATE!!!" );
        punto1+=0;
        punto2+=0;
    }
        if(resp13.equals("L") && resp23.equals("L")){
        if(resp23 == resp13)
        System.out.println("EMPATE!!!");
        punto1+=0;
        punto2+=0;
    }
        if(resp13.equals("T") && resp23.equals("T")){
        if(resp23 == resp13)
        System.out.println("EMPATE!!!");
        punto1+=0;
        punto2+=0;
    }
        if(resp13.equals("P") && resp23.equals("L")){
        System.out.println("GANADOR La Máquina!!!");
        System.out.println("Gana 1 punto");
        punto1+=1;
    }
       if(resp13.equals("P") && resp23.equals("T")){
        System.out.println("GANADOR Jugador 2!!!" + jugador2);
        System.out.println("Gana 1 punto");
        punto2+=1;
    }
        if(resp13.equals("L") && resp23.equals("P")){
        System.out.println("GANADOR Jugador 2!!!" + jugador2);
        System.out.println("Gana 1 punto");
        punto2+=1;
    }
       if(resp13.equals("L") && resp23.equals("T")){
        System.out.println("GANADOR La Máquina!!!");
        System.out.println("Gana 1 punto");
        punto1+=1;
        
    }
        if(resp13.equals("T") && resp23.equals("L")){
        System.out.println("GANADOR Jugador 2!!!" + jugador2);
        System.out.println("Gana 1 punto");
        punto2+=1;
    }
       if(resp13.equals("T") && resp23.equals("P")){
        System.out.println("GANADOR La Máquina!!!");
        System.out.println("Gana 1 punto");
        punto1+=1;
    }
        
        if(punto1<punto2){
            System.out.println("------------------------------------");
            System.out.println("El ganador es el Jugador 2 : " +jugador2);
        }else if(punto1>punto2){
            System.out.println("------------------------------------");
            System.out.println("El ganador es el Jugador 1 : " +jugador1);
        }else if(resp23 == resp13){
            System.out.println("EMPATE: Ninguno Gana" +jugador2 +jugador1);
        }
     
        System.out.println("------------------------------------");
        System.out.println("               PARTIDAS 3           ");
        System.out.println("------------------------------------");
        System.out.println("Jugador 1: " +jugador1+" : "+resp2+ " - "+resp22+ " - "+resp23);
        System.out.println("Jugador 2: " +jugador2+" : "+resp1+ " - "+resp12+ " - "+resp13);
        System.out.println("------------------------------------");
      
        if(punto1<punto2){
            System.out.println("------------------------------------");
            System.out.println("\"El ganador de todas las Partidas es: " +jugador2);
        }else {
            System.out.println("------------------------------------");
            System.out.println("El ganador de todas las Partidas es: la Maquina");
        }      
    }
}

