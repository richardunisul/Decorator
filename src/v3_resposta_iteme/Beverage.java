package v3_resposta_iteme;

public class Beverage {
	String description = "unknow Beverage";

	public String getDescription() {
		return description;
	}

	public abstract double cost();
}
