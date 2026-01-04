package Jan_1;
import java.util.*;
import java.io.*;
import java.math.*;

//No.1010
public class Bridge {
	public static BigInteger fact(int a) {
		BigInteger x=BigInteger.valueOf(a);
		if (a<=1) return BigInteger.ONE;
		else return x.multiply(fact(a-1));
	}
	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int num=sc.nextInt();
		for(int i=0;i<num;i++) {
			int n=sc.nextInt();
			int r=sc.nextInt();
			BigInteger result=BigInteger.ONE;
		
			if (n==1) result=BigInteger.valueOf(r);
			if(r>n) {
				result=fact(r).divide(fact(n).multiply(fact(r-n)));
			}
			else {
				result=fact(n).divide(fact(r).multiply(fact(n-r)));
			}

			System.out.println(result);
		}
	}
}


//No. 10815
//시간초과 발생... 인터넷에 검색해보니 List를 사용하는 방식이 아닌 Hashset을 사용하는 방식을 이용함.
public class Num_card {
	public static void main(String[] args) throws IOException{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw=new BufferedWriter(new OutputStreamWriter(System.out));
		
		int n=Integer.valueOf(br.readLine());
		List<String> narr=new ArrayList<>();
		String have=br.readLine();
		
		StringTokenizer st=new StringTokenizer(have);
		while (st.hasMoreTokens()) {
			narr.add(st.nextToken());
		}
		
		int m=Integer.valueOf(br.readLine());
		have=br.readLine();
		st=new StringTokenizer(have);
		for(int i=0;i<m;i++) {
			String x=st.nextToken();
			if(narr.contains(x)) {
				bw.write("1 ");
			}
			else bw.write("0 ");
		}
		
		bw.flush();
		bw.close();
		br.close();
	}
}

/* List vs Hashset
 * List는 순서를 유지하며 저장하고(순차적 구조) 중복된 데이터를 허용함. 순서가 존재하므로 특정 요소 검색 시 느림.
 * Hashset은 순서를 보장하지 않으며 중복 데이터를 허용하지 않음. 특정 요소를 검색하는 동작이 매우 빠름(O(1)).
 * 즉, 순서가 중요하고 데이터의 삽입/삭제/출력 순서가 중요한 경우는 List, 데이터의 중복을 제거하거나 특정 데이터가 존재하는지 빠르게 확인해야 하는 경우 HashSet을 사용함. 
 * 그러나 HashSet은 해시값을 저장하기 때문에 메모리를 많이 차지함. List는 값만 순차적으로 저장하므로 메모리를 적게 사용함.
 * 단순 조회'만' 필요한게 아니라면 List를 쓰는게 적절함. 
 * 그러나 이 문제에서는 '두 숫자 카드에 같은 수가 적혀있는 경우는 없다.'는 전제조건이 붙었고,
 * '이 수가 적혀있는 숫자 카드를 상근이가 가지고 있는지 아닌지를 구하는 프로그램(즉, 단순 조회'만' 필요함.)' 이므로 HashSet를 사용하는게 적절한 문제였다. */

// HashSet ver. 
// 시간초과 에러 발생하지 않음.  
public class Num_card {
	public static void main(String[] args) throws IOException{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw=new BufferedWriter(new OutputStreamWriter(System.out));
		
		int n=Integer.valueOf(br.readLine());
		HashSet<String> narr=new HashSet<>();
		
		StringTokenizer st=new StringTokenizer(br.readLine());
		while (st.hasMoreTokens()) {
			narr.add(st.nextToken());
		}
		
		int m=Integer.valueOf(br.readLine());
		st=new StringTokenizer(br.readLine());
		
		while(st.hasMoreTokens()) {
			String x=st.nextToken();
			if(narr.contains(x)) {
				bw.write("1 ");
			}
			else bw.write("0 ");
		}
		
		bw.flush();
		bw.close();
		br.close();
	}
}
