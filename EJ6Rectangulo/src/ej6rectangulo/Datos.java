package ej6rectangulo;

import javax.swing.JOptionPane;


public class Datos {
    private float base, altura, superficie;
    
    
public Datos (float base,float altura,float superficie){
    this.base=base;
    this.altura=altura;
    this.superficie=superficie;
}

public void getDatos(){
    String datoBase=(String)JOptionPane.showInputDialog(null,"Base:","Ingresar la Base",JOptionPane.QUESTION_MESSAGE);
    String datoAltura=(String)JOptionPane.showInputDialog(null,"Altura:","Ingrese la Altura",JOptionPane.QUESTION_MESSAGE);
    this.parsear(datoBase,datoAltura);
}

public void parsear(String datoBase,String datoAltura){
    float base=Float.parseFloat(datoBase);
    float altura=Float.parseFloat(datoAltura);
    this.calularSuperficie(base,altura);
}

public void calcularSuperficie(float base, float altura){
    float superficie= base * altura;
    
    setSuperficie(superficie);
    imprimirResultado(superficie);
} 

public void setSuperficie (float superficie){
    this.superficie = superficie;
}

public float getSuperficie(){
    return superficie;
}

public void imprimirResultado(float resultado){
    System.out.println("Superfiie: " +getSuperficie());
}

    private void calularSuperficie(float base, float altura) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

}
