package com.exercise2.controller;

import com.exercise2.entities.Person;
import com.exercise2.model.GenericMethods;

public class RunMain {
    public static void  run (){
        GenericMethods genericMethods = new GenericMethods();

        Person person = new Person("Pepe " , "Domingo ", 80);

        genericMethods.printArguments(person, "gran preriodista", 2023 );
        genericMethods.printArguments("Ahora sin el objeto", 3641.54 , 1 );
        genericMethods.printArguments(true , false , "game" );
        genericMethods.printArguments( "De la ser a la Copa", 2010, person  );
    }
}
