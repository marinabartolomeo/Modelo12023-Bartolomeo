
package ej4.variables.bartolomeo;

/**
 *
 * @author Marina
 */
public class Ej4VariablesBartolomeo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Variables

	int N;
	double A;
	char C;
	double sumar;
	double restar;

	//Declaramos las variables
    N= 2;
    A= (int) 1.5;
    C= 54;
    System.out.println("---variable N:" + N);
    System.out.println("---variable A:" + A);
    System.out.println("---variable C:" + C);
    
   //Suma
   sumar= N + A;
   System.out.println("---La suma de N + A:" + sumar);
   
   //Resta
   restar= A - N;
   System.out.println("---La resta de A - N:" + restar);
   
   //valor de C
   System.out.println("---El valor de C:" + C);
    }
    
}


//Escribe un programa Java que realice lo siguiente: declarar una variable N de tipo int, una variable A de tipo double y una variable C de tipo char y asigna a cada una un valor. A continuación, muestra por pantalla:
//El valor de cada variable.
//La suma de N + A
//La diferencia de A - N
//El valor numérico correspondiente al carácter que contiene la variable C.
//Si por ejemplo le hemos dado a N el valor 5, a A el valor 4.56 y a C el valor ‘a’, se debe mostrar por pantalla:
//Variable N = 5
//Variable A = 4.56
//Variable C = a
//5 + 4.56 = 9.559999999999999
//4.56 - 5 = -0.4400000000000004
//Valor numérico del carácter a = 97
