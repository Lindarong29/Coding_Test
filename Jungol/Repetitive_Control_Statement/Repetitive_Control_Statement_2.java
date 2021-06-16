import java.util.Scanner;

/*100 이하의 양의 정수만 입력된다.
while 문을 이용하여 1부터 입력받은 정수까지의 
합을 구하여 출력하는 프로그램을 작성하시오. */

public class Repetitive_Control_Statement_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		int A = scanner.nextInt();
		int i = 1;
		int sum = 0 ;
		
		while (i<=A) {
			sum = sum + i;
			i ++;
		}
		
		System.out.println(""+sum+"");

	}
}