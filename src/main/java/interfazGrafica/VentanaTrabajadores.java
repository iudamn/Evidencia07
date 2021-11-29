package interfazGrafica;


import ventana.Ventana;

import javax.swing.*;
import java.awt.event.ActionEvent;

public class VentanaTrabajadores extends Ventana {
    private JLabel bienvenida;
    private JButton botonUno;
    private JButton botonDos;
    private JButton botonTres;

    public VentanaTrabajadores(){
        super("Lista",500,400);
        generarElementosVentana();
    }

    private void generarElementosVentana(){
        generarTitulo();
        botonTrabajadorUno();
        //botonTrabajadorDos();
        //botonTrabajadorTres();
    }

    private void generarTitulo(){
        String textoBienvenida = "Registro ";
        super.generarJLabelEncabezado(this.bienvenida, textoBienvenida,20,30,500,30);
    }

    private void botonTrabajadorUno(){
        String textoBoton = "Trabajador 1";
        this.botonUno = super.generarBoton(textoBoton,175,100,150,40);
        this.add(this.botonUno);
        this.botonUno.addActionListener(this);
    }

    private void botonTrabajadorDos(){
        String textoBoton = "Trabajador 2";
        this.botonDos = super.generarBoton(textoBoton,175,200,150,40);
        this.add(this.botonDos);
        this.botonDos.addActionListener(this);
    }

    private void botonTrabajadorTres(){
        String textoBoton = "Trabajador 3";
        this.botonTres = super.generarBoton(textoBoton,175,300,150,40);
        this.add(this.botonTres);
        this.botonTres.addActionListener(this);
    }

    @Override
    public void actionPerformed(ActionEvent e){
        if(e.getSource() == this.botonUno){
            JOptionPane.showMessageDialog(this,"Nombre: \n"+
                    "Apellido: \n"+
                    "Rut: \n"+
                    "AFP: \n"+
                    "Isapre: \n"
                    );
            VentanaDos ventanaInstrucciones = new VentanaDos();
        }
        if(e.getSource() == this.botonDos){
            VentanaDos ventanaInstrucciones = new VentanaDos();
            this.dispose();
        }
        if(e.getSource() == this.botonTres){
            this.dispose();
            System.exit(0);
        }
    }
}
