/*2개의 실수(double)를 입력 받아서 
 * 두 수의 곱을 정수로 변환한 결과값과 두 수를 각각 정수로 변환하여 곱을 구한 결과값을 
 * 출력하는 프로그램을 작성하고 프로그램 내용에 관한 설명을 주석으로 표시하시오.
 */

import java.util.*;
public class Debugging_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		
		double a = scanner.nextDouble();
		double b = scanner.nextDouble();

		// 정수로 변환하려면 (int) 붙여
		System.out.printf("%d ", (int)(a*b)); // 두 수의 곱을 정수로 변환
		System.out.printf("%d",(int)a * (int)b); // 두 수를 정수로 변환 뒤 곱
	

	}
}