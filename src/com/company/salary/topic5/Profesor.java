package com.company.salary.topic5;

public class Profesor extends Persoana{
int vechimeAni;
int gradProfesor;

public void setGradSiVechime (int gradProfesor, int vechimeAni) {
    if (gradProfesor>0 && vechimeAni>0){
        this.gradProfesor=gradProfesor;
        this.vechimeAni=vechimeAni;}
        else {
        System.out.println("Datele introduse sunt gresite");


    }
}


    @Override
    protected double returneazaSalariu() {
        this.salariuPersoana=(0.5*vechimeAni)*gradProfesor*200;
        return salariuPersoana;
    }
}
