import java.util.HashMap;

public class Morse {

	public static void main(String[] args) {

		toEnglish();
		toMorse();

	}

	public static void toEnglish() {

		HashMap<String, Character> morse = new HashMap<>();

		morse.put(".-", 'a');
		morse.put("-...", 'b');
		morse.put("-.-.", 'c');
		morse.put("-..", 'd');
		morse.put(".", 'e');
		morse.put("..-.", 'f');
		morse.put("--.", 'g');
		morse.put("....", 'h');
		morse.put("..", 'i');
		morse.put(".---", 'j');
		morse.put("-.-", 'k');
		morse.put(".-..", 'l');
		morse.put("--", 'm');
		morse.put("-.", 'n');
		morse.put("---", 'o');
		morse.put(".--.", 'p');
		morse.put("--.-", 'q');
		morse.put(".-.", 'r');
		morse.put("...", 's');
		morse.put("-", 't');
		morse.put("..-", 'u');
		morse.put("...-", 'v');
		morse.put(".--", 'w');
		morse.put("-..-", 'x');
		morse.put("-.--", 'y');
		morse.put("--..", 'z');
		morse.put(".----", '1');
		morse.put("..---", '2');
		morse.put("...--", '3');
		morse.put("....-", '4');
		morse.put(".....", '5');
		morse.put("-....", '6');
		morse.put("--...", '7');
		morse.put("---..", '8');
		morse.put("----.", '9');
		morse.put("-----", '0');
		morse.put("/", ' ');

		String string = ".... . .-.. .-.. --- / -.. .- .. .-.. -.-- / .--. .-. --- --. .-. .- -- -- . .-. / --. --- --- -.. / .-.. ..- -.-. -.- / --- -. / - .... . / -.-. .... .- .-.. .-.. . -. --. . ... / - --- -.. .- -.--";
		System.out.println("The user input is: \n" + string);
		System.out.println("Which returns: ");
		String[] parts = string.split(" ");
		for (int i = 0; i < parts.length; i++) {
			String a = parts[i];
			System.out.print(morse.get(a));
		}
	}

	public static void toMorse() {

		HashMap<Character, String> morse2 = new HashMap<>();

		morse2.put('a', ".-");
		morse2.put('b', "-...");
		morse2.put('c', "-.-");
		morse2.put('d', "-..");
		morse2.put('e', ".");
		morse2.put('f', "..-.");
		morse2.put('g', "--.");
		morse2.put('h', "....");
		morse2.put('i', "..");
		morse2.put('j', ".---");
		morse2.put('k', "-.");
		morse2.put('l', ".-..");
		morse2.put('m', "--");
		morse2.put('n', "-.");
		morse2.put('o', "---");
		morse2.put('p', ".--.");
		morse2.put('q', "--.-");
		morse2.put('r', ".-.");
		morse2.put('s', "...");
		morse2.put('t', "-");
		morse2.put('u', "..-");
		morse2.put('v', "...-");
		morse2.put('w', ".--");
		morse2.put('x', "-..-");
		morse2.put('y', "-.--");
		morse2.put('z', "--..");
		morse2.put('1', ".----");
		morse2.put('2', "..---");
		morse2.put('3', "...--");
		morse2.put('4', "....-");
		morse2.put('5', ".....");
		morse2.put('6', "-....");
		morse2.put('7', "--...");
		morse2.put('8', "---..");
		morse2.put('9', "----.");
		morse2.put('0', "-----");
		morse2.put(' ', "/");

		String string2 = "hello daily programmer good luck on the challenges today";
		System.out.println("\n\nThe user input is: \n" + string2);
		System.out.println("Which returns: ");
		char[] newparts = string2.toCharArray();
		for (int i = 0; i < newparts.length; i++) {
			char b = newparts[i];
			System.out.print(morse2.get(b));
		}
	}
}
