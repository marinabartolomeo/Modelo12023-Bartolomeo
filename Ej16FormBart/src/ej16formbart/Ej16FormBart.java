package ej16formbart;

import javax.swing.JFrame;
import javax.swing.JLabel;

public class Ej16formbart extends JFrame {

    private JLabel etiq, etiq1, etiq2, etiq3, etiq4;
    
    public Ej16formbart() {
        initComponents();
    }

    private void initComponents() {
        setLayout(null);
        
        // Crear las etiquetas.
        etiq = crearLabel("INFORMACION PERSONAL", 10);
        etiq1 = crearLabel("Nombre: Marina Bart", 60);
        etiq2 = crearLabel("Fecha de Nacimiento: 21-08-1975", 80);
        etiq3 = crearLabel("Correo electrónico: akronita@hotmail.com ", 100);
        etiq4 = crearLabel("Teléfono: 11 3333-3333", 120);
    }

    private JLabel crearLabel(String mensaje, int posicionY) {
        JLabel label = new JLabel(mensaje);
        label.setBounds(25, posicionY, 350, 100);
        label.setHorizontalAlignment(JLabel.CENTER);
        
        add(label);
        return label;
    }

    public static void main(String[] args) {
        Ej16formbart formulario = new Ej16formbart();

        formulario.setBounds(150, 150, 400, 300);
        formulario.setVisible(true);
        formulario.setLocationRelativeTo(null);
        formulario.setResizable(false);
        formulario.setTitle("Formulario Datos");
    }
}