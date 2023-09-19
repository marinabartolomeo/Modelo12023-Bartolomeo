package ej3cuentabanc;

import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

public class EJ3CuentaBanc {
        
    public static void main(String[] args) {
       String dni ="12615718";
       String clave = "123456";
       String dnivalidacion;
       String clavevalidacion;
       
       ImageIcon Icon = new ImageIcon ("src/imagenes/cajero.png");
       
       JOptionPane.showMessageDialog(null,"Introduzca la Tarjeta");
       
       dnivalidacion = (JOptionPane.showInputDialog("Ingrese su DNI: "));
       clavevalidacion = (JOptionPane.showInputDialog("Ingrese su Clave: "));

       if (dnivalidacion.equals(dni) && clavevalidacion.equals(clave)){
           JOptionPane.showMessageDialog(null, "Bienvenido");
       
       String tipodecuenta = JOptionPane.showInputDialog(null,"Ingrese el tipo de Cuenta:");
       double saldoInicial = Double.parseDouble(JOptionPane.showInputDialog(null,"Ingrese el saldo inicial"));
       
       //crear una instancia de la clase Cuenta Bancaria
       CuentaBancaria cuenta = new CuentaBancaria (tipodecuenta,saldoInicial);
       
       String[]operaciones = {"Consulta de Saldo","Depósito","Extracción"};
       String operacion = (String) JOptionPane.showInputDialog(null,"Seleccione una Operación:", "Banco M", JOptionPane.QUESTION_MESSAGE, Icon, operaciones,operaciones[0]);
       
       if(operacion != null){
           switch (operacion){
               case "Extracción":
                   double cantidadExtraccion = Double.parseDouble(JOptionPane.showInputDialog(null,"Ingrese la cantidad a extraer"));
                   cuenta.extraer(cantidadExtraccion);
                   break;
               case "Depósito":
                   double cantidadDeposito = Double.parseDouble(JOptionPane.showInputDialog(null,"Ingrese la cantidad a Depositar"));
                   cuenta.depositar(cantidadDeposito);
                   break;

               case "Consulta de Saldo":
                   cuenta.consultaSaldo();
                   break;
           }
       }else{
           JOptionPane.showMessageDialog(null,"Operación Cancelada");
       }
    } else{
           JOptionPane.showMessageDialog(null,"Clave Incorrecta");
           System.exit(0);
       }
    }
}


