package sec04;

import java.io.IOException;
/*
  key Code 를 반복적으로 입력받는 예제
 */

public class Read03Continue { // c s

	public static void main(String[] args) throws IOException{	// m s
		/*
		int keyCode;
		
		while(true) {
			keyCode = System.in.read();
			System.out.println("keyCode : "+keyCode);
			if(keyCode == 113) { //q의 keyCode - 113 
				break;	// keyCode가 113가 동일할 경우 break; 실행
			}
		}
		*/
		
		  int keyCode;
		  char c;
		  while (true) { // 계속해서 키를 입력받는다.
		  	System.out.println("===================================");
		  	System.out.println("영어 알파벳과 숫자를 입력하세요.");
		  	
		  	//System.in.read(); //반환값이 int type
		  	keyCode = System.in.read();
		  	c = (char)keyCode;	//강제 형변환(문자로 변환)
		  	System.in.read();	//두번째로 입력되는 [CR]에 대응하는 13. 의미없는 숫자
		  	System.in.read();	//세번째로 입력되는 [LF]에 대응하는 10. 의미없는 숫자
		  	
		  	if(c>='0'&& c<='9') {//아스키코드 중에서 0~9 사이의 키가 눌렸는지 체크
		  		System.out.printf("key- %c 매핑 문자 %d 입니다.\n",c,keyCode);
		  	}else if((c>='a'&& c<='z') || (c>='A'&&c<='Z')){	//영문자
		  		System.out.printf("key- %c 매핑문자 %d 입니다.\n",c,keyCode);
		  	}
		  	
		  }
		  
		  
		

	} //m e

}// c e
