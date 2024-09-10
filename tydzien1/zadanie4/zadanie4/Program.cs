using System.Runtime.CompilerServices;

namespace zadanie4 {
	internal class Program {
		static void Main(string[] args) {
			Pracownik pracownik = new Pracownik();

            Console.WriteLine("Podaj imię pracownika:");
			pracownik.name = Console.ReadLine();

			Console.WriteLine("Podaj funkcję pracownika:");
			pracownik.function = Console.ReadLine();
			
			Console.WriteLine("Podaj wiek pracownika:");
			pracownik.age = Convert.ToInt32(Console.ReadLine());

			pracownik.ObliczPensje();

			Console.WriteLine($"Pensja pracownika {pracownik.name} wynosi: {pracownik.salary} zł.");
		}
	}
	public class Pracownik {
		public string name;
		public string function;
		public int age;
		public double salary;

		public void ObliczPensje() {
			double rate = 0;

			switch (function.ToLower()) {
				case "kierowca":
					rate = 6000;
					break;
				case "mechanik":
					rate = 5000;
					break;
				case "obsługa":
					rate = 4000;
					break;
				default:
					Console.WriteLine("Nieznana funkcja.");
					return;
			}

			salary = Math.Round(rate * 1.1 * age, 2);
		}
	}
}
