package com.company.topic8;

public class ServiciuStoc {

    public static void main(String[] args) {
        Carte baltagul = new Carte("Baltagul", "Liviu Rebreanu", 1232323, 250);
        Carte ion = new Carte ("Ion","Liviu Rebreanu",1234221, 140);
        Carte theFour = new Carte ("The Four: The Hidden DNA of Amazon, Apple, Facebook, and Google","Scott Galloway",124412221, 240);
        Carte netflix = new Carte ("That Will Never Work: The Birth of Netflix and the Amazing Life of an Idea","Marc Randolph",43443221, 160);
        Carte noLogo = new Carte ("No Logo: Taking Aim at the Brand Bullies","Naomi Klein",33443221, 230);

        Stoc magazin1 = new Stoc(1, "Mihai Viteazul 32");
Stoc magazin2= new Stoc (2, "Strada Studentilor 76");
        magazin1.adaugaCarteStoc(baltagul);
        magazin1.adaugaCarteStoc(ion);
        magazin2.adaugaCarteStoc(netflix);
        magazin2.adaugaCarteStoc(noLogo);
        magazin2.adaugaCarteStoc(theFour);
        magazin1.esteStoculGol();
        System.out.println("Numarul de carti pe magazinul de pe Mihai Viteazul " + magazin1.nrDeCartiInStoc());
        System.out.println("Numarul de carti pe magazinul de pe Studentilor " + magazin2.nrDeCartiInStoc());

    }


}
