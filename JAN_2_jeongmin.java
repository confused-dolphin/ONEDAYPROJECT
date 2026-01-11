#11723

public class Main {
	public static void main(String[] args) throws IOException {
		   BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	     BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    
	     HashSet<Integer> set = new HashSet<Integer>();
	     
	     int work = Integer.parseInt(br.readLine());
	     
	     while(work > 0) {
	    	 
	    	 String[] tokens = br.readLine().split(" ");
	         String command = tokens[0];
	         int num = 0;
	         if(tokens.length == 2)
	        	 num = Integer.parseInt(tokens[1]);
	         
	    	 switch(command){
	    	 	case "add":
	    	 		set.add(num);
	    	 		break;
	    	 	case "remove":
	    	 		set.remove(num);
	    	 		break;
	    	 	case "check":
	    	 		if(set.contains(num))
		    			 bw.write("1"+"\n");
		    		else
		    			bw.write("0"+"\n");
		    		
		    		break;
	    	 	case "toggle":
	    	 		if(set.contains(num))
		    			 set.remove(num);
		    		else
		    			set.add(num);
	    	 		break;
	    	 	case "all":
	    	 		set.clear();
		    		set.addAll(Arrays.asList(
		    		            1, 2, 3, 4, 5,
		    		            6, 7, 8, 9, 10,
		    		            11, 12, 13, 14, 15,
		    		            16, 17, 18, 19, 20
		    		       ));
		    		break;
	    	 	case "empty":
	    	 		set.clear();
	    	 		break;
         } 
	    	 work--;
	     }
	     bw.flush();
	     bw.close();
    }
}

#1475

public class Main {
	public static void main(String[] args) throws IOException {
		 BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	     BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
	     
	     List<Integer> lst = new ArrayList<>();
	     
	     int room = Integer.parseInt(br.readLine());
	     int[] c = new int[9];

	     while(room>0) {
	    	 int con = room%10;
	    	 room = room/10;
	    	 if(con == 6 || con == 9) {
	    		 con = 6;
	    		 c[con]= c[con] + 1;
	    	 }
	    	 else
	    		 c[con]= c[con] + 1;
	     }
	     
	     int max = c[0];
	     
	     if(c[6]%2 ==0)
	    	 c[6] = c[6]/2;
	     else
	    	 c[6] = (c[6]+1)/2;
	     
	     for(int i=0;i<9;i++) {
	    	 if(max < c[i])
	    		 max = c[i];
	     }
	     
	     bw.write(max+"\n");
	     bw.flush();
	     bw.close();
    }
}

#7785

public class Main {
	public static void main(String[] args) throws IOException {
		 BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	     BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
	     
	     Set<String> employee = new HashSet<>();
	     
	     int num = Integer.parseInt(br.readLine());
	     
     	 for(int i=0;i<num;i++) {
     		 
     		 String[] tokens = br.readLine().split(" ");
     		 String name = tokens[0];
     		 String el = tokens[1];
     		 
     		 if(el.equals("enter")) 
     		 {
     			 employee.add(name);
     		 }
     		 else
     		 {
     			 employee.remove(name);
     		 }
     	 }
     	 
     	List<String> re_employee = new ArrayList<>(employee);
        Collections.sort(re_employee, Collections.reverseOrder());
     	
     	for (String item : re_employee) {
            bw.write(item);
            bw.write("\n");
        }
     	
	     bw.flush();
	     bw.close();
    }
}

#1094

public class Main {
	public static void main(String[] args) throws IOException {
		 BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	     BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
	  
	     int num = Integer.parseInt(br.readLine());
	     int[] n = {64, 32,16,8,4,2,1};
	     int max = n[0], count = 0, sum = 0, count_result = 0;
	     
     	 for(int i=0;i<7;i++) {
     		 if(num>=n[i]) {
     			 max = n[i];
     			 count = i;
     			 break;
     		 }
     	 }
     	 
     	 sum = sum + max;
     	 for(int i=count+1;i<7;i++) {
     		 if(sum + n[i] < num) {
     			sum = sum + n[i];
     			count_result += 1;
     		 }
     		 else if(sum + n[i] > num) {
     			 continue;
     		 }
     		else if(sum + n[i] == num) {
     			 count_result += 1;
    			 break;
    		 }
     	 }
     	  
     	 bw.write(count_result+1+"\n");
	     bw.flush();
	     bw.close();
    }
}


