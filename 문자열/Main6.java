// 문제 번호 1152

import java.util.Scanner;

public class Main6 {
	public static void main(String args[]) {
		Scanner scan = new Scanner(System.in);
		
		String a = scan.nextLine().trim();
		
		scan.close();
		
		if(a.isEmpty()) {
			System.out.println(0);
		} else {
			String num[] = a.split(" ");
			System.out.println(num.length);
		}
		
		
	}
}
