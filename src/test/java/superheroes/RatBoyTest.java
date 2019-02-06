package superheroes;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

public class RatBoyTest {
	
	RatBoy underTest;

	@Before
	public void setup() {
		underTest = new RatBoy("Herbert");
	}
	
	@Test
	public void shouldBeShamed() {
		int selfLoathingBeforeShame = underTest.getSelfLoathing();
		underTest.beShamed();
		int selfLoathingAfterShame = underTest.getSelfLoathing();
		
		assertEquals(selfLoathingBeforeShame + 5, selfLoathingAfterShame);
	}
	
	@Test
	public void shouldHaveName() {
		assertEquals(underTest.getName(), "Herbert");
	}
	
	@Test
	public void shouldWalkOnWater() {
		int staminaBeforeWalk = underTest.getStamina();
		underTest.walkOnWater();
		int staminaAfterWalk = underTest.getStamina();
		
		assertEquals(staminaAfterWalk, staminaBeforeWalk + 5);
	}
}
