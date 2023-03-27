package chap01;

public class CharToCode {

	public static void main(String[] args) {
		char ch = 'A';	// char ch =65;
		int intCode = 'B';
		
		System.out.printf("%c = %d\n", ch, intCode);
		
		char character = 'a';
		//int charCode =  (int)characterC;
		int charCode = (int)character;
		System.out.printf("%c = %d\n", character, charCode);
		System.out.printf("%d = %d", ch, intCode);

	}

}
