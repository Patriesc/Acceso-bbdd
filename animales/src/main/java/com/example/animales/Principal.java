package com.example.animales;


import com.example.animales.gui.Ventana;
import com.example.animales.gui.VentanaController;
import com.example.animales.gui.VentanaModel;

public class Principal {

    public static void main(String args[]) {

        Ventana view = new Ventana();
        VentanaModel model = new VentanaModel();
        VentanaController controller = new VentanaController(model, view);
    }
}
