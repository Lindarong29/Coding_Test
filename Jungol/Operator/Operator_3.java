/* 한 개의 정수를 입력 받아서 후치증가 연산자를 사용하여 출력한 후 
 * 전치 증가 연산자를 사용하여 출력하는프로그램을 작성하시오. */

import java.util.*;
public class Operator_3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		int A = scanner.nextInt();
		// A++ 후치증가연산자, ++A 전치증가연산자
		// 우선순위가 달라!
		System.out.printf("%d\n",A++); //프린트 후에 1증가
		//프린트 결과는 5, 현재 A=6
		System.out.printf("%d",++A); //1증가 후에 프린트
		//프린트 결과 = 현재 A = 7
	}

}
