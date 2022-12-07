package edu.kh.variable.ex2;

import java.util.Scanner;

public class ScannerExample1 {
	
	public static void main (String[] args) {
		
		// Scanner : 프로그램 실행 중 키보드 입력을 받을 수 있게 하는 역할
		
		// Scanner 생성
		// -> 프로그램 안에 스캐너라는 기계를 만든 것
		Scanner sc = new Scanner(System.in);
		// import를 하지 않으면 오류가 나온다. 
		// Scanner를 만들 설계도를 java.util.Scanner에서 import한다. 
		System.out.print("값을 입력하시오: ");
		int input1 = sc.nextInt();
		// 입력받은 정수롤 input1이라는 변수에 대입
		// nextInt() : 다음 입력된 정수를 읽어옴
		System.out.println(input1);
		
		System.out.print("실수를 입력하시오: ");
		double input2 = sc.nextDouble();
		
		System.out.println(input2);
		
		System.out.print("입력1: ");
		String input3 = sc.next(); // next() : 다음에 입력된 한 단어를 읽어옴
		System.out.println(input3);
		
		System.out.print("입력2: ");
		String input4 = input3 + sc.next(); // input3과 함께 다음에 입력한 값이 같이 저장된다.
		System.out.println(input4);
		
		String defending = sc.nextLine();
		System.out.print("문장 입력: ");
		String input5 = sc.nextLine();  // nextLine(); : 단어가 아닌 문장을 읽어준다.
		System.out.println(input5);
		
	}

}
