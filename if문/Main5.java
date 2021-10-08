import java.util.Scanner;

public class Main5{
    public static void main(String args[]){
        Scanner scan = new Scanner(System.in);
        
        int a = scan.nextInt();
        int b = scan.nextInt();
        
        int c = b-45;
        if(c>=0)
            System.out.print(a+" "+c);
        else if(c<0){
            c = 60+c;
            if(a-1 >= 0)
                System.out.print((a-1)+" "+c);
            else if(a-1 < 0){
                a = 23;
                System.out.print(a+" "+c);
            }
        }
        
        scan.close();
    }
}
