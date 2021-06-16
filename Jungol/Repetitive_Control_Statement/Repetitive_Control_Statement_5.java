
import java.util.Scanner;

/*정수를 입력받아서 3의 배수가 아닌 경우에는 아무 작업도 하지 않고 
3의 배수인 경우에는 3으로 나눈몫을 출력하는 작업을 반복하다가
-1이 입력되면 종료하는 프로그램을 작성하시오.
 */

public class Repetitive_Control_Statement_5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		int A = 0 ;

		
		while (A != -1) {
			A = scanner.nextInt();
			
			if (A%3 == 0){ //A가 3의 배수이면
				System.out.printf("%d\n", (A/3));
			}
			
			
		}

		
	}
}