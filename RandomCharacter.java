import java.util.Random;

public class RandomCharacter {

	public char getRandomLowerCaseLetter() {
		Random r = new Random();
		char lower = (char)(r.nextInt(26) + 'a');
		return lower;
	}
	
	public char getRandomUpperCaseLetter() {
		Random r = new Random();
		char upper = (char)(r.nextInt(26) + 'A');
		return upper;
	}
	
	public int getRandomDigitCharacter() {
		Random r = new Random();
		int digit = r.nextInt(9);
		return digit;
	}
	
	public  char getRandomCharacter() {
		Random r = new Random();
		char c = (char)(r.nextInt(95) + 32);
		return c;
	}
	
	public boolean isPrime(int num) {
		if (num <= 1) {
			return false;
		}
		else {
			for (int i = 2; i < num; i++) {
				if(num % i == 0) {
					return false;
				}
			}
			return true;
		}
	}
	
	public int getPrime() {
		Random r = new Random();
		int num = r.nextInt(100) + 1;
		while(!isPrime(num)) {
			num = r.nextInt(100) + 1;
		}
		return num;
	}

}
