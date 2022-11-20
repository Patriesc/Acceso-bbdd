package org.hibernate.gestion;

import org.hibernate.gestion.gui.Ventana;
import org.hibernate.gestion.gui.VentanaController;
import org.hibernate.gestion.gui.VentanaModel;


public class Principal {

    public static void main(String args[]) {
        Ventana ventana = new Ventana();
        VentanaModel model = new VentanaModel();
        VentanaController controller =
                new VentanaController(model, ventana);
    }
}
