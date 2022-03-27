package com.company.topic5;

public class Romb extends FiguraGeometrica{
    double diagonalaMare;
    double diagonalaMica;
    double laturaRomb;


//    public void setDiagonalaMare(double diagonalaMare) {
//        if (diagonalaMica>diagonalaMare) {
//            System.out.println("Diagonala mare are valori mai mici decat diagonala mica");
//        } else {this.diagonalaMare = diagonalaMare;}
//    }


  public void diagonaleRomb (double diagonalaMare, double diagonalaMica) {
      if (diagonalaMare>0 && diagonalaMica>0 && diagonalaMare>diagonalaMica) {
          this.diagonalaMica=diagonalaMica;
          this.diagonalaMare=diagonalaMare;
      }
      }

    @Override
    double returneazaAria() {
        this.ariaFigurii=diagonalaMare*diagonalaMica/2;
        return this.ariaFigurii;
    }

    @Override
    double retuneazaPerimetru() {
        this.perimetruFigurii=4*laturaRomb;
        return this.perimetruFigurii;
    }
}
