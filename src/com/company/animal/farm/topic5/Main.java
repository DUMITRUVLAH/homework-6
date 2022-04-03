package com.company.animal.farm.topic5;

public class Main {
    public static void main(String[] args) {
Pisica Murka = new Pisica();
Murka.setStarePisica(true);
        System.out.println("Pisica Murka este " + Murka.retuneazaStarea());
        Murka.setSarcinaPisica(false);
        System.out.println("Pisica este gravida"+ Murka.returneazaSarcina());
    }
}
