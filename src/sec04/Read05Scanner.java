package sec04;

import java.util.Scanner;
/*
 * Scanner 객체로 문자열을 읽얻들여서 숫자로 변환한 후에 연산하는 예제
 */

public class Read05Scanner {//c s

	public static void main(String[] args) {// m s
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("첫번째 수 : ");
		String strNum1 = scanner.nextLine();
		
		System.out.println("두번째 수 : ");
		String strNum2 = scanner.nextLine();
		// 읽어들인 문자열을 숫자로 변환
		int num1 = Integer.parseInt(strNum1);	// 브라우저에서 넘어오는 숫자는 문자열 10으로 들어오기때문에 Integer.parseInt해서 int형변환 해야한다.
		int num2 = Integer.parseInt(strNum2);	
		int result = num1+num2;
		System.out.println("덧셈결과 : "+result);
		
		scanner.close();
		
		

	}// m e

}// c e
