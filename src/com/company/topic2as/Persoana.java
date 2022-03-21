package com.company.topic2as;

public class Persoana {

    public String prenumePersona;
    protected String numePersoana;
    private int varsta;

    public void seteazaVarsta(int varstaAtribuita) {
        this.varsta = varstaAtribuita;
        System.out.println("Varsta a fost populata cu valoarea urmatoare " + this.varsta);
    }

    public int getVirsta() {
        return this.varsta;
    }

}
