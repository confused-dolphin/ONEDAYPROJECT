#1316
	
import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		
		int non_n =0;
		int num = sc.nextInt();
		String enter = sc.nextLine();
		
		
		for(int i=0;i<num;i++) {
			String word = sc.nextLine();
			int len = word.length();
			char c[] = new char[len+1];
			for(int k=0;k<len;k++) {
				
				c[k] = word.charAt(k);
				
				
			}
			outer : for(int a=0;a<=len;a++) {
				if(len<=2)
					break outer;
				for(int j=1;a+j<len;j++) {
					if(c[a]==c[a+j] && c[a] != c[a+1]) {
						non_n++;
						break outer;
					}
				}
			}
			
		}
		
		System.out.println(num-non_n);
	
		
	}
}

#2751

import java.io.*;
import java.util.*;

public class Main{
	public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int num = Integer.parseInt(br.readLine());
        int[] s = new int[num];

        for (int i = 0; i < num; i++) {
            s[i] = Integer.parseInt(br.readLine());
        }

        Arrays.sort(s);

        for (int i = 0; i < num; i++) {
            bw.write(s[i]+"\n");
        }

        bw.flush(); 
        bw.close();


#1181 >> 코드가 비효율적임. 좀 더 효율적인 코드 학습 필요

import java.io.*;
import java.util.*;

public class Main{
	public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int num = Integer.parseInt(br.readLine());
        String[] s = new String[num];
        int[] len = new int[num];
        int temp;
        String temp_s;
      
        
        for (int i = 0; i < num; i++) {
            s[i] =br.readLine();
            len[i] = s[i].length();
        }
        
        for(int i =0;i<num;i++) {
        	for(int j =0;j<num-1;j++) {
        		if(len[j]>=len[j+1]) {
        			temp = len[j];
        			len[j]=len[j+1];
        			len[j+1] = temp;
        			
        			temp_s = s[j];
        			s[j]=s[j+1];
        			s[j+1] = temp_s;
        		}
        	}
        }
        
        for(int i=0;i<num-1;i++) {
        	 if (s[i].equals("0")) 
        		 continue;
        	for(int j=i+1;j<num;j++) {
        		if(s[i].equals(s[j])) {
            		s[j] = "0";
            	}
        	}
        }

        int start =0;
        for (int i = 1; i <= num; i++) {
            if (i == num || len[i] != len[start]) {
                Arrays.sort(s, start, i);
                start = i;
            }
        }
        for (int i = 0; i < num; i++){
            if(s[i].equals("0"))
            	continue;
        	bw.write(s[i]+"\n");
        }

        bw.flush(); 
        bw.close();  
    }
}
