import java.util.Scanner;

public class Main7 {
	public static void main(String args[]) {
		Scanner scan = new Scanner(System.in);
		
		String a[] = scan.next().split("");
		String b[] = scan.next().split("");
		
		String newa = "";
		String newb = "";
		
		scan.close();
		
		for(int i=0; i<3; i++) {
			newa += a[3-i-1];
			newb += b[3-i-1];
		}
		
		int num1 = Integer.parseInt(newa), num2 = Integer.parseInt(newb);
		
		if(num1 > num2)
			System.out.print(num1);
		else if(num1 < num2)
			System.out.print(num2);
		
	}
}
