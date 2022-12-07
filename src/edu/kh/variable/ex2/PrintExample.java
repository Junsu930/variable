package edu.kh.variable.ex2;

public class PrintExample {
	
	public static void main(String[] args) {
		
		// System.out.println( ); : 한 줄 출력(출력 후 줄바꿈 수행 == 개행)
		// System.out.print( );   : 단순 출력 (출력 후 줄바꿈 X)
		// 줄바꿈이라는 차이점이 있지만, 괄호 안의 내용이 그대로 출력된다는 것은 같음
		
		System.out.println("테스트1");
		System.out.println("테스트2");
   
		System.out.print("테스트3");
		System.out.println(); //단순 개행 (줄바꿈)
		System.out.print("테스트4");
		System.out.println();
		
		//System.out.printf(); : 출력될 문자열 형식을 패턴으로 지정하는 출력구문
		
		int iNum1 = 10;
		int iNum2 = 5;
		
		// 10 + 5 = 15
		System.out.println( iNum1 + " + " + iNum2 + " = " + (iNum1 + iNum2) );
	    System.out.printf("%d + %d = %d\n", iNum1, iNum2, iNum1+iNum2);
	   
	    //printf도 print와 같이 개행이 되지 않기 때문에
	    //\n과 같은 개행문자(escape)를 사용하여 다음 줄로 개행 가능 
	    
	    System.out.printf("%d + %d * %d / %d = %d \n", iNum1, iNum1, iNum2,
	    		         2 , iNum1 + iNum1 * iNum2 / 2 );
	    	
	    int iNum3 = 3;
	    System.out.printf("%5d\n", iNum3);  // 5칸 공간 확보 후 오른쪽 정렬
	    System.out.printf("%-5d\n", iNum3); // 5칸 공간 확보 후 왼쪽 정렬
	    
	    // 소수점 자리 제어 
	    System.out.printf("%f\n", 2.5); // 2.500000
	    System.out.printf("%.2f\n", 2.5); // 소수점 둘쨰자리까지만 나타내고 싶다.
	    System.out.printf("%.0f\n", 2.5); // 소수점 아래 표시하지 않겠다. -> 반올림됨
	    
	    // escape (이스케이프 == 탈출) 문자 : 일반 문자가 아닌 특수문자 표현 
	    System.out.println("\\"); // 백슬래쉬 출력법
	    System.out.println("a\tb\tc\td"); //tap 일정 공간만큼 띄어쓰기 (1칸차지)
	    
	    System.out.println("\"");  //" 하나를 출력
	    System.out.println("\u0041"); // 유니코드 넘버로 문자 출력 
	}
}
