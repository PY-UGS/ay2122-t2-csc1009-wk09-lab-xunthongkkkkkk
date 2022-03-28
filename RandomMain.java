
public class RandomMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		RandomCharacter r = new RandomCharacter();
		
		System.out.println("1. Random Lower Case Character");
		for(int i = 0; i < 15; i++) {
			System.out.print(r.getRandomLowerCaseLetter());
		}
		
		System.out.println("\n2. Random Upper Case Character");
		for(int i = 0; i < 15; i++) {
			System.out.print(r.getRandomUpperCaseLetter());
		}
		
		System.out.println("\n3. Random Digit Character");
		for(int i = 0; i < 15; i++) {
			System.out.print(r.getRandomDigitCharacter());
		}
		
		System.out.println("\n4. Random Character");
		for(int i = 0; i < 15; i++) {
			System.out.print(r.getRandomCharacter());
		}
	}

}
