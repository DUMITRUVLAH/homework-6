package com.company.topic5;

public class Main {
    public static void main(String[] args) {
        Cerc dima = new Cerc();
        dima.setRazaCercului(10);
        System.out.println("Aria cercului Dima este de "+ dima.returneazaAria());
        System.out.println("Permietru cercului Dima este de "+ dima.retuneazaPerimetru());
        Patrat Malevich = new Patrat();
        Malevich.setLaturaPatrat(10);
        System.out.println("Patratul lui Malevich are aria de "+Malevich.returneazaAria());

Romb Vasile = new Romb();
Vasile.diagonaleRomb(10,2);
        System.out.println("Aria rombului este "+ Vasile.returneazaAria());


    }
}
