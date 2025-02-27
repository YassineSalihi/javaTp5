package ex1;


	public class Cercle extends Form {

		private double rayon;

		public Cercle(int i) {
			rayon = i;
		}

		@Override
		public double caculerSurface() {
			return Math.PI * Math.pow(rayon, 2);
		}

	}


