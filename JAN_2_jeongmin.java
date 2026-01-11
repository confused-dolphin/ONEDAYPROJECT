#11723 - 집합

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
		    			bw.write("기

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
