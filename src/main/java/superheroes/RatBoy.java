package superheroes;

public class RatBoy extends SuperHero {
	
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

}
