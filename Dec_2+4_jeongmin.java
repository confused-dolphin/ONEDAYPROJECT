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

#10814

import java.io.*;
import java.util.*;

class Join{
	int age;
	String name;
	
	Join(int age, String name){
		this.age = age;
		this.name = name;
	}
}
public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
       
        int num = Integer.parseInt(br.readLine());
       
        Join[] person = new Join[num];
        for(int i=0;i<num;i++) {
        	StringTokenizer st = new StringTokenizer(br.readLine());
        	int age = Integer.parseInt(st.nextToken());
        	String name = st.nextToken();
        	
        	person[i] = new Join(age, name);
        }
        
        //Arrays.sort(person); -> error!!
        
        Arrays.sort(person, (a,b)-> Integer.compare(a.age, b.age));
        
        for(int i=0;i<num;i++) {
        		bw.write(person[i].age+" "+person[i].name+"\n");
        }
        
        bw.flush(); 
        bw.close();  
    }
}

#1427

import java.io.*;
import java.util.*;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
       
        String num = br.readLine();
        //ArrayList<int> list = new ArrayList<int>(); error!! int =>xxxx
        ArrayList<Integer> list = new ArrayList<Integer>();
        
        for(int i =0;i<num.length();i++) {
        	int n = Integer.parseInt(num.substring(i,i+1));
        	list.add(n);
        }
        list.sort(Comparator.reverseOrder());
        
        for (int number : list) {
        	bw.write(number+"");
        }
        
        
        bw.flush(); 
        bw.close();  
    }
}

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
