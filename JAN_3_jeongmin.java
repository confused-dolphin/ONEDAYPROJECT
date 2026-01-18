# 11004
public class Main {
	public static void main(String[] args) throws IOException {
		 BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	     BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
	     ArrayList<Integer> lst = new ArrayList<Integer>();
	     
	     String[] tokens = br.readLine().split(" ");
	     int n = Integer.parseInt(tokens[0]);
	     int k = Integer.parseInt(tokens[1]);
	     
	     
	     String[] tokens2 = br.readLine().split(" ");
	     for(int i=0;i<n;i++) {
	    	  lst.add(Integer.parseInt(tokens2[i]));
	     }
	     
	     Collections.sort(lst);
	     
	     
	     
	     bw.write(lst.get(k-1)+"\n");
	     
	     
	     bw.flush();
	     bw.close();
    }
}

#13241
public class Main {
	public static void main(String[] args) throws IOException {
		 BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	     BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
	     HashSet <Integer> gong = new HashSet<Integer>();
	     
	     String[] tokens = br.readLine().split(" ");
	     
	     BigInteger n1 = new BigInteger(tokens[0]);
	     BigInteger n2 = new BigInteger(tokens[1]);
	     
	     BigInteger gcd = n1.gcd(n2);
	     BigInteger lcm = (n1.multiply(n2)).divide(gcd);
	     
	     bw.write(lcm+"\n");
	     bw.flush();
	     bw.close();
    }
}

#2167

public class Main {
	public static void main(String[] args) throws IOException {
		 BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	     BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
	     HashSet <Integer> gong = new HashSet<Integer>();
	     
	     String[] tokens = br.readLine().split(" ");
	     int n = Integer.parseInt(tokens[0]);
	     int m = Integer.parseInt(tokens[1]);
	     
	     int[][] num = new int[n][m];
	     
	     for(int i=0;i<n;i++) {
	    	 String[] tokens2 = br.readLine().split(" ");
	    	 for(int j=0;j<m;j++) {
	    		 num[i][j] = Integer.parseInt(tokens2[j]);
	    	 }
	     }
	     
	     int k = Integer.parseInt(br.readLine());
	     int sum = 0;
	     
	     for(int i=0;i< k;i++) {
	    	 String[] tokens3 = br.readLine().split(" ");
		     int a = Integer.parseInt(tokens3[0]);
		     int b = Integer.parseInt(tokens3[1]);
		     int c = Integer.parseInt(tokens3[2]);
		     int d = Integer.parseInt(tokens3[3]);
		     
		     for(int l=a-1;l<c;l++) {
		    	 for(int j=b-1;j<d;j++) {
		    		 sum = num[l][j] + sum;
		    	 }
		     }
		     bw.write(sum+"\n");
		     sum = 0;
	     }
	     
	     
	     bw.flush();
	     bw.close();
    }
}

#11728

public class Main {
	public static void main(String[] args) throws IOException {
		 BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	     BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
	     ArrayList<Integer> number = new ArrayList<>();
   
	     String[] tokens = br.readLine().split(" ");
	     int n = Integer.parseInt(tokens[0]);
	     int m = Integer.parseInt(tokens[1]);
	     
	     String[] tokens_1 = br.readLine().split(" ");
	     for(int i=0;i<n;i++) {
	    	 number.add(Integer.parseInt(tokens_1[i]));
	     }
	     
	     String[] tokens_2 = br.readLine().split(" ");
	     for(int i=0;i<m;i++) {
	    	 number.add(Integer.parseInt(tokens_2[i]));
	     }
	     
	     
	     Collections.sort(number);
	     for (int nn : number) {
	            bw.write(nn + " ");
	        }
	     bw.flush();
	     bw.close();
    }
}

#24313

public class Main {
	public static void main(String[] args) throws IOException {
		 BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	     BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
	     ArrayList<Integer> number = new ArrayList<>();
	     String[] tokens = br.readLine().split(" ");
	     int n = Integer.parseInt(tokens[0]);
	     int m = Integer.parseInt(tokens[1]);
	     
	     int c = Integer.parseInt(br.readLine());
	     int n0 = Integer.parseInt(br.readLine());
	     
	     if(c>=n) {
	    	 if((c-n)*n0 >= m) {
	    		 bw.write("1");
	    	 }
	    	 else
	    		 bw.write("0");
	     }else
	    	 bw.write("0");
	     
	     
	     bw.flush();
	     bw.close();
    }
}

