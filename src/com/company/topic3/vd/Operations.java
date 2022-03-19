package com.company.topic3.vd;

public class Operations {
    static void printAritmeticOperations() {
        int a = 40;
        int b = 50;
        System.out.println("Rezultatul adunarii= " + (a + b));
        System.out.println("Rezultatul diferentei= " + (a - b));
        System.out.println("Rezultatul inmultirii= " + (a * b));
        System.out.println("Rezultatul impartirii= " + (a / b));
        System.out.println("Rezultatul catului= " + (a % b));
        System.out.println("Rezultatul postincrement= " + (a++));
        System.out.println("Rezultatul postdecrement= " + (b--));

    }

    static void printLogicOperations() {
        boolean a = true;
        boolean b = false;
        System.out.println("Rezultatul operatiei logice AND " + (a && b));
        System.out.println("Rezultatul operatiei logice OR " + (a || b));
        System.out.println("Rezultatul operatiei logice Negatie " + (!a));
        System.out.println("Rezultatul operatiei logice Negatie " + (!b));
    }

    static void printRelationarOperations() {
        int c = 30, d = 45;
        System.out.println("Operatia de " + c + "<" + d + " are rezultatul " + (c < d));
        System.out.println("Operatia de " + c + ">" + d + " are rezultatul " + (c > d));
        System.out.println("Operatia de " + c + "<=" + d + " are rezultatul " + (c <= d));
        System.out.println("Operatia de " + c + ">=" + d + " are rezultatul " + (c >= d));
        System.out.println("Operatia de " + c + "==" + d + " are rezultatul " + (c == d));
        System.out.println("Operatia de " + c + "!=" + d + " are rezultatul " + (c != d));

    }

    static void useForAndWhile() {
        int x = 20, z = 40;
        for (int e = 5; e < 20; e++)
            System.out.println(e);
        while (x < z) {
            System.out.println("Valoarea x este " + x);
            x++;
        }
    }

}
