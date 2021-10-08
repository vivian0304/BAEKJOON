import java.util.Scanner;

public class Main4 {
	public static void main(String args[]) {
		Scanner scan = new Scanner(System.in);
		
		int num = scan.nextInt();
		int alphaArr[] = new int[num];
		char charArr[][] = new char[1000][];
		
		for(int i=0; i<num; i++) {
			alphaArr[i] = scan.nextInt();
			charArr[i] = scan.next().toCharArray();
		}
		
		scan.close();
		
		for(int i=0; i<num; i++) {
			for(int j=0; j<charArr[i].length; j++)
				for(int a=0; a<alphaArr[i]; a++)
					System.out.print(charArr[i][j]);
			System.out.println();
		}
		
	}
}
