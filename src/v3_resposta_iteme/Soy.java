package v3_resposta_iteme;

public class Soy extends CondimentDecorator {
	Beverage beverage;
	
//Precisamos propagar o m�todo getSize() para 
	//a bebida englobada.
// Tamb�m devemos mover esse m�todo para 
//a classe abstrata j� que ele � usado 
	// em todos os decorados de condimento
	
	public Soy(beverage beverage) {
		this.beverage = beverage;
	}
	
	public getSize() {
		return beverage.getSize();
	}
	
	public String getDescription() {
		return bevarage.getDescription() + ", Soy";
	}
	
	public double cost() {
// Aqui, obtemos o tamnho (que propaga todo o 
//caminho para a bebida concreta) e depois
//	adicionamos o custo apropriado		
		double cost = beverage.cost();
		if (getSize()== Beverage.TALL) {
			cost += 0.10;
		} else if (getSize()== Beverage.GRANDE) {
			cost += 0.15;
		} else if (getSize()== Beverage.VENTI) {
			cost += 0.20;	
		}
		return cost;
	}
}
