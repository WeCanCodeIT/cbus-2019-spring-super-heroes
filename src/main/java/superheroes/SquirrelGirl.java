package superheroes;

public class SquirrelGirl extends SuperHero implements CanWalkOnWater {
	
	private boolean isFlying;

	public SquirrelGirl(String name) {
		super(name);
		// Any SquirrelGirl will be initialized NOT flying
		this.isFlying = false;
	}

	public void toggleIsFlying() {
		isFlying = !isFlying;
	}

	public boolean isFlying() {
		return isFlying;
	}

	public void punch() {
//		setStamina(getStamina() - 2);
		this.decreaseStaminaByTwo();
	}

	@Override
	public void walkOnWater() {
		this.increaseStaminaByFive();	
	}

}
