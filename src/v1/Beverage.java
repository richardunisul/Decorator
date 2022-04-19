package v1;

public class Beverage {
//declarar variáveis de instância para milkCost,
	// sayCost, mochaCost ewhipCoste e 
	// agetes de obtenção e definição de 
	//leite, soja, moca e creme
	
	public float cost() {
		float condmentCost = 0.0;
		if(hasMilk()) {
			condmentCost += milkCost;
		}
		if(hasSoy()) {
			condmentCost += soyCost;
		}
		if(hasMocha()) {
			condmentCost += mochaCost;
		}
		if(hasWhip()) {
			condmentCost += whipCost;
		}
		 return condmentCost;
	}
}
