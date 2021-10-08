import java.util.Scanner;

public class Main3 {
	public static void main(String args[]) {
		Scanner scan = new Scanner(System.in);
		
		int alphaArr[] = new int[26];
		
		char charArr[] = scan.next().toCharArray();
		scan.close();
		
		for(int i=0; i<alphaArr.length; i++) {
			alphaArr[i] = -1;
		}
		
		for(int i=0; i<charArr.length; i++) {
			if(alphaArr[(int)charArr[i]-97] == -1) {
				alphaArr[(int)charArr[i]-97] = i;
			}
		}
		
		for(int i=0; i<alphaArr.length; i++) {
			System.out.print(alphaArr[i]+" ");
		}
		
	}
}
