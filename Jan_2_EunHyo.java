package oneday_Jan2;
import java.util.*;
import java.io.*;

// No. 1676    팩토리얼 0의 개수
public class fect_0_count {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int a=sc.nextInt();
		int count=0;
		
		while(a!=0) {
			count+=a/5;
			a/=5;
		}

		System.out.println(count);
		sc.close();
	}
}


// No. 11723  집합
public class Number_set {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		long a=sc.nextLong();
		long sum=0;
		
		for(int i=0;i <=a; i++) {
			sum+=i;
			if(sum>a) {
				System.out.print(i-1); 					
				break;
			}
			else if(sum==a) {
				System.out.print(i); 
				break;
			}
		}
		sc.close();
	}
}


// No. 1475    방 번호
public class RoomNumber {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String room=sc.nextLine();
		int[] set=new int[10];
		
		int result=0;
		
		for(int i=0;i<room.length();i++) {
			int n=Integer.valueOf(room.charAt(i))-48;
			set[n]+=1;
		}
		
		for(int i=0;i<10;i++) {
			if (i==6||i==9) {
				int sum=set[6]+set[9]+1;
				if(result<sum/2) result=sum/2;
			}
			else if(result<set[i]) result=set[i];
		}
		
		System.out.println(result);
		sc.close();
	}
}


// No. 1789    수들의 합
public class set_S {
	public static void main(String[] args) throws IOException{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw=new BufferedWriter(new OutputStreamWriter(System.out));
		
		HashSet<Integer> list= new HashSet<>();
		
		int a=Integer.parseInt(br.readLine());
		for(int i=0;i<a;i++) {
			StringTokenizer st=new StringTokenizer(br.readLine());
			String S=st.nextToken();
			
			if(S.equals("all")){
				for(int j=1;j<=20;j++) {
					list.add(j);
				}
			}
			
			else if(S.equals("empty")) {
				list.clear();
			}
				
			else {
				int n=Integer.parseInt(st.nextToken());
				if(S.equals("remove")) {
					list.remove(Integer.valueOf(n));

				}
				else if(S.equals("check")) {
					if(list.contains(n)) bw.write("1\n");
					else bw.write("0\n");
				}
				else if(S.equals("toggle")) {
					if(list.contains(n)) list.remove(Integer.valueOf(n));
					else list.add(n);
				}
				else if(S.equals("add")) {
					list.add(n);
				}
					
			}
		}
		bw.flush();
		bw.close();
		br.close();
	}
}


// No. 7785    회사에 있는 사람



// No. 1094    막대기



// No. 1476    날짜 계산



// No. 9655    돌게임



// No. 17478  재귀함수가 뭔가요? 



// No. 1439    뒤집기


