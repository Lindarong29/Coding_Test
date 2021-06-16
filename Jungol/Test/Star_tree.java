import java.util.*;

public class Star_tree {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("줄 수를 입력하세요");
		int A = scanner.nextInt();
		String Star="";
		
		for (int line=1; line<=A; line++) {
			
			for (int times=1; times<=line; times++ )
				{
				Star += "*";
				}
			Star += "\n";
		}
		System.out.printf("%s",Star);
	}
}
