// 문제 번호 11720

import java.util.Scanner;

public class Main2 {
	public static void main(String args[]) {
		Scanner scan = new Scanner(System.in);
		
		int num = scan.nextInt();
		char charArr[] = new char[num];
		
		charArr = scan.next().toCharArray();
		
		int sum = 0;
		for(int i=0; i<charArr.length; i++) {
			sum += charArr[i] - '0';
		}
		
		System.out.print(sum);
		
		scan.close();
	}
}
