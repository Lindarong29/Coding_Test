/*[JAVA]
2개의 정수를 입력 받아서 0이 아니면 참(true), 0이면 거짓(false)으로 처리하고
두 값의 논리곱과 논리합의 결과를 출력하는 프로그램을 작성하시오.
​hint : 정수 a를 입력받은 후 boolean c = (a != 0);을 실행하면 c에 a의 논리값이 저장된다.
*/

import java.util.*;
public class Operator_7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		int A = scanner.nextInt();
		int B = scanner.nextInt();
		
		// C에 A의 논리값 저장. 0이 아니면 참 , 0이면 거짓
		boolean C = (A != 0);
		// D에 B의 논리값 저장. 0이 아니면 참 , 0이면 거짓
		boolean D = (B != 0);
		
		//논리곱&& 논리합\\
        System.out.println((C && D) + " " + (C || D));

	}

}
