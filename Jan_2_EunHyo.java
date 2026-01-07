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
public class Company_employee {
	public static void main(String[] args) throws IOException{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw=new BufferedWriter(new OutputStreamWriter(System.out));
		
		int a=Integer.parseInt(br.readLine());
		HashSet<String> employee=new HashSet<>();
		
		for(int i=0;i<a;i++) {
			StringTokenizer st=new StringTokenizer(br.readLine());
			String name=st.nextToken();
			String status=st.nextToken();
			
			if(status.equals("enter")) employee.add(name);
			else  employee.remove(name);
		}
		
		List<String> list=new ArrayList<>(employee);
		Collections.sort(list, Collections.reverseOrder());
		
		for(String x:list) {
			bw.write(x+"\n");
		}
		
		bw.flush();
		br.close();
		bw.close();
	}
}


// No. 1094    막대기
public class Stick {
	public static int cutting(int X, int have) {
		int result=0;
		if(X<have) return cutting(X, have/2);
		else {
			result+=1;
			if(X==have) return result;
			else if(X==have+have/2) return (result+1); 
			else return result+cutting(X-have, have);
		}
	}
	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		int X=sc.nextInt();
		int have=64;
		int result=cutting(X, have);
		
		System.out.println(result);
	}
}


// No. 1476    날짜 계산
public class Year_count {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int a=sc.nextInt();
		int b=sc.nextInt();
		int c=sc.nextInt();
	
		int year=0;
		
		int E=1;
		int S=1;
		int M=1;
		while(true) {
			year++;
			if(a==E&&b==S&&c==M) break;
			
			E++;
			S++;
			M++;
			
			if (E==16) E=1;
			if (S==29) S=1;
			if (M==20) M=1;
		}
		System.out.println(year);
	}
}


// No. 9655    돌게임



// No. 17478  재귀함수가 뭔가요? 
public class What_is {
	static String under="";
	public static void chatbot(int a) {
		String s=under;
		String one="\"재귀함수가 뭔가요?\"";
		String two="\"잘 들어보게. 옛날옛날 한 산 꼭대기에 이세상 모든 지식을 통달한 선인이 있었어. ";
		String three="마을 사람들은 모두 그 선인에게 수많은 질문을 했고, 모두 지혜롭게 대답해 주었지. ";
		String four="그의 답은 대부분 옳았다고 하네. 그런데 어느 날, 그 선인에게 한 선비가 찾아와서 물었어.\"";
		String mid="\"재귀함수는 자기 자신을 호출하는 함수라네\"";
		String end="라고 답변하였지.";
		
		if (a==0) {
			System.out.println(s+one);
			System.out.println(s+mid);
			System.out.println(s+end);
			return;
		}
		System.out.println(s+one);
		System.out.println(s+two);
		System.out.println(s+three);
		System.out.println(s+four);
		under+="____";
		chatbot(a-1);
		System.out.println(s+end);
	}

	public static void main(String[] args)  {
		Scanner sc=new Scanner(System.in);
		
		int x=sc.nextInt();
		System.out.println("어느 한 컴퓨터공학과 학생이 유명한 교수님을 찾아가 물었다.");
		chatbot(x);
	}
}


// No. 1439    뒤집기


