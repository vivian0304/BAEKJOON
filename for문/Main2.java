// 문제 번호 10950

import java.util.Scanner;

public class Main2{
    public static void main(String args[]){
        Scanner scan = new Scanner(System.in);
        int num = scan.nextInt();
        int a[] = new int[num];
        int b[] = new int[num];
        int sum[] = new int[num];
        
        for(int i=0; i<num; i++){
            a[i] = scan.nextInt();
            b[i] = scan.nextInt();
            sum[i] = a[i]+b[i];
        }
        
        for(int i=0; i<num; i++){
            System.out.println(sum[i]);
        }
        
        scan.close();
    }
}
