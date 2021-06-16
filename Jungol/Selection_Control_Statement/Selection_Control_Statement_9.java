import java.util.Scanner;

/*3개의 정수를 입력받아 조건연산자를 이용하여 입력받은 수들 중 
 * 최소값을 출력하는 프로그램을 작성하시오.*/

public class Selection_Control_Statement_9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		
		int A = scanner.nextInt();
		int B = scanner.nextInt();
		int C = scanner.nextInt();
		
		int min = (A < B) ? A : B ;
		min = (min < C ) ? min : C ;
		
		System.out.println(""+min+"");
	}

}
