package BDPDemo;
//Step4: Create concrete classes extending Burger and ColdDrink classes

public class Pepsi extends ColdDrink{

	@Override
	public String name() {

		return "Pepsi";
	}

	@Override
	public float price() {

		return 35.0f;
	}

}
