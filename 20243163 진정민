#9625

public class Main {
	public static void main(String[] args) throws IOException {
		 BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	     BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
	     
	     Scanner sc = new Scanner(System.in); 
	     
	     int a = 1, b = 0, copy;
	     
	     int k = Integer.parseInt(sc.nextLine());
	     for(int i =0;i<k;i++) {
	    	 copy = b;
	    	 b = a+b;
	    	 a = copy;
	     }
	     
	     bw.write(a+" "+b);
	     bw.flush();
	     bw.close();
	     
    }
}

#4659

public class Main {
	public static void main(String[] args) throws IOException {
		 BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	     BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
	     
	     Scanner sc = new Scanner(System.in); 
	 
	     
	     outer: while(true) {
	    	 String pw = br.readLine();
	    	 
	    	 if (pw.equals("end")) break;
	    	 int moum_count = 0, count_0 = 0, count_1 = 0;
	    	 
	    	 char[] key = pw.toCharArray();


	    	 char com = ' ';
	         for (char c : key) {
	        	 
	        	 if (c == com && !(c == 'e' || c == 'o')) {
	        		 bw.write("<"+pw+">" + " is not acceptable.\n");
	        		 //bw.newLine();
	        		 continue outer;
	        	 }
	        	 com = c; 
	        	 
	             if(c == 'a' || c == 'e'||c == 'i'||c == 'o'||c == 'u') {
	            	 moum_count++;
	            	 count_0 = 0;
	            	 count_1++;
	            	 
	            	 if(count_1 >= 3) {
	            		 bw.write("<"+pw+">" + " is not acceptable.\n");
	                     //bw.newLine();
	                     continue outer;
	            	 }
	             }else {
	            	 count_1= 0;
	            	 count_0++;

	            	 if (count_0 >= 3) {
	            		 bw.write("<"+pw+">" + " is not acceptable.\n");
	                     //bw.newLine();
	                     continue outer;
	                 }
	             }
	         }
	         if(moum_count==0) {
	        	 bw.write("<"+pw+">" + " is not acceptable.\n");
	        	 
	         }else {
	        	 bw.write("<"+pw+">" + " is acceptable.\n");
	        	 
	         }
	     }
	     bw.flush();
	     bw.close();
	     
    }
}

#1652

public class Main {
	public static void main(String[] args) throws IOException {
		 BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	     BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
	     
	     Scanner sc = new Scanner(System.in); 
	 
	     int num = Integer.parseInt(br.readLine());
	     int count_r = 0, count_l = 0;
	     
	     char room[][] = new char[num][num];
	     
	     for (int i = 0; i < num; i++) {
	    	    String line = br.readLine();
	    	    for (int j = 0; j < num; j++) {
	    	        room[i][j] = line.charAt(j);
	    	    }
	    	}
	     
	     for (int i = 0; i < num; i++) {
	    	    int space = 0;
	    	    for (int j = 0; j < num; j++) {
	    	        if (room[i][j] == '.') {
	    	            space++;
	    	        } else {
	    	            if (space >= 2) count_r++;
	    	            space = 0;
	    	        }
	    	    }
	    	    if (space >= 2) count_r++;
	    	}

	     for (int i = 0; i < num; i++) {
	    	    int space = 0;
	    	    for (int j = 0; j < num; j++) {
	    	        if (room[j][i] == '.') {
	    	            space++;
	    	        } else {
	    	            if (space >= 2) count_l++;
	    	            space = 0;
	    	        }
	    	    }
	    	    if (space >= 2) count_l++;
	    	}
	     bw.write(count_r+" "+count_l);
	     
	     bw.flush();
	     bw.close();
	     
    }
}

#1417

