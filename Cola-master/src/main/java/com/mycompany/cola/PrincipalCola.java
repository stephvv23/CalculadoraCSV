/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.cola;

import javax.swing.JOptionPane;

/**
 *
 * @author Usuario
 */
public class PrincipalCola {
    
    Cola cola;

    public PrincipalCola() {
        cola = new Cola();
        menu();
    }

    public void menu() {
        int opcion = 0, dato = 0;
         
        do {
            opcion = Integer.parseInt(JOptionPane.showInputDialog("Escoja una opcion:\n"
                    + "1. Almacenar un elemento. \n"
                    + "2. Obtener el frente de la cola. \n"
                    + "3. Vaciar cola.\n"
                    + "4. Quitar el primer elemento. \n"
                    + "5. Salir.\n"));

            switch (opcion) {
                case 1: //inserta
                    dato = Integer.parseInt(JOptionPane.showInputDialog("Digite el nuemro a almacenar."));
                    cola.inserta(dato);
                    JOptionPane.showMessageDialog(null, cola.imprimir());
                    break;
                case 2: //primero

                    JOptionPane.showMessageDialog(null, cola.primero());
                    System.out.println(cola.imprimir());
                    break;
                case 3://vaciar
                    cola.vacia();

                    break;
                case 4://Desapilar
                    cola.quitarPrimero();
                    JOptionPane.showMessageDialog(null, cola.imprimir());
                    break;

                case 5://Salir
                    System.exit(0);
                    break;

                default:
                    JOptionPane.showMessageDialog(null, "Numero incorrecto");
            }//Fin switch
        } while (opcion != 7);

    }//Fin del main

    public static void main(String arg[]) {
        PrincipalCola principalCola = new PrincipalCola();
        principalCola.menu();
    }//Fin del main
}
