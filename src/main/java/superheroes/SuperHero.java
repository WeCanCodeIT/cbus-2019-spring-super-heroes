package superheroes;

public abstract class SuperHero {

	private String name;
	private int stamina;

	public SuperHero(String name) {
		this.name = name;
		this.stamina = 10;
	}

	public String getName() {
		return name;
	}

	public int getStamina() {
		return stamina;
	}

	// OfficePerson can't do this...
//	public void walkOnWater() {
//		increaseStaminaByFive();
//	}

	// These are bad - DO NOT USE
//	public void setStamina(int stamina) {
//		this.stamina = stamina;
//	}
	
	// Do this instead :)
	public void increaseStaminaByFive() {
		this.stamina += 5;
	}
	
	public void decreaseStaminaByTwo() {
		this.stamina -= 2;
	}

}