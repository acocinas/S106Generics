package com.exercise1.controller;

import com.exercise1.entities.NoGenericMethods;

public class RunMain {
    public static void run() {
        NoGenericMethods obj1 = new NoGenericMethods("pera", "limón", "melón");
        NoGenericMethods obj2 = new NoGenericMethods("melón", "pera", "limón");
        NoGenericMethods obj3 = new NoGenericMethods("limón", "melón", "pera");

        System.out.println("Primero: ");
        System.out.println(obj1);

        System.out.println("\nSegundo: ");
        System.out.println(obj2);

        System.out.println("\nTercero: ");
        System.out.println(obj3);
    }
}
