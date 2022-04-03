package com.company.salary.topic5;

public class Ospatar extends Persoana {
    int numarDeOre;
    int pretOra;

    public void setPretSiNumarDeOre (int numarDeOre, int pretOra) {
        if (numarDeOre>0 && pretOra>0) {
            this.numarDeOre=numarDeOre;
            this.pretOra=pretOra;}
            else {
                System.out.println("Valorile introduse sunt gresite");
        }
        }

    @Override
    protected double returneazaSalariu() {

        return salariuPersoana=numarDeOre*pretOra;
    }
}
