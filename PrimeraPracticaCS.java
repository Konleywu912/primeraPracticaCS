/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package com.mycompany.primerapracticacs;

import javax.swing.JOptionPane;

/**
 *
 * @author leymanwu
 */
public class PrimeraPracticaCS {

    public static void main(String[] args) {
        VehiculoTerrestre vehi = new VehiculoTerrestre(100, "Toyota", "Fortune", 2013, "ABC112");
        int op = Integer.parseInt(JOptionPane.showInputDialog("1)Encender el carro"));
        if (op == 1) {
            while (true) {
                int ope = Integer.parseInt(JOptionPane.showInputDialog("1)Acelerar\n"
                        + "2)Retroceder\n"
                        + "3)Girar a la izquieda\n"
                        + "4)Girar a la derecha\n"
                        + "5)Mostrar informacion del vehiculo\n"
                        + "6)Nivel de gasolina\n"
                        + "7)Cargar gasolina\n2"
                        + "8)Apagar el carro"));

                switch (ope) {
                    case 1:
                        vehi.acelerar();
                        break;
                    case 2:
                        vehi.retroceder();
                        break;
                    case 3:
                        vehi.girarIzquierda();
                        break;
                    case 4:
                        vehi.girarDerecha();
                        break;
                    case 5:
                        vehi.mostrarInformacion();
                        break;
                    case 6:
                        vehi.mostrarGasolina();
                        break;
                    case 7:
                        vehi.apagar();
                        return;
                }
            }
        } else {
            System.out.print("El carro sigue apagado");

        }

    }
}
