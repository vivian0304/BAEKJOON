import java.util.Scanner;

public class Main3{
    public static void main(String args[]){
        Scanner scan = new Scanner(System.in);
        int a = scan.nextInt();
        int num = a, fi, se, i=0;
        
        do {
        	if (num>=10) {
        		fi = (num/10)%10;
            	se = num%10;
        	} else {
        		fi = 0;
        		se = num;
        	}
        	int sum = fi+se;
        	
        	num = (se*10) + (sum%10);
        	
        	i++;
        }while(a != num);
        
        System.out.println(i);
        scan.close();
    }
}
