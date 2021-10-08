import java.util.Arrays;
import java.util.Scanner;

public class Main1{
    public static void main(String args[]){
        Scanner scan = new Scanner(System.in);
        
        int num = scan.nextInt();
        int ary[] = new int[num];
        
        for(int i=0; i<num; i++)
            ary[i] = scan.nextInt();
        
        Arrays.sort(ary);
        System.out.print(ary[0]+" ");
        System.out.print(ary[ary.length-1]);
        
    }
}
