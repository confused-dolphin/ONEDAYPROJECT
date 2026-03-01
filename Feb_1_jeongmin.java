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

#11576

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
	    ArrayList<Integer> list = new ArrayList<>();
	    
	    int result = 0;
	   String num_1 = br.readLine();
	   String tokens[] = num_1.split(" ");
	   
	   int a = Integer.parseInt(tokens[0]);
	   int b = Integer.parseInt(tokens[1]);
	   
	   int n = Integer.parseInt(br.readLine());
	   
	   String num_3 = br.readLine();
	   String number[] = num_3.split(" ");
	   
	   for(int i=0;i<n;i++) {
		   int sum = Integer.parseInt(number[i]);
		   result = (int)Math.pow(a ,n-i-1)*sum + result;
	   }
	   

	   while(result > 0) {
		   int re = result % b;
		   list.add(re);
		   result = result / b;
	   }
	   
	   for (int i = list.size() - 1; i >= 0; i--) {
		    bw.write(list.get(i) + " ");
		}
	   
	    bw.flush();
	    bw.close();
	     
    }
}

#15688

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int num = Integer.parseInt(br.readLine());
        int[] arr = new int[num];

        for (int i = 0; i < num; i++) {
            arr[i] = Integer.parseInt(br.readLine());
        }

        Arrays.sort(arr);

        for (int i = 0; i < num; i++) {
            sb.append(arr[i]).append("\n");
        }

        System.out.print(sb);
    }
}


#16395

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
	   
	    String tokens[] = br.readLine().split(" ");
	    int n = Integer.parseInt(tokens[0]);
	    int k = Integer.parseInt(tokens[1]);
	    int result = 1;
	    
	    int paskal[][] = new int[n+1][n+1];
	    
	    
	    	for(int i=0;i<=n;i++) {
	    		paskal[i][0] = 1;
	    		paskal[i][i] = 1;
	    		for(int j = 1;j<i;j++) {
	    			paskal[i][j] = paskal[i-1][j-1]+paskal[i-1][j];
	    		}
	    	}
	    
	    
	    bw.write(paskal[n-1][k-1]+" ");
	    bw.flush();
	    bw.close();
	     
    }
}

#10709

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
	    
	    String tokens[] = br.readLine().split(" ");
	    int n = Integer.parseInt(tokens[0]);
	    int k = Integer.parseInt(tokens[1]);
	    
	    int result[][] = new int[n][k];
	    String c[] = new String[n];
	    
	    for (int i = 0; i < n; i++) {
	        c[i] = br.readLine();
	    }

	    for (int i = 0; i < n; i++) {
	        for (int j = 0; j < k; j++) {
	            result[i][j] = -1;
	        }
	    }
	   
	    for(int i=0;i<n;i++) {
	    	for(int j=0;j<k-1;j++) {
	    		if(c[i].charAt(j) == 'c') {
	    			result[i][j] = 0;
	    			result[i][j+1] = 1;
	    			for(int r = j+2;r<k;r++) {
	    				result[i][r] = r-j;
	    			}
	    		}
	    	}
	    	if(c[i].charAt(k-1) == 'c')
	    		result[i][k-1] = 0;
	    }
	    
	    
	    for(int i=0;i<n;i++) {
	    	for(int j=0;j<k;j++) {
	    		bw.write(result[i][j]+" ");
	    	}
	    	bw.write("\n");
	    }
	    
	    bw.flush();
	    bw.close();
	     
    }
}


#10431 ---> 테스트 케이스는 되는데 어디서 에러가 나는지 50%에서 자꾸 멈추길래 우선 코드만 첨부합니다 

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
	    //ArrayList<Integer> list = new ArrayList<>();
	    
	    int front, count = 1, max, walk = 0, not = 0;
	    int testcase = Integer.parseInt(br.readLine());
	    int num = 0;
	    
	    while(testcase>0) {
	    	String tokens[] = br.readLine().split(" ");
	    	max = Integer.parseInt(tokens[1]);
	    	for(int i=2;i<21;i++) {
	    		front = Integer.parseInt(tokens[i]);
	    		for(int j = i-1;j>=0;j--) {
	    			if(front<Integer.parseInt(tokens[j])) {
	    				walk = walk + count;
	    				count++;
	    				not = 1;
	    				break;
	    			}	
	    		}
	    		if(not == 0) {
	    			count++;
	    			max = front;	
	    		}
	    	}
	    	bw.write(num+1+" "+walk+"\n");
	    	num++;
	    	testcase--;
	    	count = 1;
	    	walk = 0;
	    	not = 0;
	    }
	    
	    
	    bw.flush();
	    bw.close();
	     
    }
}


#1268 --> 코드가 자꾸 너무 길어져서 제일 효율적인 것 같은 코드를 가져와서 첨부합니당 (제가 짠 거 XXXX)

public class Main {
    public static void main(String[] args) throws IOException {

        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int[][] student_classes = new int[num][5];
        for(int i = 0; i < num; i++){
            for(int j = 0; j <5 ; j++){
                student_classes[i][j] = sc.nextInt();
            }
        }

        int max = 0;
        int leader = 0;
        for(int i = 0; i<num; i++){
            Set<Integer> set = new HashSet<>();
            for(int j = 0; j<5; j++){
                for(int k = 0; k<num; k++){
                    if(student_classes[i][j] == student_classes[k][j]
                            && i!=k){
                        set.add(k);
                    }
                }
            }
            if(set.size()>max) {
                leader = i;
                max = set.size();
            }
        }
        System.out.println(leader + 1);
    }
}


#9237

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
	    //ArrayList<Integer> list = new ArrayList<>();
	    int num = Integer.parseInt(br.readLine());
	    Integer tree[] = new Integer[num];

	    String tokens[] = br.readLine().split(" ");
	    for(int i=0;i<num;i++) {
	    	tree[i] = Integer.parseInt(tokens[i]);
	    }
	    
	    Arrays.sort(tree, Comparator.reverseOrder());
	    
	    int max = 0 ;
		for(int i = 0 ; i<tree.length;i++) {
			max = Math.max(max, tree[i] + i + 1);
		}
		
	    bw.write(max+1+" ");
	    bw.flush();
	    bw.close();
	     
    }
}


#1402 --> 이거 시간초과 나길래, 찾아보니까 그냥 무조건 yes 였습니다
