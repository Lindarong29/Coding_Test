import java.util.Scanner;

public class Selection_Control_Statement_4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		Double A = scanner.nextDouble();
		
		if (A<= 50.80) {
			System.out.println("Flyweight");
		}
		
		else if (A <= 61.23) {
			System.out.println("Lightweight");
		}
		
		else if (A <= 72.57) {
			System.out.println("Middleweight");
		}
		
		else if (A <= 88.45) { 
			System.out.println("Cruiserweight");
		}

		else {
			System.out.println("Heavyweight");
		}
	}

}
