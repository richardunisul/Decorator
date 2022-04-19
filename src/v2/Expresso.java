package v2;

// Primeiro, estendemos a classe Bevarege, 
//já que se trata de uma bebida
public class Expresso extends Bevarege {
// Para cuidar da descrição, definimos 
//	isso no construtor para a classe. 
// Lembre-se de que a variável de 
//instância de descrição é herdada 
// de Beverage	
		public Expresso() {
			description = "Expresso";
		}
		public double cost() {
			return 1.99;
		}
}
