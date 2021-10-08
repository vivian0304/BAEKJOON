import java.io.*;
import java.util.StringTokenizer;

public class Main4{
    public static void main(String args[]){
    	
    	try {
    		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    		
    		
            int num = Integer.parseInt(br.readLine());
            int a[] = new int[num];
            int b[] = new int[num];
            int sum[] = new int[num];
            
            for(int i=0; i<num; i++){
            	
            	String str = br.readLine();
            	
            	StringTokenizer st = new StringTokenizer(str);
            	a[i] = Integer.parseInt(st.nextToken());
            	b[i] = Integer.parseInt(st.nextToken());
            	
                sum[i] = a[i] + b[i];
            }
            
            BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
            
            
            for(int i=0; i<num; i++){
            	bw.write(sum[i]+"\n");   //버퍼에 있는 값 전부 출력
            }
            
            bw.flush();   //남아있는 데이터를 모두 출력시킴
            bw.close();   //스트림을 닫음
    	} catch(Exception e) {
    	}
        
    }
}
