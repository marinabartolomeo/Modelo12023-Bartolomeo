package ej10switchticketbartolomeo;

import java.util.Scanner;

public class Ej10SwitchTicketBartolomeo {

    public static void main(String[] args) {
        // Variables
     int importe;
     int opcion;
     int tarjeta;
     int numero;
     int imptotalefect;
     int imptotaldebito;
     int imptotalcredito;
     int importefinal;
     int importefinal2;
     int importefinal3;
     int cuota1;
     int cuota2;
     int cuota3;
     
       //Scanner.
        Scanner leerimporte = new Scanner(System.in);
        Scanner leeropcion = new Scanner(System.in);
        Scanner leertarjeta = new Scanner(System.in);
        Scanner leerimptotalefect = new Scanner(System.in);
        Scanner leerimptotaldebito = new Scanner(System.in);
        Scanner leerimptotalcredito = new Scanner(System.in);
        Scanner leerimportefinal = new Scanner(System.in);
        Scanner leerimportefinal2 = new Scanner(System.in);
        Scanner leerimportefinal3 = new Scanner(System.in);
        Scanner leercuota1 = new Scanner(System.in);
        Scanner leercuota2 = new Scanner(System.in);
        Scanner leercuota3 = new Scanner(System.in);
        
        
        System.out.println("---------------------------------");
        System.out.println("---------Ticket de Compra--------");        
        System.out.println("---------------------------------");
        System.out.println("------Ingrese Importe Total------");
	importe = leerimporte.nextInt();
        
        System.out.println("---------------------------------");
        System.out.println("--------Opciones de Pago:--------");
        System.out.println("---------------------------------");
        System.out.println("------------1 Efectivo-----------");
        System.out.println("------------2 Debito-------------");
        System.out.println("------------3 Credito------------");
        System.out.println("---------------------------------");
        System.out.println("------Ingrese una opion de Pago--");
	opcion = leerimporte.nextInt();
              
        //Pagar con tarjeta en cuotas
        System.out.println("---------------------------------");
        System.out.println("--------Cantidad de Cuotas-------");
        System.out.println("---------------------------------");
        System.out.println("------------1 En 1 Cuota---------");
        System.out.println("------------2 En 2 Cuotas--------");
        System.out.println("------------3 En 3 Cuotas--------");
        System.out.println("---------------------------------");
        System.out.println("------Ingrese una opion para calcular el importe por cuota--");
	opcion = leerimporte.nextInt();
               
        
        //logica del switch- con tarjeta pedir numero
        switch (opcion){
            case 1:
        System.out.println("En Efectivo tiene un 40% de descuento"); 
        imptotalefect = importe *40 / 100;
        importefinal = importe - imptotalefect;
        System.out.println("El Total a pagar es:" + importefinal); 
        break;
               
            case 2:
        System.out.println("Con Debito tiene un 10% de recargo");         
        System.out.println("Ingrese el numero de tarjeta de Debito");
	tarjeta = leertarjeta.nextInt();
        imptotaldebito = +importe *10 / 100;
        importefinal2 = importe + imptotaldebito;
        System.out.println("El Total a pagar es:" + importefinal2);
        break;
        
            case 3:
        System.out.println("Con Credito tiene un 20% de recargo");                
        System.out.println("Ingrese el numero de tarjeta de Credito");
	tarjeta = leertarjeta.nextInt();
        imptotalcredito = +importe *20 / 100;
        importefinal3 = importe + imptotalcredito;
        System.out.println("El Total a pagar es:" + importefinal3);
        cuota1 = importefinal3;
        System.out.println("El Total a pagar en 1 cuota es:" + cuota1);
        cuota2 = importefinal3 / 2;
        System.out.println("El Total a pagar en 2 cuotas es:" + cuota2);
        cuota3 = importefinal3 / 3;
        System.out.println("El Total a pagar en 3 cuotas es:" + cuota3);
        break;
        
        default:
               System.out.println("Elija del 1 al 3 la opcion correcta");
           break;
        
        
        }
                     
        }             
    }
  
   