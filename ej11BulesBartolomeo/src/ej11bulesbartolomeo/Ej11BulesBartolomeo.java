package ej11bulesbartolomeo;


public class Ej11BulesBartolomeo {

  
    public static void main(String[] args) {
         //variables
        int Acontador = 1;
        int Bcontador = 1;
        int Ccontador = 1;
        
     //for-contador
     
     for (Acontador = 1; Acontador <= 100; Acontador++){
        System.out.println(Acontador);
        }
     System.out.println("Contador For");
     System.out.println("---------------------------------");    
    

    //While-contador
     while( Bcontador <100){
        System.out.println(Bcontador);
        Bcontador++;
    }
     System.out.println("Contador While");
     System.out.println("---------------------------------"); 
    
     
    //Do while - contador
        
        do{
       System.out.println(Ccontador);
        Ccontador++;     
     }while(Ccontador <= 100);
        
     System.out.println("Contador Do While");
     System.out.println("---------------------------------"); 
    
    }
    
}
