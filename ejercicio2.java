public class ejercicio2 {
//declaro metodo main
	public static vold main(String arg[]){
//declaro variables
	int NumA =2;
	int NumB =1;
	int NumC =5;
	int NumD =3;

//Mostrar en pantalla las variables
	System.out.println("------Las Variables------");
	System.out.println("--El valor de NumA es:" +NumA);
	System.out.println("--El valor de NumB es:" +NumB);
	System.out.println("--El valor de NumC es:" +NumC);
	System.out.println("--El valor de NumD es:" +NumD);
	
// las letras toman valores diferentes

NumB = NumC;
	System.out.println("--El valor de NumB es ="  +NumC);
NumC = NumA;
	System.out.println("--El valor de NumC es ="  +NumA); 
NumA = NumD; 
	System.out.println("--El valor de NumA es ="  +NumD);
NumD = NumC;  
	System.out.println("--El valor de NumD es ="  +NumC);


}
}