#11650

import java.io.*;
import java.util.*;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
       
        int num = Integer.parseInt(br.readLine());
        
        int[][] x = new int[num][2];
        
        for(int i=0;i<num;i++) {
        	StringTokenizer st = new StringTokenizer(br.readLine());
            x[i][0] = Integer.parseInt(st.nextToken());
            x[i][1] = Integer.parseInt(st.nextToken());
        }
        
        Arrays.sort(x, (a,b) -> {
        	if(a[0]==b[0]) {
        		return Integer.compare(a[1],b[1]);
        	}
        	return Integer.compare(a[0],b[0]);
        });
        
        for(int i=0;i<num;i++) {
        		bw.write(x[i][0]+" "+x[i][1]+"\n");
        }
        
        bw.flush(); 
        bw.close();  
    }
}
