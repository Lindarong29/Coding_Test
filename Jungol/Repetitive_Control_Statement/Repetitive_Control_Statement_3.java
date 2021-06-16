
import java.util.Scanner;

/*한 개의 정수를 입력받아 양수(positive integer)인지 
 * 음수(negative number)인지 출력하는 작업을 반복하다가 
 * 0이 입력되면 종료하는 프로그램을 작성하시오.
 */

public class Repetitive_Control_Statement_3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		
		int num = -1;
		
		while (num != 0) { //num이 0이 아닐 때 실행. 0이면 종료
			
			System.out.printf("number? ");
			num = scanner.nextInt();
			
			if (num < 0) {
				System.out.println("negative number");
			}
			
			else if (num >0) {
				System.out.println("positive integer");
			}
			
		}

	}
}