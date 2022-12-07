package edu.kh.variable.ex1;

public class VariableExample3 {
	
	public static void main (String[] args) {
		/* 형변환(casting) - 값의 자료형을 변환하는 것 (boolean 제외)
		 * 
		 * 형변환이 필요한 이유는?
		 * 컴퓨터는 기본적으로 같은 자료형끼리만 연산 가능하다.
		 * 다른 자료형끼리 연산할 시 오류 발생
		 * --> 이 상황을 해결하기 위해 필요한 기술이 형변환이다. 
		 * 자동/강제 형변환이 존재한다. 
		 *  
		 */
		
		//자동 형변환 
		// - [값의 범위]가 큰 자료형과 [값의 범위]가 작은 자료형 연산 시 
		// 컴파일러가 작은 자료형을 자동으로 큰 자료형으로 변환시킨다.
		
		int num1 = 10;
		double num2 = 3.5;
		System.out.println(num1+ num2); 
		//자료형이 달라 오류가 발생해야 하지만 컴파일러가 자동 형변환을 하여 오류가 없다.
		
		int i1 = 3; 
		double d1 = i1;
		System.out.println("i1: " + i1);
		System.out.println("d1: " + d1);
		
		System.out.println(d1 + num2); //double형끼리의 덧셈이 된다
		
		//char 문자형 자료형 
        //char 자료형은 문자형이지만 실제 저장하는 값은 
		//0부터 6만5천 사이에 있는 숫자
		
		char ch = 'V';
		int i3 = ch; //int 변수로 자동 형변환 된다. 
		
		System.out.println("i3: " + i3);
		
		
	}

}
