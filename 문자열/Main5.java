import java.util.Scanner;

public class Main5 {
	public static void main(String args[]) {
		Scanner scan = new Scanner(System.in);
		
		char charArr[] = scan.next().toCharArray();
		
		scan.close();
		
		int num[] = new int[26];
		
		for(int i=0; i<num.length; i++) {
			num[i]=0;
		}
		
		for(int i=0; i<charArr.length; i++) {
			if(65<=(int)charArr[i]&&90>=(int)charArr[i]) {
				num[(int)charArr[i]-65]++;
			}else if(97<=(int)charArr[i]&&122>=(int)charArr[i]) {
				num[(int)charArr[i]-97]++;
			}
		}
		
		int sum = 0;
		
		char a = ' ';
		
		for(int i=0; i<num.length; i++) {
			if(num[i] > sum) {
				sum = num[i];
				a = (char)(i+65);
			}
			else if(sum != 0 && num[i] == sum)
				a = '?';
		}
		
		System.out.print(a);
		
	}
}
