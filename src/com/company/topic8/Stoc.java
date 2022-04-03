package com.company.topic8;

import java.util.ArrayList;
import java.util.List;

public class Stoc {
    public Stoc (int stocIdAtribuit, String adresaMagazinAtribuita) {
        stocId=stocIdAtribuit;
        adresaMagazin=adresaMagazinAtribuita;
        cartileDinStoc=new ArrayList<>();
    }
    private int stocId;
    private String adresaMagazin;
    List<Carte> cartileDinStoc;

   public void adaugaCarteStoc (Carte carteAdaugata) {
this.cartileDinStoc.add(carteAdaugata);
       System.out.println(carteAdaugata.toString() + " a fost adaugata in stoc " + stocId + " adresa "+adresaMagazin);
   }

   public void stergeCarteDinStoc (Carte carteStearsa) {
       this.cartileDinStoc.remove(carteStearsa);
       System.out.println(carteStearsa.toString() + " A fost ștearsă din " + stocId + " si magazinul " + adresaMagazin);
   }

   public boolean existaCarteInStoc (Carte verificareCarte) {
       return this.cartileDinStoc.contains(verificareCarte);
   }

   public int nrDeCartiInStoc () {
       return this.cartileDinStoc.size();
   }

   public boolean esteStoculGol () {
       return this.cartileDinStoc.isEmpty();
   }

}
