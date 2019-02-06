package superheroes;

public abstract class SuperHero {

	private String name;
	private int stamina;

	public SuperHero(String name) {
		this.name = name;
		this.setStamina(10);
	}

	public String getName() {
		return name;
	}

	public int getStamina() {
		return stamina;
	}

	public void walkOnWater() {
		setStamina(getStamina() + 5);
	}

	public void setStamina(int stamina) {
		this.stamina = stamina;
	}

}