package superheroes;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

public class SquirrelGirlTest {
	
	SquirrelGirl underTest;
	
	@Before
	public void setup() {		
		underTest = new SquirrelGirl("Tonya");
	}

	@Test
	public void shouldBeAbleToFly() {
		underTest.toggleIsFlying();

		assertEquals(true, underTest.isFlying());
	}

	@Test
	public void shouldBeAbleToLand() {

		// Make Tonya fly
		underTest.toggleIsFlying();
		// Make Tonya land
		underTest.toggleIsFlying();

		assertEquals(false, underTest.isFlying());
	}

	@Test
	public void shouldBeAbleToPunch() {
		
		int staminaBeforePunch = underTest.getStamina();
		underTest.punch();
		int staminaAfterPunch = underTest.getStamina();
		
		assertEquals(staminaAfterPunch, staminaBeforePunch - 2);
	}
	
	@Test
	public void shouldHaveName() {
		assertEquals(underTest.getName(), "Tonya");
	}
	
	@Test
	public void shouldWalkOnWater() {
		int staminaBeforeWalk = underTest.getStamina();
		underTest.walkOnWater();
		int staminaAfterWalk = underTest.getStamina();
		
		assertEquals(staminaAfterWalk, staminaBeforeWalk + 5);
	}
}
