import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class RandomTest {

	static RandomCharacter random;
	@BeforeAll
	static void setUpBeforeClass() throws Exception {
		random = new RandomCharacter();
	}

	@Test
	void testGetRandomLowerCaseLetter() {
		char check = random.getRandomLowerCaseLetter();
		assertTrue(Character.isLowerCase(check));
	}

	@Test
	void testGetRandomUpperCaseLetter() {
		char check = random.getRandomUpperCaseLetter();
		assertTrue(Character.isUpperCase(check));
	}

	@Test
	void testGetRandomDigitCharacter() {
		int check = random.getRandomDigitCharacter();
		assertTrue(Character.isDigit(check));
	}

	@Test
	void testGetRandomCharacter() {
		char check = random.getRandomCharacter();
		assertTrue(Character.isLetterOrDigit(check));
	}

	@Test
	void testGetPrime() {
		int check = random.getPrime();
		System.out.println(check);
		boolean flag = false;
		for (int i = 0; i <= check/2; ++i) {
			if (check % i == 0) {
				flag = true;
				break;
			}
		}
		assertTrue(!flag);
	}

}
