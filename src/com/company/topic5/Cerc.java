package com.company.topic5;

public class Cerc extends FiguraGeometrica{
double razaCercului;

    public void setRazaCercului(double razaCercului) {
        if (razaCercului<0) {
            System.out.println("Raza este invalida");}
            else {
                this.razaCercului = razaCercului;
            }
        }


    @Override
    double retuneazaPerimetru() {
        this.perimetruFigurii=2*3.14*razaCercului;
        return this.perimetruFigurii;
    }

    @Override
    double returneazaAria() {
        return this.ariaFigurii=3.14*razaCercului*razaCercului;


    }
}
