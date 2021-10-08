import java.util.LinkedList;
import java.util.Scanner;

public class Main3{
    public static void main(String args[]){
        Scanner scan = new Scanner(System.in);
        
        int a = scan.nextInt();
        int b = scan.nextInt();
        int c = scan.nextInt();
        
        int num = a*b*c;
        
        LinkedList<Integer> stack = new LinkedList<Integer>();
        while(num > 0){
            stack.push(num % 10);
            num = num / 10;
        }
        
        int sum[] = {0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
        while ((!stack.isEmpty())){
        	num = stack.pop();
        	switch(num) {
        		case 0:
        			sum[0]++;
        			break;
        		case 1:
        			sum[1]++;
        			break;
        		case 2:
        			sum[2]++;
        			break;
        		case 3:
        			sum[3]++;
        			break;
        		case 4:
        			sum[4]++;
        			break;
        		case 5:
        			sum[5]++;
        			break;
        		case 6:
        			sum[6]++;
        			break;
        		case 7:
        			sum[7]++;
        			break;
        		case 8:
        			sum[8]++;
        			break;
        		case 9:
        			sum[9]++;
        			break;
        	}
        }
        
        for(int i=0; i<sum.length; i++)
        	System.out.println(sum[i]);
        scan.close();
    }
}
