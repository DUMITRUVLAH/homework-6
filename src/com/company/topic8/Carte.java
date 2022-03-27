package com.company.topic8;

public class Carte {
    String titlu;
    String autor;
    long numarDeSerie;
    int pagini;

    public Carte (String titluAtribuit, String autorAtribuit, long numarDeSerieAtribuit, int paginiAtribuite){
  titlu=titluAtribuit;
  autor=autorAtribuit;
  numarDeSerie=numarDeSerieAtribuit;
  pagini=paginiAtribuite;
    }

    @Override
    public String toString() {
        return "Carte{" +
                "titlu='" + titlu + '\'' +
                '}';
    }
}
