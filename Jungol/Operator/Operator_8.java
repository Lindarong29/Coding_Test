/*3개의 정수를 입력 받아 
 * 첫 번째 수가 가장 크면 1 아니면 0을 출력하고 
 * 세 개의 수가 모두 같으면 1 아니면 0을 출력하는 프로그램을 작성하시오.
 * (JAVA는 1이면 true, 0이면 false를 출력한다.)
*/
import java.util.*;
public class Operator_8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		int A = scanner.nextInt();
		int B = scanner.nextInt();
		int C = scanner.nextInt();
		
		if ((A>B)&&(A>C)) {
			System.out.printf("%s ","true");
		}
		else {
			System.out.printf("%s ","false");
		}
		
		if ((A==B)&&(B==C)) {
			System.out.printf("%s ","true");
		}
		else {
			System.out.printf("%s ","false");
		}
	}

}
