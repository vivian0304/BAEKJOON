import java.util.Arrays;
import java.util.Scanner;

public class Main7 {
	public static void main(String args[]) {
		Scanner scan = new Scanner(System.in);
		
		int num = scan.nextInt();
		int score[][] = new int[num][];
		double sum[] = new double[num];
		double p[] = new double[num];
		
		for(int i=0; i<score.length; i++) { // 입력
			score[i] = new int[scan.nextInt()];
			for(int j = 0; j<score[i].length; j++) {
				score[i][j] = scan.nextInt();
			}
			sum[i] = 0;
			p[i] = 0;
		}
		
		scan.close();
		
		for(int i=0; i<score.length; i++) { // 평균
			for(int j = 0; j<score[i].length; j++) {
				sum[i] += score[i][j];
			}
			sum[i] = (double)sum[i]/score[i].length;
		}
		
		for(int i=0; i<score.length; i++) { // 비율
			for(int j = 0; j<score[i].length; j++) {
				if(sum[i] < score[i][j]) {
					p[i]++;
				}
			}
			p[i] = p[i]/score[i].length*100;
		}
		
		for(int i=0; i<score.length; i++) { // 출력
			System.out.printf("%.3f",p[i]);
			System.out.println("%");
		}
	}
}
