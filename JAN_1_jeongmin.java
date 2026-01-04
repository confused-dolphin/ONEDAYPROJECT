#1010

import java.io.*;
import java.util.*;
import java.math.BigInteger;

public class Main {
	public static void main(String[] args) throws IOException {
		 BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

	        int num = Integer.parseInt(br.readLine());
	        
	        for(int k=0;k<num;k++) {
	        	
	        	String[] tokens = br.readLine().split(" ");
	        	int n = Integer.parseInt(tokens[0]);
	        	int m = Integer.parseInt(tokens[1]);
	        	
	        	int a = m - n;
	        	
	        	BigInteger sum_m = BigInteger.ONE;
	        	BigInteger sum_n = BigInteger.ONE;
	        	BigInteger sum_a = BigInteger.ONE;
	        	
	        	for (int i = m; i > 0; i--) {
	        		sum_m = sum_m.multiply(BigInteger.valueOf(i));
	        	}
	        	
	        	for (int i = n; i > 0; i--) {
	        		sum_n = sum_n.multiply(BigInteger.valueOf(i));
	        	}
	        	
	        	for (int i = a; i > 0; i--) {
	        		sum_a = sum_a.multiply(BigInteger.valueOf(i));
	        	}
	        	
	        	BigInteger C = sum_m.divide(sum_n.multiply(sum_a));
	        	
	        	bw.write(C.toString() + "\n");
	        }

	        bw.flush();
	        bw.close();
    }
}


#10815

public class Main {
	public static void main(String[] args) throws IOException {
		 BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	     BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
	     HashMap<Integer, Integer> map = new HashMap<>();

	     int n_me = Integer.parseInt(br.readLine());
	     int arr_me[] = new int[n_me];
	        
	     StringTokenizer stme = new StringTokenizer(br.readLine());
	     for (int i = 0; i < n_me; i++) {
	         arr_me[i] = Integer.parseInt(stme.nextToken());
	     }
	       
     	 int n_you = Integer.parseInt(br.readLine());
	     int arr_you[] = new int[n_you];
	     int arr_confirm[] = new int[n_you];
	        
	     StringTokenizer styou = new StringTokenizer(br.readLine());
	     for (int i = 0; i < n_you; i++) {
	         map.put(Integer.parseInt(styou.nextToken()),i);
	      }
	     
	     for(int i = 0; i < n_me; i++) {
	    	 if(map.containsKey(arr_me[i])) {
	    		 arr_confirm[map.get(arr_me[i])] = 1;
	    	 }
	     }
	     
	     for (int i : arr_confirm) {
	            bw.write(String.valueOf(i)+" ");
	        }
	      
	        bw.flush();
	        bw.close();
    }
}
