package v1;

public class Beverage {
//declarar vari�veis de inst�ncia para milkCost,
	// sayCost, mochaCost ewhipCoste e 
	// agetes de obten��o e defini��o de 
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
