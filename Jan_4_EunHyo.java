package oneday_Jan4;
import java.io.*;
import java.util.*;

//No. 2018  수들의 합5



//No. 2822  점수 계산
class result{
	int num;
	int sc;
	public result(int num, int sc) {
		this.num=num;
		this.sc=sc;
	}
}

public class Score {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		List<result> list=new ArrayList<>();
		for(int i=0;i<8;i++) {
			int x=sc.nextInt();
			list.add(new result(i, x));
		}
		
		Collections.sort(list, (o1, o2) -> o2.sc - o1.sc);
		
		int sum=0;
		List<Integer> arr=new ArrayList<>();
		for(int i=0;i<5;i++) {
			sum+=list.get(i).sc;
			arr.add(list.get(i).num+1);
		}
		
		Collections.sort(arr);
		System.out.println(sum);
		for(int i:arr) {
			System.out.print(i+" ");
		}
	}
}


//No. 8979  올림픽
class country{
	String name;
	int a;
	int b;
	int c;
	public country(String name, int a, int b, int c) {
		this.name=name;
		this.a=a;
		this.b=b;
		this.c=c;
	}
}

public class Olympic {
	public static void main(String[] args) throws IOException{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw=new BufferedWriter(new OutputStreamWriter(System.out));
		
		StringTokenizer st=new StringTokenizer(br.readLine());
		int n=Integer.parseInt(st.nextToken());
		String flag=st.nextToken();
		int x=0;
		int y=0;
		int z=0;
		List<country> list=new ArrayList<>();
		for(int i=0;i<n;i++) {
			st=new StringTokenizer(br.readLine());
			String name=st.nextToken();
			int a=Integer.parseInt(st.nextToken());
			int b=Integer.parseInt(st.nextToken());
			int c=Integer.parseInt(st.nextToken());
			
			list.add(new country(name, a, b, c));
			if(flag.equals(name)) {
				x=a;
				y=b;
				z=c;
			}
		}
		int result=1;
		
		for(country i:list) {
			if(i.name.equals(flag)) continue;
			else {
				if(x==i.a) {
					if(y==i.b) {
						if(z<i.c) {
							result++;
						}
					}
					else if(y<i.b) {
						result++;
					}
				}
				else if(x<i.a) {
					result++;
				}
			}
		}
		
		bw.write(String.valueOf(result));
		bw.flush();
		bw.close();
		br.close();
	}
}


//No. 13909  창문 닫기
public class Close_window {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		
		int result=(int)Math.sqrt(n);
		
		System.out.println(result);
		sc.close();
	}
}


//No. 2669  직사각형 네개의 합집합의 면적 구하기
public class Rectangle {
	public static void main(String[] args) throws IOException{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw=new BufferedWriter(new OutputStreamWriter(System.out));
		
		boolean[][] arr=new boolean[100][100];
		int count=0;
		
		for(int i=0;i<4;i++) {
			StringTokenizer st=new StringTokenizer(br.readLine());
			int x=Integer.parseInt(st.nextToken());
			int y=Integer.parseInt(st.nextToken());
			int a=Integer.parseInt(st.nextToken());
			int b=Integer.parseInt(st.nextToken());
			
			for(int n=x; n<a; n++) {
				for(int m=y;m<b;m++) {
					if (arr[n][m]==true) continue;
					else {
						arr[n][m]=true;
						count++;
					}
				}
			}
		}
		bw.write(String.valueOf(count));
		bw.flush();
		bw.close();
		br.close();
	}
}


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