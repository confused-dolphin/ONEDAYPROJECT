package oneday_Jan4;
import java.io.*;
import java.util.*;

//No. 2018  수들의 합5



//No. 2822  점수 계산



//No. 8979  올림픽



//No. 13909  창문 닫기



//No. 2669  직사각형 네개의 합집합의 면적 구하기



//No. 1343  폴리오미노



//No. 9656  돌 게임2



//No. 5635  생일



//No. 11931  수 정렬하기4
import java.io.*;
import java.util.*;

public class Num_sort4 {
	public static void main(String[] args) throws IOException{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw=new BufferedWriter(new OutputStreamWriter(System.out));
		
		int n=Integer.parseInt(br.readLine());
		List<Integer> arr=new ArrayList<>();
		for(int i=0;i<n;i++) {
			arr.add(Integer.parseInt(br.readLine()));
		}
		
		Collections.sort(arr, Collections.reverseOrder());
		for(int i=0;i<n;i++) {
			bw.write(arr.get(i)+"\n");
		}
		
		bw.flush();
		bw.close();
		br.close();
	}
}


//No. 10826  피보나치 수4
import java.util.*;
import java.math.BigInteger;

public class Fibonacci {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		
		List<BigInteger> list=new ArrayList<>();
		int m=0;
		while(list.size()!=n+1) {
			if(m==0||m==1) list.add(BigInteger.valueOf(m));
			else list.add(list.get(m-1).add(list.get(m-2)));
			m++;
		}
		System.out.println(list.get(n));
	}
}

