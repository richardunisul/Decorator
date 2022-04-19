package v2;

public class Mocha extends Condientdecorator{
	Beverage beverage;
	
	public Mocha(Beverage beverage) {
		this.beverage = beverage;
	}
	
	public String getDescription() {
		return bevarege.getDescription() + ", Mocha";
	}
	public double cost() {
		return 0.20 + bevarage.cost();
	}
}
