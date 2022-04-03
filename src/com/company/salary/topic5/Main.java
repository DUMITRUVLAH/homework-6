package com.company.salary.topic5;

public class Main {
    public static void main(String[] args) {
        Profesor MariaIvanova= new Profesor();
        MariaIvanova.setGradSiVechime(10,4);
        System.out.println("salariu Mariei Ivanova este "+  MariaIvanova.returneazaSalariu());

        Ospatar Vasile = new Ospatar();
        Vasile.setPretSiNumarDeOre(200,100);
        System.out.println("Salariul lui Vasile este "+ Vasile.returneazaSalariu());
    }
}
