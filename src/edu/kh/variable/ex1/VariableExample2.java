package edu.kh.variable.ex1;

public class VariableExample2 {
	
	public static void main (String[] args) {
		/* 자바 기본 자료형 8가지
		 * 
		 * 논리형 : boolean (1byte)
		 * 정수형 : byte(1byte), short(2byte), int(4byte), long(8byte)
		 * 실수형 : float(4byte), double(8byte)
		 * 문자형 : char(2byte, 유니코드) 
		 * 
		 */
		
		//변수 선언 : 메모리에 값을 저장할 공간을 할당하는 것
		//변수 값 대입 : 변수에 값을 집어 넣는 것 = 초기화 
		
		boolean booleanData;
		//메모리에 논리값(t/f)을 저장할 공간 1byte를 할당하고 그 공간을 booleanData라고 부른다
		
		booleanData = true;
		// = : 대입연산자 -> 오른쪽에 있는 값을 왼쪽에 대입하겠다
		
		System.out.println("booleanData: "+ booleanData);
		
		byte byteNumber = 127;
		
		System.out.println("byteNumber: "+ byteNumber);
		/* 메모리에 정수값을 저장할 공간 1byte를 할당하고
		 * 할당된 공간을 byteNumber라고 부르겠다
		 * 그리고 선언된 byteNumber 변수에 처음 127넣었다
		 * 처음 변수에 대입하는 것을 초기화라고 한다 
		 */
		short shortNumber = 32767; // 변수 선언 및 초기화 
		
		int intNumber = 2147483647;
		// 변수 선언 및 초기화
		//대입되는 값(데이터)를 리터럴이라고도 한다 
		// + 자료형에 따라 리터럴 표기법이 다르다
		
		//정수 자료형의 기본형은 int이다 (short, byte는 옛날 코드의 잔재)
		
		long longNumber = 10000000000L; // 소문자 대문자 상관 없이 L을 써주어야한다
		//100억이라는 값은 범위를 벗어남. 뒤에 L을 붙여 long 자료형인 것을 나타낸다
		
		//실수형
		float floatNumber = 1.2345F; // 소문자 대문자 상관 없이 F를 써주어야한다
		//기본적으로 실수형은 double로 인식하기 때문에 뒤에 F를 붙여 자료형이 float임을 표기하다
		
		double doubleNumber = 3.141592;
		// d를 뒤에 쓸 수는 있다. 기본적으로 double로 인식한다
		
		// 문자형 리터럴 표기법: ' ' (홑따옴표)
		// -> 문자 하나만 나타냄
		
		char ch = 'A';
		char ch2 = 66;
		
		System.out.println("ch2:" + ch2);
		
		/* char 자료형에 숫자가 대입될 수 있는 이유 
		 * - 컴퓨터에는 문자표가 존재하고 있는데 
		 * 숫자에 따라 지정된 문자 모양이 매핑되어있고 
		 * 'B'문자 그대로가 대입되면 변수가 숫자 66으로 변한되어 저장된다
		 *  --> 반대로 생각하면 변수에 66이라는 숫자를 저장하는 것이 가능하다.
		 */
		
		/*
		 *변수의 명명 규칙
		 * 1. 대소문자가 구분되며 길이 제한이 없다.
		 * 2. 예약어를 사용하면 안 된다.
		 * 3. 숫자로 시작하면 안 된다.
		 * 4. 특수문자는 '_'와 '$'만을 허용한다.
		 * 5. 여러 단어 이름은 단어의 첫 글자를 대문자로 한다. 
		 *    다만 첫 시작 글자는 소문자로 하는 것이 관례이다. (Camel Case)
		 * 6. 변수명은 언어를 가리지 않는다. (다만 영어로만 사용한다.)
         */
		
		int $intNumber; //문제는 없지만 굳이 사용 안 한다.
		int int_number; //자바는 카멜표기법을 쓰기 때문에, _로 띄어쓰기 표기하지 않는다. 
		
		//----------------------------------------------------------------
		
		int number = 10;
		System.out.println("number: " + number); //10
		
		number = 20;
		System.out.println("number: " + number); //20
		
		//number는 변수이므로 새로운 값을 대입할 수 있다. 
		
		/* 상수(항상 같은 수) 
		 * - 변수의 한 종류
		 * - 한 번 값이 대입되면 다른 값 대인이 불가
		 * - 자료형 앞에 final 키워드를 작성 (마지막 대입되는 값)
		 * - 상수 명명 규칙 : 모두 대문자, 여러 단어 작성 시 "_" 사용
		 * - 상수를 사용하는 경우
		 *   1) 변하면 안되는 고정된 값을 저장할 때
		 *   2) 특정한 값에 의미를 부여하는 경우
		 * 
		 */
		
		final double PI_VALUE = 3.14;
		// PI_VALUE = 2.3;  // 에러가 난다! final로 상수 선언하였기에 수정 불가
	
			}
}
