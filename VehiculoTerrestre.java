/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.primerapracticacs;

import javax.swing.JOptionPane;

/**
 *
 * @author leymanwu
 */
public class VehiculoTerrestre extends Vehiculo {
    private int porcentajeBateria;

    public VehiculoTerrestre(int porcentajeBateria, String marca, String placa, int anio, String modelo) {
        super(marca, placa, anio, modelo);
        this.porcentajeBateria = porcentajeBateria;
    }
    public void acelerar() {
        JOptionPane.showMessageDialog(null, "El carro modelo " + getMarca() + " esta acelerando");
        porcentajeBateria-=2;
    }

    public void apagar() {
        JOptionPane.showMessageDialog(null, "El carro modelo " + getMarca() + " esta apagado");
        porcentajeBateria-=2;
    }

    public void avanzar() {
        JOptionPane.showMessageDialog(null, "El carro modelo " + getMarca() + " esta avanzando");
        porcentajeBateria-=2;
    }

    public void retroceder() {
        JOptionPane.showMessageDialog(null, "El carro modelo " + getMarca() + " est retrocediendo");
        porcentajeBateria-=2;
    }

    public void girarIzquierda() {
        JOptionPane.showMessageDialog(null, "El carro modelo " + getMarca() + " esta girando a la izquierda");
        porcentajeBateria-=2;
    }
    public void girarDerecha(){
        JOptionPane.showMessageDialog(null, "El carro modelo " + getMarca() + " esta giradnod a la derecha");
        porcentajeBateria -= 2;
    }
    public void mostrarInformacion(){
        JOptionPane.showMessageDialog(null, ("Marca del vehiculo: "+ getMarca()+
                           "\nModelo: "+ getModelo() +
                           "\nAño del veiculo:" + getAnio()+
                           "\nNumero de placa: "+ getPlaca()));
    }
    
    public void mostrarGasolina(){
        JOptionPane.showMessageDialog(null, ("El nivel de gasolina del vehiculo "+getMarca()+" es de "+porcentajeBateria));
        
    }
    
}
