package ej15formbart;

import javax.swing.JFrame;
import javax.swing.JLabel;

public class Ej15FormBart extends JFrame {
    private JLabel etiqueta;

    public Ej15FormBart() {
        // Configuración del formulario
        initFormulario();
        
        // Configuración de la etiqueta
        initEtiqueta();
    }

    private void initFormulario() {
        // Configuración del formulario
        setLayout(null);
        setSize(650, 350);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setResizable(false);
        setTitle("Formulario Inicial");
    }

    private void initEtiqueta() {
        // Creamos la etiqueta
        etiqueta = new JLabel("¡¡¡ Hola Mundo :) !!!");
        
        // Configuración de la etiqueta
        etiqueta.setBounds(0, 0, getWidth(), getHeight());
        etiqueta.setHorizontalAlignment(JLabel.CENTER);
        etiqueta.setVerticalAlignment(JLabel.CENTER);
        // Agregamos la etiqueta al formulario
        add(etiqueta);
    }

    public static void main(String[] args) {
        // Crear una instancia del formulario
        Ej15FormBart formulario = new Ej15FormBart();
        
        // Hacer visible el formulario
        formulario.setVisible(true);
    }
}