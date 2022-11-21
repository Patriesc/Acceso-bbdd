package com.sfaci.concesionario;

import com.sfaci.concesionario.gui.Ventana;
import com.sfaci.concesionario.gui.VentanaController;
import com.sfaci.concesionario.gui.VentanaModel;

import javax.swing.*;
import java.io.FileNotFoundException;
import java.io.IOException;

public class Menu {

    public static void lanzador() {
        try {
            Ventana view = new Ventana();
            VentanaModel model = new VentanaModel();
            VentanaController controller =
                    new VentanaController(view, model);
        } catch (FileNotFoundException fnfe) {
            JOptionPane.showMessageDialog(null,
                    "Error al cargar de disco. El fichero no existe", "Error",
                    JOptionPane.ERROR_MESSAGE);
        } catch (ClassNotFoundException cnfe) {
            JOptionPane.showMessageDialog(null,
                    "Error al escribir en disco. El formato no es válido", "Error",
                    JOptionPane.ERROR_MESSAGE);
        } catch (IOException ioe) {
            JOptionPane.showMessageDialog(null,
                    "Error de lectura de disco", "Error",
                    JOptionPane.ERROR_MESSAGE);
        }
    }
}

