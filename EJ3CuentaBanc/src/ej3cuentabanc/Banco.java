
package ej3cuentabanc;

import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

public class Banco {
   ImageIcon Icon = new ImageIcon ("src/imagenes/cajero.png");
    
        
        private String tipodecuenta;
        private double saldo;
        
        public Banco(String tipodecuenta,double saldoInicial){
            this.tipodecuenta = tipodecuenta;
            this.saldo = saldoInicial;
        }
        
        public void extraer(double cantidad){
            if (cantidad <= saldo){
                saldo -= cantidad;
                JOptionPane.showMessageDialog(null, "Retiraste $" + cantidad + ".Saldo Restante: $" + saldo);
            }else {
                JOptionPane.showMessageDialog(null,"Saldo Insuficiente");
            }
        }
        
        public void depositar(double cantidad){
            saldo +=cantidad;
            JOptionPane.showMessageDialog(null,"Depositaste $" + cantidad + ". Nuevo Saldo: $" + saldo);
        }
        
        public void consultaSaldo(){
            JOptionPane.showMessageDialog(null,"Saldo Actual: $" +saldo);
        }
        
}