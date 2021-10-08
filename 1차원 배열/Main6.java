import java.util.Arrays;
import java.util.Scanner;

public class Main6 {
	public static void main(String args[]) {
		Scanner scan = new Scanner(System.in);
		
		int num = scan.nextInt();
		String score[] = new String[num];
		int sum[] = new int[num];
		
		for(int i=0; i<score.length; i++) {
			score[i] = scan.next();
			sum[i] = 0;
		}
		
		for(int i=0; i<score.length; i++) {
			String arr[] = score[i].split("");
			int a = 1;
			
			for(int j=0; j<arr.length; j++) {
				if(arr[j].equals("O")) {
					sum[i] = sum[i] + a;
					a++;
				} else {
					a = 1;
				}
			}
		}
		
		for(int i=0; i<score.length; i++) {
			System.out.println(sum[i]);
		}
		
		scan.close();
		
	}
}
