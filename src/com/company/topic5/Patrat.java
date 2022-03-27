package com.company.topic5;

public class Patrat extends FiguraGeometrica {
    double laturaPatrat;

    public void setLaturaPatrat(double laturaPatrat) {
        if (laturaPatrat<0) {
            System.out.println("Latura introdusa este gresita");
        }
        else { this.laturaPatrat = laturaPatrat;}
    }

    @Override
    double returneazaAria() {
        this.ariaFigurii = laturaPatrat*laturaPatrat;
        return this.ariaFigurii;
    }

    @Override
    double retuneazaPerimetru() {
        this.perimetruFigurii=4*laturaPatrat;
        return this.perimetruFigurii;
    }
}
