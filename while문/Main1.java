// 문제 번호 10952

import java.util.*;

public class Main1{
    public static void main(String args[]){
        Scanner scan = new Scanner(System.in);
        List<Integer> sumArray = new ArrayList<Integer>();
        int a, b;
        
        do{
            a = scan.nextInt();
            b = scan.nextInt();
            
            sumArray.add(a+b);
        } while(a != 0 && b != 0);
        
        for(int i=0; i<sumArray.size()-1; i++)
            System.out.println(sumArray.get(i));
        
        scan.close();
    }
}
