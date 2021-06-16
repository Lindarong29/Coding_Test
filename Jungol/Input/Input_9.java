// 세 개의 실수를 입력 받아 반올림하여 소수 셋째 자리까지 출력하는 프로그램을 작성하시오.
import java.util.*;

public class Input_9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		double num1 = scanner.nextDouble();
		double num2 = scanner.nextDouble();
		double num3 = scanner.nextDouble();
		
		System.out.printf("%.3f\n",num1);
		System.out.printf("%.3f\n",num2);
		System.out.printf("%.3f\n",num3);
	}

}
