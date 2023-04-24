/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.arenas.controlador;

import com.arenas.modelo.ConversorModelo;
import com.arenas.vista.Conversor;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;

/**
 *
 * @author dan15
 */
public class ConversorControlador implements ActionListener{
    
    private Conversor view;
    private ConversorModelo model;
    
    public ConversorControlador(Conversor view,ConversorModelo model){
        this.view = view;
        this.model = model;
        this.view.btnCambio.addActionListener(this);
    }
    
    public void iniciar(){
        this.view.setLocationRelativeTo(null);
        this.view.setVisible(true);
        
    }
    
    @Override
    public void actionPerformed(ActionEvent e) {
        String cantidad = view.cantidad.getText();
        if(!cantidad.isEmpty()){
        String moneda = view.selectorMoneda.getSelectedItem().toString();
        String convertir = view.jComboConvertir.getSelectedItem().toString();
        view.jTextFieldResultado.setText(String.valueOf(model.procesoCambio(moneda, Integer.parseInt(cantidad), convertir)));      
        }else{
            JOptionPane.showMessageDialog(null,"La Cantidad no puede estar vacia");
        }
    }
}