#1476

public class Main {
	public static void main(String[] args) throws IOException {
		 BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	     BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
	  
	     String[] tokens = br.readLine().split(" ");
 		 
 		 
	     int num_E = Integer.parseInt(tokens[0]);
	     int num_S = Integer.parseInt(tokens[1]);
	     int num_M = Integer.parseInt(tokens[2]);
	     int i=1;
	     
	     while(true) {
	    	if(((i - num_E)%15 == 0) && ((i - num_S)%28 == 0) && ((i - num_M)%19 == 0)) {
	    		 bw.write(i+"\n");
	    		 break;
	    	}
	    	i++;  	
	     }
	     bw.flush();
	     bw.close();
    }
}

#9655

public class Main {
	public static void main(String[] args) throws IOException {
		 BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	     BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
	  
	    
	     int num = Integer.parseInt(br.readLine());
	     int name = 0;
	     
	     while(true) {
	    	 
	    	 if(num - 3 > 0) {
	    		 num = num - 3;
	    		 name++;
	    	 }else if(num - 3 == 0 || num-1==0) {
	    		 name++;
	    		 break;
	    	 }else if(num-3 < 0 && num-1 > 0) {
	    		 num = num-1;
	    		 name++;
	    	 }
	     }
	     
	     if(name % 2 == 1) {
	    	 bw.write("SK");
	     }else {
	    	 bw.write("CY");
	     }
	     bw.flush();
	     bw.close();
    }
}


#17478

public class Main {
	public static void main(String[] args) throws IOException {
		 BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	     BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
	  
	     System.out.println("어느 한 컴퓨터공학과 학생이 유명한 교수님을 찾아가 물었다.");
	     int num = Integer.parseInt(br.readLine());
	     String s = "";
	     int i = 4;
	     re(num,s,i);
    }
	public static void re(int num, String s, int i) throws IOException {
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		System.out.println(s+"\"재귀함수가 뭔가요?\"");
		System.out.println(s+"\"잘 들어보게. 옛날옛날 한 산 꼭대기에 이세상 모든 지식을 통달한 선인이 있었어.\n"+s+"마을 사람들은 모두 그 선인에게 수많은 질문을 했고, 모두 지혜롭게 대답해 주었지.\n"+s+"그의 답은 대부분 옳았다고 하네. 그런데 어느 날, 그 선인에게 한 선비가 찾아와서 물었어.\"");
		s = "____" + s; 
		num--;
		if(num!=0) {
			re(num, s, i);
		}
		if(num==0) {
			System.out.println(s+"\"재귀함수가 뭔가요?\"");
			System.out.println(s+"\"재귀함수는 자기 자신을 호출하는 함수라네\"");
			System.out.println(s+"라고 답변하였지.");
		}
		s= s.substring(i,s.length());
		i +=4;
		System.out.println(s+"라고 답변하였지.");
	}
}

#1439

public class Main {
	public static void main(String[] args) throws IOException {
		 BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	     BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
	  
	     String num = br.readLine();
	     char before, now; 
	     int count_0 = 0, count_1 = 0;
	     
	     
	     for(int k=0;k<num.length()-1;k++) {
	    	 before = num.charAt(k);
		     now = num.charAt(k+1);
	    	 if(before=='0') {
	    		 if(now != before) {
	    			 count_0++;
	    		 }
	    	 }else if(before == '1') {
	    		 if(now != before) {
	    			 count_1++;
	    		 }
	    	 }
	    }
	    
	    char n = num.charAt(num.length()-1);

		if(n == '1')
			count_1++;
		else if(n == '0')
			count_0++;
		 
	     if(count_0>=count_1) {
	    	 bw.write(count_1+"\n");
	     }else {
	    	 bw.write(count_0+"\n");
	     }
	     bw.flush();
	     bw.close();
    }
}	
