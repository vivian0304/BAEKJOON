// 문제 번호 1546

import java.util.Arrays;
import java.util.Scanner;

public class Main5 {
	public static void main(String args[]) {
		Scanner scan = new Scanner(System.in);
		
		int num = scan.nextInt();
		double score[] = new double[num];
		
		for(int i=0; i<score.length; i++) {
			score[i] = scan.nextInt();
		}
		
		scan.close();
		
		Arrays.sort(score);
		
		double sum = 0;
		
		for(int i=0; i<score.length; i++) {
			sum += (score[i]/score[score.length-1])*100;
		}
		
		System.out.print(sum/score.length);
	}
}
