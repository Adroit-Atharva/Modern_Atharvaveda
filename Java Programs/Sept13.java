// A package is a set of classes, interfaces or sub packages that has some methods
// java is the largest package in java
// There 2 types of packages in java 1. built-in and user defined  
// ex. java.util.Scanner, collection
// package packagename;
// public, private and protected
// only a child class can access protected methods of the parent class
// Other classes can access a protected 

// stating the name of the package in the first is basically declaration of the package
package com.Atharva;

// The Sept13 class is inside Atharva package
// This class also needs to be public to be imported in another

public class Sept13{
    // These functions or methods are in Sept13 class 
    // These functions need to be public to be accessed by another program
    public void disp_hello(){
        System.out.println("Hello Atharva\n");
    }

    public int Add(int a, int b){
        return a+b;
    }
}