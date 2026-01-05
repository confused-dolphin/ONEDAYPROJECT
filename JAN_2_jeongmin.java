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
