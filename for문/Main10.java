// 문제 번호 2439

import java.util.Scanner;

public class Main10{
    public static void main(String args[]){
    	
        Scanner scan = new Scanner(System.in);
        
        int num = scan.nextInt();
        
        for(int i=0; i<num; i++){
            for(int j=0; j<num-i-1; j++)
                System.out.print(" ");
            for(int j=0; j<=i; j++)
                System.out.print("*");
            System.out.println();
        }
            
    }
}
