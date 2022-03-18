package com.company.topic3as;

public class Operations {
    static void printAritmeticOperations(double a, double b) {
        System.out.println("Adunarea: " + (a + b));
        System.out.println("Scaderea:" + (a - b));
        System.out.println("Inmultirea: " + (a * b));
        System.out.println("Impartirea:" + (a / b));
        System.out.println("Restul impartirii:" + (a % b));

        double preIncriment = ++a;
        System.out.println("Pre-increment:" + preIncriment);

        double postIncriment = a++;
        System.out.println("Post-increment:" + postIncriment);

//        System.out.println("Pre-decriment:" + (--a));
//        System.out.println("Post-decriment:" + (a--));
    }

    static void printLogiOperations(boolean a, boolean b) {
        System.out.println("AND:" + (a && b));
        System.out.println("OR:" + (a || b));
        System.out.println("Negatie:" + (!a));
    }

    static void printRelationarOperations(int a, int b) {
        System.out.println("Egalitate:" + (a == b));
        System.out.println("Diferenta:" + (a != b));
    }


    static void useForAndWhile(int limita) {
        int index = 10;

        while (true) {
            System.out.print(index + " ");
            index++;
        }
//        System.out.println("Valoarea lui index la finalul executiei while este " + index);

//
//        for (int i = 10; i <= limita; i++) {
//            System.out.print(i + " ");
//        }
//
//        System.out.println("Ciclulc for s-a executat ");


    }

}
