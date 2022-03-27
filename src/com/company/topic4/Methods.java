package com.company.topic4;

public class Methods {

    public static int sum(int primNumar, int doileaNumar) {
//        de ce la static trebuie de pus int, pe cand atunci cand avem void nu trebuie,
//        pentru ca fara void trebuie sa returnam ceva si int de mai sus arata ce tip de data sa fie?
        int suma = 0;

        if (primNumar > doileaNumar) {
            System.out.println("Primul numar este mai mare decat al doilea");
            return suma;

        } else if (primNumar == doileaNumar) {
            System.out.println("Numerele sunt egale");
            return primNumar;
        } else {
            for (int i = primNumar; i <= doileaNumar; i++) {
                suma = suma + i;
            }
        }
        System.out.println("Metoda s-a executat cu succes");
        return suma;
    }
 static void sum(double num){
        double suma=0;
        if (num<0){

            System.out.println("Numarul este negativ");
        }
        else if (num==0){
            System.out.println("Numarul este egal cu zero");
        }
        else {
            double i=0;
            while (num>=i) {
                suma=suma+i;
//                System.out.println("DE CE NU SE PRINTEAZA"+ suma);
                i++;
            }
            System.out.println("Suma numerelor este "+ suma);
        }
}

}

