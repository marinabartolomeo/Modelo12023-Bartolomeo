package ej9ticketrestobartolomeo;

import java.util.Scanner;

public class Ej9TicketRestoBartolomeo {

  public static void main(String[] args) {
        // Variables
     String nombre = "";
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
        Scanner leernombre = new Scanner(System.in);
       
        
        
        System.out.println("=================================");
        System.out.println("            BIENVENIDOS          ");
        System.out.println("     RESTAURANTE CFP Nro.36      ");
        System.out.println("  Zavaleta 204, , C1437EYF CABA  ");        
        System.out.println("=================================");
        
        System.out.println("Ingrese el Nombre del Mozo que lo Atendio: ");
	nombre = leernombre.next();
        
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
	opcion = leeropcion.nextInt();
                  
                       
        //logica del switch- con tarjeta pedir numero
        switch (opcion){
            case 1:
        System.out.println("En Efectivo tiene un 30% de descuento"); 
        imptotalefect = importe *30 / 100;
        importefinal = importe - imptotalefect;
        System.out.println("El Total a pagar es:" + importefinal); 
        break;
               
            case 2:
        System.out.println("Con Debito tiene un 10% de descuento");         
        System.out.println("Ingrese el numero de tarjeta de Debito");
	tarjeta = leertarjeta.nextInt();
        imptotaldebito = +importe *10 / 100;
        importefinal2 = importe - imptotaldebito;
        System.out.println("El Total a pagar es:" + importefinal2);
        break;
        
            case 3:
        System.out.println("Con Credito tiene un 10% de recargo");                
        System.out.println("Ingrese el numero de tarjeta de Credito");
	tarjeta = leertarjeta.nextInt();
        imptotalcredito = +importe *10 / 100;
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
        
        System.out.println("=================================");
        System.out.println("Caja #1 - Ticket #1");
        System.out.println("Lo Atendio: " + nombre);
        System.out.println("30/04/2010 11:46:47AM");        
        System.out.println("=================================");
        System.out.println("1 Gaeosa");
        System.out.println("1 Milanesa Napolitana con fritas");
        System.out.println("1 Flan con Crema"); 
        System.out.println("1 Cafe");    
        System.out.println("=================================");
        System.out.println("------GRACIAS POR SU VISITA------");        
        System.out.println("=================================");
        
        }
        }
                     
       


/*Realizar un programa en el cual el resultado sea el ticket de un restaurante.
Que el usuario ingrese:
- Se ingrese el nombre del Mozo
- Se ingresar el total de lo consumido
- Seleccionar modalidad de pago
- Efectivo
- Tarjeta de crédito
- Tarjeta de débito
. En el caso de ser de crédito ingresar los números
- En el caso de ser de crédito ingresar cantidad de cuotas
- En el caso de ser de débito ingresar los números

Calcular descuento o interés según el medio de pago:
-Efectivo -30%
-Débito -10%
-Tarjeta Crédito +10%

Ejemplo del ticket:
=============================
RESTAURANTE CFP N°36
Zavaleta 204, , C1437EYF CABA
=============================
Caja # 1 - Ticket # 1
LO ATENDIO: XXXXXX
30/04/2010 11:46:47 AM
=============================
1 Gaseosa
1 Milanesa Napolitana con fritas
1 Flan con Crema
1 Cafe
=============================
SUBTOTAL XXXXXX
FORMA DE PAGO: XXXXXXX
NUMERO TARJETA :XXXXXXX(si pago con tarjeta)
CUOTAS: XX (si pago con tarjeta credito)
DESCUENTO: XXXXXX

TOTAL : XXXXXX

=============================
Gracias por su visita
=============================
 
*/