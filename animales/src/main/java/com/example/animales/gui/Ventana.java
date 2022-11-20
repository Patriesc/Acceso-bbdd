package com.example.animales.gui;



import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.List;
import java.util.Vector;

/**
 *
 */
public class Ventana {
    private JPanel panel1;
    JTextField tfNombre;
    JTextField tfRaza;
    JTextField tfCaracteristicas;
    JTextField tfPeso;
    JButton btGuardar;
    JButton btNuevo;
    JButton btModificar;
    JButton btEliminar;
    JButton btAnterior;
    JButton btSiguiente;
    JButton btPrimero;
    JButton btUltimo;
    JBarraEstado barraEstado;
    JTextField tfBusqueda;
    JButton btBuscar;

    public Ventana() {

        JFrame frame = new JFrame("Ventana");
        frame.setContentPane(panel1);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
    }
}
