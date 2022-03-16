package com.company.topic1;

public class Angajat {

    String nume;
    int varsta;
    double salariu;
    String gen;
    public Angajat(String numeAtribuit, int varstaAtribuita, double salariuAtribuit, String genAtribuit) {
        nume = numeAtribuit;
        varsta = varstaAtribuita;
        salariu = salariuAtribuit;
        gen = genAtribuit;
    }



    public void seteazaSalariul() {
        System.out.println(nume + " are un salariu de " + salariu);
    }
        public void seteazaGen(){
            System.out.println("Angajatul "+nume+" este de gen "+ gen);

    }
}
