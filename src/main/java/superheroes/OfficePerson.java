package superheroes;

public class OfficePerson extends SuperHero {

	public OfficePerson(String string) {
		super(string);
	}

	public void drinkCoffee() {
		// How to use setters "properly"
//		setStamina(getStamina() + 5);
		this.increaseStaminaByFive();
	}

}
