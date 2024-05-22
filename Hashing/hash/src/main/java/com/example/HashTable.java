package com.example;

import java.util.LinkedList;
import java.util.List;

public class HashTable {

    private final Integer size = 13;
    List<Integer>[] table;

    public HashTable() {
        table = new LinkedList[size];
        for (int i = 0; i < size; i++) {
            table[i] = new LinkedList<>();
        }
    }

    private Integer hash(Integer k) {
        return (k & 0x7fffffff) % size; // 0111 1111 Siempre positivo
    }

    public Integer buscar(Integer k) {
        System.out.println("Buscando el elemento:  " + k ) ;
        if (table[hash(k)].contains(k)) {
            return k;
        } else {
            return null;
        }
    }

    public void insertar(Integer k) {
        if (!table[hash(k)].contains(k)) {
            table[hash(k)].add(k);
        }
        System.out.println(k + " tiene el hash -> " + hash(k));
    }

    public void borrar(Integer k) {
        table[hash(k)].remove(k);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < size; i++) {
            sb.append("Index ").append(i).append(": ").append(table[i].toString()).append("\n");
        }
        return sb.toString();
    }
}
