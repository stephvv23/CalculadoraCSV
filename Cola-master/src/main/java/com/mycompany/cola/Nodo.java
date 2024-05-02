/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.cola;

/**
 *
 * @author Usuario
 */
public class Nodo {
    
    private Nodo siguiente;
    private int dato;

    public Nodo() {
        this.siguiente = null;
        this.dato = -0;
    }

    public Nodo(int dato) {
        this.siguiente = null;
        this.dato = dato;
    }

    public Nodo(Nodo siguiente, int dato) {
        this.siguiente = siguiente;
        this.dato = dato;
    }

    public Nodo getSiguiente() {
        return siguiente;
    }

    public void setSiguiente(Nodo siguiente) {
        this.siguiente = siguiente;
    }

    public int getDato() {
        return dato;
    }

    public void setDato(int dato) {
        this.dato = dato;
    }

}
