package v2;

public class StarbuzzCoffe {
// Para testes
	public static void main(String[] args) {
		Beverage beverage = new Expresso(); // Peça um expresso sem condimentos e 
		// imprima sua descrição
		System.out.println(bevarege.getDescription()+"$ "+ beverage.cost());
		
		Beverage beverage2 = new DarkRoast(); // Crie um objeto DarkRoast
		beverage2 = new Mocha(beverage2); // Englobe-o com um Mocha
		beverage2 = new Mocha(beverage2); // Englobe-o com um SEGUNDO Mocha
		beverage2 = new Whip(beverage2); //  Englobe-o com um Whip
		
		System.out.println(beverage2.getDescription()+ " $ " + beverage2.cost());
		
		Beverage beverag3 = new HouseBlend();
		// Finalmente, dê-nos um HouseBlend com Soy, Mocha e Whip
		beverage3 = new Soy(beverage3); 
		beverage3 = new Mocha(beverage3);
		beverage3 = new Whip(beverage3); 
		
		System.out.println(beverage3.getDescription()+ " $ " + beverage3.cost());
		
// Você pode usar os Padrões de Criação para MELHORAR isso !!!!
	}

}
