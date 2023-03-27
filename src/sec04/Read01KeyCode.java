package sec04;

/*
  키보드에서 캐릭터(char)를 읽어들이는 예제
  import 구문으로 자바 AIP 사용
 */

import java.io.IOException;

public class Read01KeyCode {

	public static void main(String[] args) throws IOException{
		int keyCode;
		
		keyCode = System.in.read();		//key를 입력 받으면 하나의 값을 받겠다.
		System.out.println("keyCode : " + keyCode);
		
		keyCode = System.in.read();
		System.out.println("keyCode : " + keyCode);
		
		keyCode = System.in.read();
		System.out.println("keyCode : " + keyCode);
		
		// 두개가 따라 붙음
		
	}

}
