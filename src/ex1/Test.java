package ex1;

import ex1.Carre;
import ex1.Form;
import ex1.Cercle;
public class Test {

	public static void main(String[] args) {
		Form[] figures = new Form[3];
		figures[0] = new Carre(2); 
		figures[1] = new Cercle(3); 
		figures[2] = new Carre(5.2); 
		for (int i = 0; i < figures.length; i++)
			System.out.println(figures[i] + " : surface = " + figures[i].caculerSurface() + "cm2");
	}

	}