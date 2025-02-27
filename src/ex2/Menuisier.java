package ex2;

public class Menuisier extends Personne {
	public Menuisier(String nom) {
		super(nom);
	}

	@Override
	public void affiche() {
		System.out.println("Je suis " + nom + " le Menuisier");
	}
}
