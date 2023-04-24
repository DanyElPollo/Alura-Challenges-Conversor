/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Main;

import com.arenas.controlador.ConversorControlador;
import com.arenas.modelo.ConversorModelo;
import com.arenas.vista.Conversor;
import javax.swing.JFrame;

/**
 *
 * @author dan15
 */
public class Main {

    public static void main(String[] args) {
        //INSTANCIAS DE LAS CLASES;
        Conversor view = new Conversor();
        ConversorModelo model = new ConversorModelo();
        ConversorControlador controller = new ConversorControlador(view, model);
        controller.iniciar();
    }
}
