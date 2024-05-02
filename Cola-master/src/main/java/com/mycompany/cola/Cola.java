/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package com.mycompany.cola;

/**
 *
 * @author Usuario
 */
public class Cola {

    private Nodo frente, finaal;

    public void vacia() {
        frente = null;
        finaal = null;
    }

    public int primero() {
        if (!esVacia()) {
           return frente.getDato();
        } 
        return 0;
    }

    public void inserta(int dato) {
        Nodo nuevo = new Nodo(dato);
        if (esVacia()) {
            frente = nuevo;
            finaal = nuevo;
        } else {
            finaal.setSiguiente(nuevo);
            finaal = nuevo;
        }

    }

    public void quitarPrimero() {
        if (!esVacia()) {
            frente = frente.getSiguiente();
        } 
       
    }

    public boolean esVacia() {
        return frente == null;

    }

    public String imprimir() {
        Nodo indice = frente;
        String mensaje = "Cola:\n";
        while (indice != null) {
            mensaje += indice.getDato() + "\n";
            indice = indice.getSiguiente();

        }
        return mensaje;
    }
}
