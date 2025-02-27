package ex1;

public class Carre extends Form {

		private double cote;

		public Carre(double d) {
			cote = d;
		}

		@Override
		public double caculerSurface() {
			return cote * cote;
		}

	}

