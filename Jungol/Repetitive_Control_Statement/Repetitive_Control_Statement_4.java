
import java.util.Scanner;

/*정수를 계속 입력받다가 100 이상의 수가 입력이 되면 
마지막 입력된 수를 포함하여 합계와 평균을 출력하는 프로그램을 작성하시오.
(평균은 반올림하여 소수 첫째자리까지 출력한다.)
 */

public class Repetitive_Control_Statement_4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		int A = 0 ;
		int sum = 0 ;
		int i = 0 ;
		double avg ;
		
		while (A <= 99) {
			A = scanner.nextInt();
			sum = sum + A ;
			i++ ;
		}

		avg = (double)sum / i ;
		
		System.out.println(""+sum+"");
		System.out.printf("%.1f",avg);
	}
}