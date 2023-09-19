package ej3cuentabanc;

import javax.swing.JOptionPane;

/**
 *
 * @author Marina
 */
public class CuentaBancaria {
    private String nombreTitular;
    private String tipodecuenta;    
    private double saldo;
    public CuentaBancaria(String tipodecuenta, double saldoInicial) {
        this.tipodecuenta = tipodecuenta;
        this.saldo = saldoInicial;
    
    }
    public void extraer(double cantidad) {
        if (cantidad <= saldo) {
            saldo -= cantidad;
            JOptionPane.showMessageDialog(null, "Has extraído $" + cantidad + ". Saldo restante: $" + saldo);
        } else {
            JOptionPane.showMessageDialog(null, "Saldo insuficiente");
        }
    }

    public void depositar(double cantidad) {
        saldo += cantidad;
        JOptionPane.showMessageDialog(null, "Has depositado $" + cantidad + ". Nuevo saldo: $" + saldo);
    }

    public void consultarSaldo() {
        JOptionPane.showMessageDialog(null, "Saldo actual: $" + saldo);
    }

    void consultaSaldo() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}
   

