package v3_resposta_iteme;

// Primeiro, estendemos a classe Bevarege, 
//j� que se trata de uma bebida
public class Expresso extends Bevarege {
// Para cuidar da descri��o, definimos 
//	isso no construtor para a classe. 
// Lembre-se de que a vari�vel de 
//inst�ncia de descri��o � herdada 
// de Beverage	
		public Expresso() {
			description = "Expresso";
		}
		public double cost() {
			return 1.99;
		}
}
