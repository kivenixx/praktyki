using System;
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

			Console.WriteLine($"Pensja pracownika {pracownik.name} o funkcji {pracownik.function} wynosi: " +
							  $"{pracownik.salary1} zł, {pracownik.salary2} zł, {pracownik.salary3} zł.");
		}
	}
	public class Pracownik {
		public string name;
		public string function;
		public int age;
		public double salary1;
		public double salary2;
		public double salary3;
		double rate = 0;
		Random random = new Random();

		public void ObliczPensje() {

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

			salary1 = Math.Round(rate * 1.1 * age, 2);
			salary2 = Math.Round(rate * salary1 * age, 2);
			salary3 = Math.Round(rate * (random.NextDouble() * 1.9 + 0.1) * age, 2);
		}
	}
}
