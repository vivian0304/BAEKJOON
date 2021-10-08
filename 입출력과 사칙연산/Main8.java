import java.util.Scanner;

public class Main8{
    public static void main(String args[]){
        Scanner scan = new Scanner(System.in);
        
        int a = scan.nextInt();
        int b = scan.nextInt();
        
        System.out.println((double)a/(double)b);
        
        scan.close();
    }
}
