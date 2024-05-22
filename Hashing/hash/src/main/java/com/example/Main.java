package com.example;

public class Main {
    public static void main(String[] args) {

        HashTable tabla = new HashTable();

        for (Integer i = -50; i <= 50; i++) {
            tabla.insertar(i);
        }

        tabla.borrar(30);
        System.out.println(tabla.buscar(666));
        System.out.println(tabla);
    }
}