public class Main{
	public static void main(String[] args) throws IOException {
		 BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	     BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
	     
	     Scanner sc = new Scanner(System.in); 
	 
	     int num = Integer.parseInt(br.readLine());
	     int n[] = new int[num];
	     
	     if(num == 1) {
	    	 for(int i=0;i<num;i++) {
	    		 n[i]= Integer.parseInt(br.readLine());
	    	 }
	    	 bw.write("0");
	     }else {
	    	 
	    	 for(int i=0;i<num;i++) {
	    		 n[i]= Integer.parseInt(br.readLine());
	    	 }
	    	 int com = n[0];
	    	 int count = 0;
	    	 
	    	 while(true) {
	    		 int max = n[1], max_num = 1;
	    		 
	    		 for(int i=1;i<num;i++) {
	    			 if(max<n[i]) {
	    				 max = n[i];
	    				 max_num = i;
	    			 }
	    		 }
	    		 
	    		 
	    		 if(max < com)break;
	    		 n[max_num]--;
	    		 com++;
	    		 count++;
	    	 }
	    	 bw.write(count+" ");
	     }
	     

	     bw.flush();
	     bw.close();
	     
    }
}

#16435

public class Main {
	public static void main(String[] args) throws IOException {
		 BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	     BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
	     
	     Scanner sc = new Scanner(System.in); 
	     
	 
	    
	     String tokens[] = br.readLine().split(" ");
	     
	     int num = Integer.parseInt(tokens[0]);
	     int fru[] = new int[num];
	     int len = Integer.parseInt(tokens[1]);
	     
	     String tokens_2[] = br.readLine().split(" ");
	     
	     for(int i=0;i<num;i++) {
	    	 fru[i] = Integer.parseInt(tokens_2[i]);
	     }
	     
	     Arrays.sort(fru);
	     
	     for(int i=0;i<num;i++) {
	    	 if(fru[i]<=len) {
	    		 len++;
	    	 }
	     }
	     
	     bw.write(len+"");

	     bw.flush();
	     bw.close();
	     
    }
}


#1251

public class Main {
	public static void main(String[] args) throws IOException {
		 BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	     BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
	    
	     String alpha = br.readLine();
	     String answer = null;

	     int len = alpha.length();

	     for (int i = 1; i < len - 1; i++) {
	         for (int j = i + 1; j < len; j++) {

	             String part1 = new StringBuilder(alpha.substring(0, i)).reverse().toString();
	             String part2 = new StringBuilder(alpha.substring(i, j)).reverse().toString();
	             String part3 = new StringBuilder(alpha.substring(j)).reverse().toString();

	             String result = part1 + part2 + part3;

	             if (answer == null || result.compareTo(answer) < 0) {
	                 answer = result;
	             }
	         }
	     }

	     bw.write(answer);

	     bw.flush();
	     bw.close();
	     
    }
}

#13301

public class Main{
	public static void main(String[] args) throws IOException {
		 BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	     BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
	  
	     long n = Integer.parseInt(br.readLine());
	     long a = 1, b = 0, temp;
	     
	     for(int i =0;i< n-1 ;i++) {
	    	 temp = a;
	    	 a = a+ b;
	    	 b = temp;
	     }
	     
	     long row = a+b;
	     long col = a;
	     
	     long cir = 2*row + 2*col;
	     
	     
	     bw.write(cir+"");
	     
	     bw.flush();
	     bw.close();
	     
    }
}

#5800

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
	    
	     
	    List<PriorityQueue<Integer>> queueList = new ArrayList<>();
	    ArrayList<Integer> sub = new ArrayList<>();
	    
	    
	    int num = Integer.parseInt(br.readLine());
	    
	    for(int i=0;i<num;i++) {
	    	queueList.add(new PriorityQueue<>());
	    }
	    
	    for( int i=0;i<num;i++) {
	    	String tokens[] = br.readLine().split(" ");
	    	
	    	for(int k =0;k<Integer.parseInt(tokens[0]);k++) {
	    		queueList.get(i).add(Integer.parseInt(tokens[k+1]));
	    	}
	    	
	    	int min = queueList.get(i).peek();
	    	int max = Collections.max(queueList.get(i));
	    	
	    	while (queueList.get(i).size() >= 2) {
	    		int a = queueList.get(i).poll();
	    		int b = queueList.get(i).peek(); 
	    		sub.add(Math.abs(b - a));
	    	}

	    	Collections.sort(sub, Collections.reverseOrder());
	    	
	    	bw.write("Class "+(i+1)+"\n");
	    	bw.write("Max "+max+", Min "+min+", Largest gap "+ sub.get(0)+"\n");
	    	
	    	sub.clear();
	    }
	    bw.flush();
	    bw.close();
	     
    }
}
