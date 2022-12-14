package org.example;

public class Arene {

    String nomArene;
    int niveauArene;


    public Arene(String nomArene, int niveauArene) {
        this.nomArene = nomArene;
        this.niveauArene = niveauArene;
    }

    public String getNomArene() {
        return nomArene;
    }

    public void setNomArene(String nomArene) {
        this.nomArene = nomArene;
    }

    public int getNiveauArene() {
        return niveauArene;
    }

    public void setNiveauArene(int niveauArene) {
        this.niveauArene = niveauArene;
    }
}
