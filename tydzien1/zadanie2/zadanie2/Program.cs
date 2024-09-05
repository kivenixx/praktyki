namespace zadanie2 {
	internal class Program {
		public interface ZwierzeAkcje {
			void Poluj();
			void Jedz();
			void Spij();
			void Spaceruj();
		}
		public class Kot : ZwierzeAkcje {
			public void Poluj() {
				Console.WriteLine("Kot poluje");
			}
			public void Jedz() {
                Console.WriteLine("Kot je");
			}
			public void Spij() {
                Console.WriteLine("Kot śpi");
			}
			public void Spaceruj() {
                Console.WriteLine("Kot spaceruje");
			}

			public void Mrucz() {
				Console.WriteLine("Kot mruczy");
			}
			public void WspinajSie() {
                Console.WriteLine("Kot się wspina");
			}
		}

		public class Pies : ZwierzeAkcje {
			public void Poluj() {
				Console.WriteLine("Pies poluje");
			}
			public void Jedz() {
				Console.WriteLine("Pies je");
			}
			public void Spij() {
				Console.WriteLine("Pies śpi");
			}
			public void Spaceruj() {
				Console.WriteLine("Pies spaceruje");
			}

			public void Aportuj() {
				Console.WriteLine("Pies aportuje");
			}
			public void Plywaj() {
				Console.WriteLine("Pies pływa");
			}
		}
		static void Main(string[] args) {
		}
	}
}
