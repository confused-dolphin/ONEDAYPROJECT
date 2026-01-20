package oneday_Jan4;
import java.io.*;
import java.util.*;

//No. 2018  수들의 합5



//No. 2822  점수 계산



//No. 8979  올림픽



//No. 13909  창문 닫기



//No. 2669  직사각형 네개의 합집합의 면적 구하기



//No. 1343  폴리오미노
public class Polyomino {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String s=sc.nextLine();
		
		s=s.replace("XXXX", "AAAA");
		s=s.replace("XX", "BB");
		
		if(s.contains("X")) System.out.println("-1");
		else System.out.println(s);
		sc.close();
	}
}


//No. 9656  돌 게임2
public class Stone_game {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		int N=sc.nextInt();
		if(N%2==0) System.out.println("SK");
		else System.out.println("CY");
		
		sc.close();
	}
}


//No. 5635  생일
class birth{
	String name;
	int year;
	int month;
	int day;
	public birth(String name, int year, int month, int day) {
		this.name=name;
		this.year=year;
		this.month=month;
		this.day=day;
	}
}

public class Birthday {
	public static void main(String[] args) throws IOException{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw=new BufferedWriter(new OutputStreamWriter(System.out));
		
		int count=Integer.parseInt(br.readLine());
		List<birth> arr=new ArrayList<>();
		for(int i=0;i<count;i++) {
			StringTokenizer st=new StringTokenizer(br.readLine());
			String name=st.nextToken();
			int day=Integer.parseInt(st.nextToken());
			int month=Integer.parseInt(st.nextToken());
			int year=Integer.parseInt(st.nextToken());
			
			arr.add(new birth(name, year, month, day));
		}
		
		birth younger=arr.get(0);
		birth older=arr.get(0);
		
		for(birth i:arr) {
			if(older.year>i.year) older=i;
			else if(older.year==i.year) {
				if(older.month>i.month) older=i;
				else if(older.month==i.month) {
					if(older.day>i.day) older=i;
				}
			}
			
			if (younger.year<i.year) younger=i;
			else if(younger.year==i.year) {
				if(younger.month<i.month) younger=i;
				else if(younger.month==i.month) 
					if(younger.day<i.day) younger=i;
				}
			}
	
		bw.write(younger.name+"\n"+older.name);
		
		bw.flush();
		br.close();
		bw.close();
	}
}


//No. 11931  수 정렬하기4
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

