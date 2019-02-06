package superheroes;

public class OfficePerson extends SuperHero {

	public OfficePerson(String string) {
		super(string);
	}

	public void drinkCoffee() {
		setStamina(getStamina() + 5);
	}

}
