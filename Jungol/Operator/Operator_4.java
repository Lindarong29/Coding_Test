/* 두 개의 정수를 입력받아서
 * 첫 번째 수는 후치 증가 연산자를 사용하고
 * 두 번째 수는 전치 감소 연산자를 사용하여
 * 두 수의 곱을 구한 후 각각의 값을 출력하는 프로그램을 작성하시오.
 */

import java.util.*;
public class Operator_4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		int A = scanner.nextInt();
		int B = scanner.nextInt();
		int C = A++;
		int D = --B;
		
		System.out.printf("%d %d %d",A,B,C*D);
	}
}
