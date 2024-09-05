namespace zadanie2 {
	internal class Program {
		public interface ZwierzeAkcje {
			void Polowanie();
			void Jedzenie();
			void Spanie();
			void Spacerowanie();
		}
		public class Kot : ZwierzeAkcje {
			public void Polowanie() {
				Console.WriteLine("Kot poluje");
			}
			public void Jedzenie() {
                Console.WriteLine("Kot je");
			}
			public void Spanie() {
                Console.WriteLine("Kot śpi");
			}
			public void Spacerowanie() {
                Console.WriteLine("Kot spaceruje");
			}
			public void Mruczenie() {
				Console.WriteLine("Kot mruczy");
			}
			public void Wspinanie() {
                Console.WriteLine("Kot się wspina");
			}
		}

		public class Pies() {
			public void Polowanie() {
				Console.WriteLine("Pies poluje");
			}
			public void Jedzenie() {
				Console.WriteLine("Pies je");
			}
			public void Spanie() {
				Console.WriteLine("Pies śpi");
			}
			public void Spacerowanie() {
				Console.WriteLine("Pies spaceruje");
			}
			public void Bieganie() {
				Console.WriteLine("Pies biega");
			}
			public void Plywanie() {
				Console.WriteLine("Pies pływa");
			}
		}
		static void Main(string[] args) {
		}
	}
}
