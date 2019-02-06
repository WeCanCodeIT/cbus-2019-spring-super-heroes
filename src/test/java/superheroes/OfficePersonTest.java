package superheroes;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

public class OfficePersonTest {
	
	OfficePerson underTest;

	@Before
	public void setup() {
		underTest = new OfficePerson("Dwigt");
	}
	
	@Test
	public void sholdGainStaminaFromCoffee() {
		int staminaPreCoffee = underTest.getStamina();
		underTest.drinkCoffee();
		int staminaPostCoffee = underTest.getStamina();
		
		assertEquals(staminaPreCoffee + 5, staminaPostCoffee);
	}
}
