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
