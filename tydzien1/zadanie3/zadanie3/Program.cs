namespace zadanie3 {
	internal class Program {
		static void Main(string[] args) {
			//Ksztalt ksztalt = new Ksztalt(3,5);              nie można wywołać obiektu na podstawie klasy abstrakcyjnej
			Kwadrat kwadrat = new Kwadrat(24,36);
			Trojkat trojkat = new Trojkat(15,15);
		}
	}
	abstract class Ksztalt {
		int obwod;
		int pole;
		public Ksztalt(int obwod, int pole) { 
			this.obwod = obwod;
			this.pole = pole;
		}
	}

	class Kwadrat : Ksztalt {
		public Kwadrat(int obwod, int pole) : base(obwod, pole) {
		}
	}
	class Trojkat : Ksztalt {
		public Trojkat(int obwod, int pole) : base(obwod, pole) {
		}
	}
}
