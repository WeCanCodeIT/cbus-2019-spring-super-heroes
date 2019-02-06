package superheroes;

public class RatBoy extends SuperHero implements CanWalkOnWater {
	
	private int selfLoathing;
	
	public RatBoy(String name) {
		super(name);
		this.selfLoathing = 10;
	}

	public int getSelfLoathing() {
		return selfLoathing;
	}

	public void beShamed() {
		selfLoathing += 5;
	}

	@Override
	public void walkOnWater() {
		this.increaseStaminaByFive();
	}

}
