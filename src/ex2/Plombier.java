package ex2;

public class Plombier extends Personne {
	  public Plombier(String nom) {
	        super(nom);
	    }

	    @Override
	    public void affiche() {
	        System.out.println("Je suis " + nom + " le Plombier");
	    }
}
