import java.util.*;

public class Main2{
    public static void main(String args[]){
        Scanner scan = new Scanner(System.in);
        List<Integer> sumArray = new ArrayList<Integer>();
        int a, b, i=0;
        
        while(scan.hasNextInt()){
            a = scan.nextInt();
            b = scan.nextInt();
            
            sumArray.add(a+b);
            
            i++;
        }
        
        for(i=0; i<sumArray.size(); i++)
            System.out.println(sumArray.get(i));
        
        scan.close();
    }
}
