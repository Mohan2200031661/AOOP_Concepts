package BDPDemo;
//Step4: Create concrete classes extending Burger and ColdDrink classes

public class Coke extends ColdDrink{

	@Override
	public String name() {

		return "Coke";
	}

	@Override
	public float price() {

		return 30.0f;
	}

}