#2740

public class Main {
	public static void main(String[] args) throws IOException {
		 BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	     BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
	     
	     String[] tokens = br.readLine().split(" ");
	     int n = Integer.parseInt(tokens[0]);
	     int m = Integer.parseInt(tokens[1]);
	     int[][] num = new int[n][m];
	     
	     for(int i=0;i<n;i++) {
	    	 String[] number = br.readLine().split(" ");
	    	 for(int j=0;j<m;j++) {
	    		 num[i][j] = Integer.parseInt(number[j]);
	    	 }
	     }
	     
	     String[] tokens2 = br.readLine().split(" ");
	     int n2 = Integer.parseInt(tokens2[0]);
	     int m2 = Integer.parseInt(tokens2[1]);
	     int[][] num2 = new int[n2][m2];
	     
	     for(int i=0;i<n2;i++) {
	    	 String[] number = br.readLine().split(" ");
	    	 for(int j=0;j<m2;j++) {
	    		 num2[i][j] = Integer.parseInt(number[j]);
	    	 }
	     }
	     
	     int[][] new_num = new int[n][m2];
	     
	     for(int i=0;i<n;i++) {
	    	 for(int j=0;j<m2;j++) {
	    		 for(int k=0;k<m;k++) {
	    			 new_num[i][j] += num[i][k] * num2[k][j];

	    		 }
	    	 }
	     }
	     
	     for(int i=0;i<n;i++) {
	    	 for(int j=0;j<m2;j++) {
	    		 bw.write(new_num[i][j]+" ");
	    	 }
	    	 bw.write("\n");
	     }
	     
	     bw.flush();
	     bw.close();
    }
}

#14916

public class Main {
	public static void main(String[] args) throws IOException {
		 BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	     BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

	     int n = Integer.parseInt(br.readLine());
	     int count = 0;

	     while(true) {
	    	 
	    	 if(n<0) {
	    		 bw.write("-1");
	    		 break;
	    	 }
	    	 if(n == 0) {
	    		 bw.write(count+"\n");
	    		 break;
	    		 
	    	 }
	    	 if(n % 5 == 0) {
	    	        n = n - 5;
	    	        count++;
	    	    } else {
	    	        n = n - 2;
	    	        count++;
	    	    }
	     }
	     
	     bw.flush();
	     bw.close();
    }
}

#2161

public class Main {
	public static void main(String[] args) throws IOException {
		 BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	     BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
	     Queue<Integer> q = new LinkedList<Integer>();
	     
	     int n = Integer.parseInt(br.readLine());
	     
	     for(int i=1;i<=n;i++) {
	    	 q.add(i);
	     }
	     
	     for(int i=0;q.size() > 1;i++) {
	    	 int trash = q.element();
	    	 q.remove();
	    	 
	    	 bw.write(trash+" ");
	    	 int value = q.element();
	    	 q.add(value);
	    	 q.remove();
	    	 
	     }
	     
	     bw.write(q.element()+"");
	     bw.flush();
	     bw.close();
    }
}

#1543----> 도저히 반례를 못 찾겠어요 !!! 지피티한테도 여러번 물어봤는 데 자꾸 반례가 아닌 것들 만 찾아줘요...ㅜㅜ

public class task_12 {
	public static void main(String[] args) throws IOException {
		 BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	     BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
	     
	     String s = br.readLine();
	     String find = br.readLine();
	     
	     int count = 0;
	     int len = find.length();
	     
	     while(true) {
	    	 
	    	 int id = s.indexOf(find);
	    	 if(id == -1)
	    		 break;
	    	 
	    	 String front = s.substring(0,id);
	    	 String back = s.substring(id+len);
	    	 
	    	 s = front + back;
	    	 count++;
	    	 
	     }
	     bw.write(count+"");
	     bw.flush();
	     bw.close();
    }
}
