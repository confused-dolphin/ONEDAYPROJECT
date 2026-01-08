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
