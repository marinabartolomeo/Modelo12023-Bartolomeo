
package ej18textfieldbart;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.SwingUtilities;

 
public class EJ18TextFieldBart extends JFrame implements ActionListener {

   private JButton saludo, finalizar;
   private JTextField textField;
   
   
public EJ18TextFieldBart (){
      
    //configuracion de la ventana
    
    setTitle("Saludos");
    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    setLayout(new FlowLayout());
    
    //Crear la etiqueta
    textField = new JTextField (15);
    saludo = new JButton ("Saludar");
    finalizar = new JButton ("Finalizar");
    
    //Agregar componentes a la ventana
    add (new JLabel("Ingrese su Nommbre"));
    add(textField);
    add (saludo);
    add(finalizar);
    
    //Botones
    saludo.addActionListener(this);
    finalizar.addActionListener(this);
    
    pack();
    setLocationRelativeTo(null); //centrar la ventana
      
}  
@Override
     public void actionPerformed(ActionEvent e){
        if(e.getSource()==saludo){
            String nombre = textField.getText();
            if(!nombre.isEmpty()) {
            String mensaje = "Hola, " + nombre + "Bienvenido!";
            JOptionPane.showMessageDialog(this, "Hola " + nombre);
            }
            
        }else if(e.getSource()==finalizar){
            System.exit(0);
        }
    }
     
    public static void main(String[] args) {
        SwingUtilities.invokeLater(()-> {
         EJ18TextFieldBart form = new EJ18TextFieldBart();
         form.setVisible (true);
        });
    }
}

