// 문제 번호 2562

import java.util.Arrays;
import java.util.Scanner;

public class Main2{
    public static void main(String args[]){
        Scanner scan = new Scanner(System.in);
        
        int ary[] = new int[9];
        
        for(int i=0; i<9; i++)
            ary[i] = scan.nextInt();
        
        int origin[] = ary.clone();
        
        Arrays.sort(origin);
        System.out.println(origin[origin.length-1]);
        
        for(int i=0; i<9; i++) 
    		if(origin[origin.length-1] == ary[i])
    			System.out.print(i+1);
            
        scan.close();
    }
}
