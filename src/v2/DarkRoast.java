package v2;

public class DarkRoast extends Beverage{
	
	public DarkRost() {
		description = "Most Excellent Dark Roast";
	}
	
	public float cost() {
		return 1.99 + super.cost();
	}

}
