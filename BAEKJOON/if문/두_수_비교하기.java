import java.util.*;
public class 두_수_비교하기 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		int A = scanner.nextInt();
		int B = scanner.nextInt();
		
		if (A>B) {
			System.out.println(">");
		}
		
		else if (A<B) {
			System.out.println("<");
		}
		
		else {
			System.out.println("==");
		}
	}

}
