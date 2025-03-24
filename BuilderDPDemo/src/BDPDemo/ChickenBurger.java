package BDPDemo;
//Step4: Create concrete classes extending Burger and ColdDrink classes
public class ChickenBurger extends Burger {

	@Override
	public String name() {

		return "Chicken Burger";
	}

	@Override
	public float price() {

		return 50.5f;
	}

}
