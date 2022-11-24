package org.example;

public class Personnage {
    String nom;
    String genre;
    String race;
    String famille;
    String titre ;

    @Override
    public String toString() {
        return "Personnage{" +
                "Nom='" + nom + '\'' +
                ", Genre='" + genre + '\'' +
                ", Race='" + race + '\'' +
                ", Famille='" + famille + '\'' +
                '}';
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public String getRace() {
        return race;
    }

    public void setRace(String race) {
        race = race;
    }

    public String getFamille() {
        return famille;
    }

    public void setFamille(String famille) {
        this.famille = famille;
    }
}
