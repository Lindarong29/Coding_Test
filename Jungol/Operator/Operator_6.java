/*두 개의 정수를 입력받아서 다음과 같이 4가지 관계연산자의 결과를 출력하시오.
이때 입력받은 두 정수를 이용하여 출력하시오.
(JAVA는 1이면 true, 0이면 false를 출력한다.)*/
/* 4 > 5 --- 0
4 < 5 --- 1
4 >= 5 --- 0
4 <= 5 --- 1 */

import java.util.*;
public class Operator_6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		int A = scanner.nextInt();
		int B = scanner.nextInt();
		
		System.out.printf("%d > %d --- ",A,B);
			if (A>B) {
				System.out.println("true");
			}
			else {
				System.out.println("false");
			}
			
		System.out.printf("%d < %d --- ",A,B);
			if (A<B) {
				System.out.println("true");
			}
			else {
			System.out.println("false");
			}
			
		System.out.printf("%d >= %d --- ",A,B);
			if (A>=B) {
				System.out.println("true");
			}
			else {
				System.out.println("false");
			}
			
		System.out.printf("%d <= %d --- ",A,B);
			if (A<=B) {
				System.out.println("true");
			}
			else {
				System.out.println("false");
			}
	}
}
