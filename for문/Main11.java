import java.util.Scanner;

public class Main11{
    public static void main(String args[]){
    	
        Scanner scan = new Scanner(System.in);
        
        int num = scan.nextInt();
        int max = scan.nextInt();
        
        int a[] = new int[num];
        
        for(int i=0; i<num; i++){
            a[i] = scan.nextInt();
        }
        
        for(int i=0; i<num; i++){
            if(a[i]<max)
                System.out.print(a[i]+" ");
        }
            
    }
}
