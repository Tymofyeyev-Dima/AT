package morseCode;

public class Tester {

	public static void main(String[] args) {
		MorseTree test = new MorseTree();
		test.toEnglish(".... . .-.. .-.. --- / -- -.-- / -. .- -- . / .. ... / -.. .. -- .-");
		System.out.println("");
		test.toMorse("HELLO MY NAME IS DIMA");
		System.out.println();
		test.toEnglish(".... . .-.. .-.. --- ");

	}

}
