package com.exercise2.model;

public class GenericMethods {
    public <T, U, V> void printArguments(T first, U second, V third){
        System.out.print(" Primero : "+ first);
        System.out.print(" Segundo : "+ second);
        System.out.print(" Tercero : "+ third);
        System.out.println();

    }
}
