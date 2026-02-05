#1312

---> 이 문제는 평소에 생각하는 방식과는 달리 풀어야 오차없이 풀 수 있음. 근데 해당 방법이 이해가 안 감

#1769

import java.io.*;
import java.util.*;
import java.math.*;


public class task_12 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

	   String num = br.readLine();
	   int sum = 0, count = 0;
	   
	   while(num.length()>1) {
		   
		   sum = 0;
				   
		   for(int i=0;i<num.length();i++) {
			  sum += num.charAt(i)-'0';
		   }
		   num = Integer.toString(sum);
		   count++;
	   }
	   
	   int result = Integer.parseInt(num);
	   if(result%3 == 0) bw.write(count+"\n"+"YES");
	   else  bw.write(count+"\n"+"NO");
	    
	    bw.flush();
	    bw.close();
	     
    }
}
