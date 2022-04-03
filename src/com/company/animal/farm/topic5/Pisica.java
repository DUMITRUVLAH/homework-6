package com.company.animal.farm.topic5;

public class Pisica extends Animal {
    boolean starePisica;
    boolean sarcinaPisica;

    public void setStarePisica(boolean starePisica) {
        this.starePisica = starePisica;
    }

    @Override
    protected boolean retuneazaStarea() {
        alive=starePisica;
        return this.alive;
    }

    public void setSarcinaPisica(boolean sarcinaPisica) {
        this.sarcinaPisica = sarcinaPisica;
    }

    @Override
    protected boolean returneazaSarcina() {
     inscarcinata=sarcinaPisica;
        return inscarcinata;
    }
}
