/* 두 개의 정수를 입력받아서, 
첫 번째 줄에는 두 정수의 값이 같으면 1 아니면 0을 출력하고, 
두 번째 줄에는 같지 않으면 1 같으면 0을 출력하는 프로그램을 작성하시오.
(JAVA는 1이면 true, 0이면 false를 출력한다.)
*/

import java.util.*;
public class Operator_5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		int A = scanner.nextInt();
		int B = scanner.nextInt();
		
		//같으면 
		if (A==B) {
			System.out.printf("%s\n","true");
		}		
		else {
			System.out.printf("%s\n","false");
		}
		
		//다르면
		if (A!=B) {
			System.out.printf("%s\n","true");
		}
		else {
			System.out.printf("%s\n","false");
		}
	}

}
