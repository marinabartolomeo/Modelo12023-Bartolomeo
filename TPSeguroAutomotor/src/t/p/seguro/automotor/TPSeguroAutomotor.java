
package t.p.seguro.automotor;


import java.util.Date;
import javax.swing.ImageIcon;
import javax.swing.JComboBox;
import javax.swing.JOptionPane;

public class TPSeguroAutomotor {

    public static void main(String[] args) {    
        //Variables
        int fecha=2023;
        
        int importeA = 500;
        int importeB = 1000;
        int importeC = 1500;
        int importeD = 2000;
        
        int RC = 1000;
        int TC = 2000;
        int RT = 3000;
        
               
        int coberAD=0;
        String coberturaT ="";
        String coberturaRT ="";
        int G = 300;
        int LD = 300;
        int AM = 300;
        int GPS = 300;
        
        int total;
        
        String marca;
        String modelos = "";
        Date fechaA = new Date ();

        //Logo
        ImageIcon Icon = new ImageIcon("src/imagenes/logo33.png");
        ImageIcon Icon1 = new ImageIcon("src/imagenes/ticket.png");
        ImageIcon Icon2 = new ImageIcon("src/imagenes/Logo2.png");
        
        ImageIcon Icon3 = new ImageIcon("src/imagenes/nombre.png");
        ImageIcon Icon4 = new ImageIcon("src/imagenes/celular.png");
        ImageIcon Icon5 = new ImageIcon("src/imagenes/mail.png");
        ImageIcon Icon6 = new ImageIcon("src/imagenes/logo.png");
        
        ImageIcon Icon7 = new ImageIcon("src/imagenes/logocitroen.png");
        ImageIcon Icon8 = new ImageIcon("src/imagenes/logoford.png");
        ImageIcon Icon9 = new ImageIcon("src/imagenes/logorenault.png");
        ImageIcon Icon10 = new ImageIcon("src/imagenes/logofiat.png");
        ImageIcon Icon11 = new ImageIcon("src/imagenes/logovw.png");
       
        
        
        JOptionPane.showMessageDialog(null,Icon,"Seguros Segurola",JOptionPane.PLAIN_MESSAGE);
        

        //Solicitud de datos
       
        String nombre = JOptionPane.showInputDialog(null,"Nombre del Cliente","Poliza",JOptionPane.QUESTION_MESSAGE);
        String apellido = JOptionPane.showInputDialog(null,"Apellido del Cliente ","Poliza",JOptionPane.QUESTION_MESSAGE);
        String telefono = JOptionPane.showInputDialog(null,"Telefono ","Poliza",JOptionPane.QUESTION_MESSAGE);
        String mail = JOptionPane.showInputDialog(null,"Mail ","Poliza",JOptionPane.QUESTION_MESSAGE);
       
        //Marcas
        String [] marcas ={"Renault","Fiat","Ford","Citroen","VW"};

        marca = (String) JOptionPane.showInputDialog(null,"Seleccione una Marca :","Vehiculos :",JOptionPane.QUESTION_MESSAGE,Icon6,marcas,marcas[0]);
        
        //Moelos
        
        String [] Renault = {"Sandero","Logan","Captur","Kicks","Twingo"};
        String [] Fiat = {"Uno","Mobi","Pulse","Argo","Cronos"};
        String [] Ford = {"Fiesta","Focus","Mondeo","KA","Falcon"};
        String [] Citroen = {"Picasso","Cactus","Aircross","C3","C4"};
        String [] VW = {"Polo","Nivus","Virtus","Taos","Vento"};
        
        if(marca.equalsIgnoreCase("Renault")){
            modelos = (String) JOptionPane.showInputDialog(null,"Selecione el modelo :" +marca , "Modelos:",JOptionPane.QUESTION_MESSAGE,Icon9,Renault,Renault[0]);
            
        }else if(marca.equalsIgnoreCase("Fiat")){
            modelos = (String) JOptionPane.showInputDialog(null,"Selecione el modelo :" +marca , "Modelos :",JOptionPane.QUESTION_MESSAGE,Icon10,Fiat,Fiat[0]);
            
        }else if(marca.equalsIgnoreCase("Ford")){
            modelos = (String) JOptionPane.showInputDialog(null,"Selecione el modelo :" +marca , "Modelos :",JOptionPane.QUESTION_MESSAGE,Icon8,Ford,Ford[0]);
            
        }else if(marca.equalsIgnoreCase("Citroen")){
            modelos = (String) JOptionPane.showInputDialog(null,"Selecione el modelo :" +marca , "Modelos :",JOptionPane.QUESTION_MESSAGE,Icon7,Citroen,Citroen[0]);
            
        }else if(marca.equalsIgnoreCase("VW")){
            modelos = (String) JOptionPane.showInputDialog(null,"Selecione el modelo :" +marca , "Modelos :",JOptionPane.QUESTION_MESSAGE,Icon11,VW,VW[0]);
            
        }
        
        
        //Dominio
        String dominio = JOptionPane.showInputDialog(null,"Ingrese Dominio ","Poliza",JOptionPane.QUESTION_MESSAGE);

        //Año de Antiguedad
        int antig = Integer.parseInt(JOptionPane.showInputDialog(null,"Ingrese Año de Antiguedad ","Poliza",JOptionPane.QUESTION_MESSAGE));
        int resultado = (fecha - antig);
      
        JOptionPane.showMessageDialog(null,"Antiguedad :"+" " + resultado + " " + "Años");
        
        if (resultado <= 5){
            JOptionPane.showMessageDialog(null,"Pagara un Extra de $500");
                    resultado = importeA;
        }else if ((resultado >= 5) && (resultado < 10)){
            JOptionPane.showMessageDialog(null,"Pagara un Extra de $1000");
                    resultado = importeB;
        }else if ((resultado >= 10) && (resultado < 15)){
            JOptionPane.showMessageDialog(null,"Pagara un Extra de $1500");
                    resultado = importeC;
        }else if ((resultado >= 15) && (resultado < 20)){
            JOptionPane.showMessageDialog(null,"Pagara un Extra de $2000");
                    resultado = importeD;
        }else if (resultado >= 20){
            JOptionPane.showMessageDialog(null,"No se Asegura su Auto");
        System.exit(0);
        }
   
         //Tipo de cobertura
        
       int cobertura = JOptionPane.showOptionDialog(null,
            "Seleccione la cobertura : \n Responsabilidad Civil: RC"+"\n Terceros Completo: TC"+"\n Riezgo Total: RT",
            "Poliza",
            JOptionPane.YES_NO_CANCEL_OPTION,
            JOptionPane.QUESTION_MESSAGE,Icon2,
            new Object[]{"RC","TC","RT"},"RC");

        switch(cobertura){
            case 0: JOptionPane.showMessageDialog(null,"Selecciono : Responsabilidad Civil");
            cobertura = RC;
            coberturaT ="Responsabilidad Civil";
            break;
            
            case 1: JOptionPane.showMessageDialog(null,"Selecciono : Terceros Completo");
            cobertura = TC;
            coberturaT ="Terceros Completo";
            break;
            
            case 2: JOptionPane.showMessageDialog(null,"Selecciono : Riezgo Total");
            cobertura = RT;
            coberturaRT ="Riezgo Total";
            break;

            default:      
        }
        
        //Cobertura Adicional
        int coberAD1 = JOptionPane.showOptionDialog(null,
            "Seleccione cobertura Adicional : ",
            "Poliza",
            JOptionPane.YES_NO_CANCEL_OPTION,
            JOptionPane.QUESTION_MESSAGE,Icon2,
            new Object[]{"Granizo","NO"},"");

            switch(coberAD1){
            case 0: JOptionPane.showMessageDialog(null,"Selecciono: Granizo");
            int contador = +1;
            break;

            default: 
            }
        int coberAD2 = JOptionPane.showOptionDialog(null,
            "Seleccione cobertura Adicional : ",
            "Poliza",
            JOptionPane.YES_NO_CANCEL_OPTION,
            JOptionPane.QUESTION_MESSAGE,Icon2,
            new Object[]{"Llantas Deportivas","NO"},"");
        int contador = 0;
            
            switch(coberAD2){
            case 0: JOptionPane.showMessageDialog(null,"Selecciono : Llantas Deportivas");
            contador+=1;
            break;
            }
        int coberAD3 = JOptionPane.showOptionDialog(null,
            "Seleccione cobertura Adicional : ",
            "Poliza",
            JOptionPane.YES_NO_CANCEL_OPTION,
            JOptionPane.QUESTION_MESSAGE,Icon2,
            new Object[]{"Asistencia Mecanica","NO"},"");
            
            switch(coberAD3){
            case 0: JOptionPane.showMessageDialog(null,"Selecciono : Asistencia Mecanica");
            contador+=1;
            break;
            }
        int coberAD4 = JOptionPane.showOptionDialog(null,
            "Seleccione cobertura Adicional : ",
            "Poliza",
            JOptionPane.YES_NO_CANCEL_OPTION,
            JOptionPane.QUESTION_MESSAGE,Icon2,
            new Object[]{"Localizador GPS","NO"},"");
            
            switch(coberAD4){
            case 0: JOptionPane.showMessageDialog(null,"Selecciono : Localizador GPS");
            contador+=1;
            break;
        }
            
            if(contador <2){
               JOptionPane.showMessageDialog(null,"Suma de adicional : " + 300);
               coberAD = 300;
               }else if(contador == 2 ){
               JOptionPane.showMessageDialog(null,"Suma de adicional : " + 300);
               coberAD = 300;
               }else if(contador >2){
               JOptionPane.showMessageDialog(null,"Suma de adicional : " + 600);
               coberAD = 600;
    }
            
            System.out.println("--------------------------------------------");
            System.out.println("---------------Presupuesto------------------");
            System.out.println("------------Seguros Segurola----------------");
            System.out.println("--------------------------------------------");
            System.out.println("------------Datos del usuario---------------");
            System.out.println("NOMBRE :" + nombre);
            System.out.println("APELLIDO :" + apellido);
            System.out.println("TELEFONO :" + telefono);
            System.out.println("MAIL :" + mail);
            System.out.println("-----------Datos del Vehiculo---------------");
            System.out.println("MARCA :" + marca);
            System.out.println("MODELO :" + modelos);
            System.out.println("DOMINIO :" + dominio);
            System.out.println("ANTIGUEDAD DEL VEHICULO :" + antig);
            System.out.println("--------------------------------------------");
            System.out.println("VALOR DE LA CUOTA :" + resultado);
            System.out.println("TIPO DE COBERTURA :" + coberturaT);
            System.out.println("VALOR DE COBERTURA :" + cobertura);
            System.out.println("VALOR DE ADICIONALES :" + coberAD );
            total = resultado + cobertura + coberAD;
            System.out.println("--------------------------------------------");
            System.out.println("VALOR DE LA PRIMA TOTAL :" + total );
            System.out.println("--------------------------------------------");
            System.out.println(fechaA);
            
            JOptionPane.showOptionDialog(null,
            "NOMBRE DEL CLIENTE :"+nombre+"\n APELLIDO DEL CLIENTE :"+apellido+"\n TELEFONO :"+telefono+"\n MAIL :"+mail+
                    "\n MARCA :"+marca+"\n MODELO :"+modelos+"\n DOMINIO :"+dominio+"\n ANTIGUEDAD DEL VEHICULO :"+antig+"\n VALOR DE LA CUOTA :"+resultado+
                    "\n TIPO DE COBERTURA :"+coberturaT+"\n VALOR DE COBERTURA :"+cobertura+"\n ADICIONALES :"+coberAD+ "\n VALOR DE LA PRIMA TOTAL :"+total+"\n FECHA : "+fechaA,
            "Poliza",
            JOptionPane.YES_NO_CANCEL_OPTION,
            JOptionPane.QUESTION_MESSAGE,Icon1,
            new Object[]{"IMPRIMIR POLIZA"},"");
    }
        
}
    



