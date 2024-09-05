namespace zadanie1 {
	internal class Program {
		static void Main(string[] args) {
			Auto car1 = new Auto("Kia", 4, 5, "Robert", false);
			Auto car2 = new Auto("Smart", 4, 2, "Arkadiusz", true);
			Auto car3 = new Auto("Volkswagen", 4, 9, "Zbigniew", false);
			Auto car4 = new Auto("Mercedes", 4, 5, "Daniel", true);
			Auto car5 = new Auto("Porsche", 4, 2, "Bartosz", false);
		}
	}
	class Auto {
		string brand;
		int wheelsNumber;
		int seatsNumber;
		string ownersName;
		bool isElectric;

		public Auto(string brand, int wheelsNumber, int seatsNumber, string ownersName, bool isElectric) {
			this.brand = brand;
			this.wheelsNumber = wheelsNumber;
			this.seatsNumber = seatsNumber;
			this.ownersName = ownersName;
			this.isElectric = isElectric;
		}
	}
}
