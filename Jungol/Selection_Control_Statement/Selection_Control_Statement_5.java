
/*두 개의 실수를 입력받아 모두 4.0 이상이면 "A", 
 * 모두 3.0 이상이면 "B", 아니면 "C" 라고 출력하는 프로그램을 작성하시오.*/

import java.util.Scanner;
public class Selection_Control_Statement_5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		Double A = scanner.nextDouble();
		Double B = scanner.nextDouble();
		
		if (A>=4.0 && B>= 4.0) {
			System.out.println("A");
		}
		
		else if (A>=3.0 && B>=3.0) {
			System.out.println("B");
		}
		
		else {
			System.out.println("C");
		}
	}

}
