// 문제 번호 2588

import java.util.Scanner;

public class Main11{
    public static void main(String args[]){
        Scanner scan = new Scanner(System.in);
        
        int a = scan.nextInt();
        int b = scan.nextInt();
        
        System.out.println(a*(b%10));
        
        System.out.println(a*((b/10)%10));
        
        System.out.println(a*((b/100)%10));
        
        System.out.println(a*b);
        
        scan.close();
    }
}
