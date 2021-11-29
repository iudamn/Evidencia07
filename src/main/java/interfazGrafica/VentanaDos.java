package interfazGrafica;

import ventana.Ventana;

import javax.swing.*;
import java.awt.event.ActionEvent;

public class VentanaDos extends Ventana {
    private JLabel instrucciones;
    private JButton botonmenuPrincipal;
    private JButton botonModificacion;
    private JButton botonApellido;

    public VentanaDos(){
        super("Lista", 500, 400);
        generarElementosVentana();
    }
    private void generarElementosVentana(){
        generarBotonNombre();
        generarBotonApellido();
        generarMensajeInstrucciones();
        generarBotonExit();
    }
    private void generarMensajeInstrucciones(){
        String textInstrucciones = "¿Desea modificar algo?";
        super.generarJLabel(this.instrucciones,textInstrucciones,20,15,460,150);
    }

    private void generarBotonExit(){
        String textoBoton = "No, salir";
        this.botonmenuPrincipal = super.generarBoton(textoBoton,150,300,200,40);
        this.add(this.botonmenuPrincipal);
        this.botonmenuPrincipal.addActionListener(this);
    }

    private void generarBotonNombre(){
        String textoBoton = "Nombre";
        this.botonModificacion = super.generarBoton(textoBoton,150,200,200,40);
        this.add(this.botonModificacion);
        this.botonModificacion.addActionListener(this);
    }

    private void generarBotonApellido(){
        String textoBoton = "Apellido";
        this.botonApellido = super.generarBoton(textoBoton,150,250,200,40);
        this.add(this.botonApellido);
        this.botonApellido.addActionListener(this);
    }

    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == this.botonmenuPrincipal) {
            VentanaTrabajadores bienvenida = new VentanaTrabajadores();
            this.dispose();
            System.exit(0);
        }
        if (e.getSource() == this.botonModificacion) {
            JOptionPane.showMessageDialog(this, "");
        }
    }
}
