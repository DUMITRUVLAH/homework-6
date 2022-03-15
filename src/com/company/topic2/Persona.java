package com.company.topic2;

public class Persona {
public Persona(String prenumeAtribuit, String numeAtribuit,int varstaAtribuita){
    prenume=prenumeAtribuit;
    nume = numeAtribuit;
    varsta=varstaAtribuita;
}
    String prenume;
    String nume;
    int varsta;

    private static String gen ="M";
    protected static float greutate;

    public void veziGen(){
        System.out.println(nume+" are genul "+ gen);
    }
}
