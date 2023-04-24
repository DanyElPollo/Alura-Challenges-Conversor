/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.arenas.modelo;

/**
 *
 * @author dan15
 */
public class ConversorModelo {
    
    private String moneda,convertir;
    private int cantidad, cambio;
    
    
    public ConversorModelo(){
        
    }

    public String getMoneda() {
        return moneda;
    }

    public void setMoneda(String moneda) {
        this.moneda = moneda;
    }

    public String getConvertir() {
        return convertir;
    }

    public void setConvertir(String convertir) {
        this.convertir = convertir;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public int getCambio() {
        return cambio;
    }

    public void setCambio(int cambio) {
        this.cambio = cambio;
    }
       
    public int procesoCambio(String moneda, int cantidad, String convertir){
        int cambio = 0;
        switch (moneda) {
            case "COP":
                if(convertir == "USD"){
                    cambio = (int)(cantidad*0.00022);
                }else if(convertir == "EURO"){
                    cambio = (int)(cantidad*0.00020);
                }
                break;
            case "USD":
                if(convertir == "COP"){
                    cambio = cantidad*4512;
                }else if(convertir == "EURO"){
                    cambio = (int)(cantidad*0.91);
                }
                break;
            case "EURO":
                if(convertir == "COP"){
                    cambio = (int)(cantidad*4955);
                }else if(convertir == "USD"){
                    cambio = (int)(cantidad*1.10);
                }
                break;
        }
        return cambio;
    }
    
}
