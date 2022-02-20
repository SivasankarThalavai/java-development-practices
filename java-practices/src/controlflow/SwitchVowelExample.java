package controlflow;

public class SwitchVowelExample {

	public static void main(String[] args) {

		char ch = 'O';

		String strCh = String.valueOf(ch).toUpperCase();

		switch (strCh) {

		case "A":
			System.out.println("Vowel");
			break;
		case "E":
			System.out.println("Vowel");
			break;
		case "I":
			System.out.println("Vowel");
			break;
		case "O":
			System.out.println("Vowel");
			break;
		case "U":
			System.out.println("Vowel");
			break;

		default:
			System.out.println("Consonant");
		}
	}
}