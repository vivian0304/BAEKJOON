// 문제 번호 3052

import java.util.Arrays;
import java.util.Scanner;

public class Main4 {
	public static void main(String args[]) {
		Scanner scan = new Scanner(System.in);
		
		int num[] = new int[10];
		int div[] = new int[10];
		
		for(int i=0; i<num.length; i++) {
			num[i] = scan.nextInt();
		}
		
		for(int i=0; i<div.length; i++) {
			div[i] = num[i]%42;
		}
		
		int sum = 1;
		Arrays.sort(div);
		
		for(int i=1; i<div.length; i++) {
			if(div[i-1] != div[i])
				sum++;
		}
		
		System.out.print(sum);
		
		scan.close();
	}
}
