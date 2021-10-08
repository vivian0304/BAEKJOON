// 문제 번호 14681

import java.util.Scanner;

public class Main4{
    public static void main(String args[]){
        Scanner scan = new Scanner(System.in);
        
        int a = scan.nextInt();
        int b = scan.nextInt();
        
        if(a > 0 && b > 0)
            System.out.print(1);
        else if(a < 0 && b > 0)
            System.out.print(2);
        else if(a < 0 && b < 0)
            System.out.print(3);
        else if(a > 0 && b < 0)
            System.out.print(4);
        
        scan.close();
    }
}
