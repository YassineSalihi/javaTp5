package ex2;

public abstract class Personne {
    protected String nom;

    public Personne(String nom) {
        this.nom = nom;
    }

    public abstract void affiche();
}
