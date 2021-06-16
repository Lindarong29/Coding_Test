import java.util.Scanner;

/* 문자열 "~!@#$^&*()_+|" 를 출력하는 함수를 작성하고 
 * 정수를 입력받아 입력받은 수만큼 함수를 호출하는 프로그램을 작성하시오.
 */

public class Function1 {

	public static void print() {
		System.out.println("~!@#$^&*()_+|");
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		int num = scanner.nextInt();
		
		if (num>0) {
			for (int i=0;  i<num; i++) {
				print();
		}
	}

}
}
