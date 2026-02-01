package oneday_Jan5;
import java.util.*;
import java.io.*;

// No. 9625 BABBA ----------------------------------------
public class BABBA {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);

		int n=sc.nextInt();
		int[] arr=new int[n+1];
		
		arr[0]=1;
		arr[1]=1;
		for(int i=2;i<=n;i++){
			arr[i]=arr[i-1]+arr[i-2];
		}
		
		if(n==1) System.out.println("0 1");
		else System.out.println(arr[n-2]+" "+arr[n-1]);
		sc.close();
	}
}


// No. 4659 비밀번호 발음하기 ----------------------------------------
public class Password {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		List<String> list=new ArrayList<>();
		
		while(true) {
			String s=sc.nextLine();
			if (s.equals("end")) break;
			else list.add(s);
		}
		
		while(!list.isEmpty()) {
			int vowel=0;
			int consonant=0;
			boolean flag=true;
			String a=list.remove(0);
			
			if(!a.contains("a")&&!a.contains("e")&&!a.contains("i")&&!a.contains("o")&&!a.contains("u")) {
				System.out.printf("<%s> is not acceptable.\n", a);
				flag=false;
				continue;
			}
			
			else {
				char[] arr=a.toCharArray();
				
				outer: for(int i=0; i<a.length();i++) {
					if(i>0&&arr[i-1]==arr[i]&&arr[i]!='e'&&arr[i]!='o') {
						System.out.printf("<%s> is not acceptable.\n", a);
						flag=false;
						break outer;
					}
					
					if(arr[i]=='a'||arr[i]=='e'||arr[i]=='i'||arr[i]=='o'||arr[i]=='u') {
						vowel++;
						consonant=0;
						if(vowel==3) {
							System.out.printf("<%s> is not acceptable.\n", a);
							flag=false;
							break outer;
						}
					}
					
					else {
						consonant++;
						vowel=0;
						if(consonant==3) {
							System.out.printf("<%s> is not acceptable.\n", a);
							flag=false;
							break outer;
						}
					}
				}
				
			}
			if(flag==true) System.out.printf("<%s> is acceptable.\n", a);
			else continue;
		}
	}
}


// No. 1652 누울 자리를 찾아라 ----------------------------------------
public class Sleep_place {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		int n=sc.nextInt();
		boolean[][] arr=new boolean[n][n];
		
		for(int i=0;i<n;i++) {
			String s=sc.next();
			for(int j=0;j<n;j++) {
				if(s.charAt(j)=='X') arr[i][j]=false;
				else arr[i][j]=true;
			}
		}

		int count1=0;
		int count2=0;
		int flag=0;
		
		for(int i=0;i<n;i++) {
			for(int j=0;j<n;j++) {
				if(arr[i][j]==true) flag++;
				else {
					if(flag==0||flag==1) {
						flag=0;
						continue;
					}
					else {
						count1++;
						flag=0;
						continue;
					}
				}
				
				if(j==n-1) {
					if(flag>=2) count1++;
					flag=0;
				}
			}
		}
		
		for(int i=0;i<n;i++) {
			for(int j=0;j<n;j++) {
				if(arr[j][i]==true) flag++;
				else {
					if(flag==0||flag==1) {
						flag=0;
						continue;
					}
					else {
						count2++;
						flag=0;
						continue;
					}
				}
				
				if(j==n-1) {
					if(flag>=2) count2++;
					flag=0;
				}
			}
			
		}
		
		System.out.printf("%d %d", count1, count2);
		sc.close();
	}
}


// No. 1417 국회의원 선거 ----------------------------------------
public class Election {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int x=sc.nextInt();
		List<Integer> list=new ArrayList<>();
		for(int i=0;i<n-1;i++) {
			list.add(sc.nextInt());
		}
		
		int result=0;
		Collections.sort(list, Collections.reverseOrder());
		
		if(n==1) {
			System.out.println("0");
		}
		else {
			while(x<=list.get(0)) {
				int a=list.remove(0);
				x++;
				a--;
				result++;
				list.add(a);
				Collections.sort(list, Collections.reverseOrder());
			}
			
			System.out.println(result);
		}
		sc.close();
	}
}


//No. 16435 스네이크버드 ----------------------------------------
public class SnakeBird {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int m=sc.nextInt();

		PriorityQueue<Integer> pq=new PriorityQueue<>();
		for (int i=0;i<n;i++) {
			pq.add(sc.nextInt());
		}
		
		while(!pq.isEmpty() && pq.peek() <= m) {
			m++;
			pq.poll();
		}
		
		System.out.println(m);
		sc.close();
	}
}


//No. 1251 단어 나누기----------------------------------------
public class Word_sort {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		PriorityQueue<String> pq = new PriorityQueue<>();
		String s=sc.nextLine();
		
		for(int i=1;i<s.length()-1;i++) {
			for(int j=i+1;j<s.length();j++) {
				String result="";
				String a=s.substring(0, i);
				String b=s.substring(i, j);
				String c=s.substring(j);
				
				for(int x=a.length()-1;x>=0;x--) {
					result+=a.charAt(x);
				}
				
				for(int x=b.length()-1;x>=0;x--) {
					result+=b.charAt(x);
				}
				
				for(int x=c.length()-1;x>=0;x--) {
					result+=c.charAt(x);
				}
				
				pq.add(result);
			}
		}
		System.out.print(pq.peek());
		sc.close();
	}
}


//No. 2828 사과 담기 게임 ----------------------------------------
public class apple {
	public static void main(String[] args) throws IOException{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw=new BufferedWriter(new OutputStreamWriter(System.out));
		
		StringTokenizer st=new StringTokenizer(br.readLine());
		
		int n=Integer.parseInt(st.nextToken());
		int m=Integer.parseInt(st.nextToken());
		
		int a=Integer.parseInt(br.readLine());
		int result=0;
		int front=1;
		int end=m;
		
		for(int i=0;i<a;i++) {
			int x=Integer.parseInt(br.readLine());
			if(x>=front&&x<=end) continue;
			else if(x>end) {
				while(end!=x) {
					front++;
					end++;
					result++;
				}
			}
			else if(x<front) {
				while(front!=x) {
					front--;
					end--;
					result++;
				}
			}
		}
		
		bw.write(String.valueOf(result));
		bw.flush();
		br.close();
		bw.close();
	}
}


//No. 2628 종이자르기 ----------------------------------------
public class Paper_cut {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		int n=sc.nextInt();
		int m=sc.nextInt();
		int a=sc.nextInt();
		
		List<Integer> wid=new ArrayList<>();
		List<Integer> len=new ArrayList<>();
		
		wid.add(0); wid.add(m);
		len.add(0); len.add(n);
		
		for(int i=0;i<a;i++) {
			int x=sc.nextInt();
			int y=sc.nextInt();
			if(x==0) wid.add(y);
			else len.add(y);
		}
		
		Collections.sort(wid);
		Collections.sort(len);
		
		int w_max=0;
		int l_max=0;
		
		for(int i=1;i<wid.size();i++) {
			w_max=Math.max(w_max, wid.get(i)-wid.get(i-1));
		}
		
		for(int i=1;i<len.size();i++) {
			l_max=Math.max(l_max, len.get(i)-len.get(i-1));
		}
		
		System.out.println(w_max*l_max);
		sc.close();
	}
}


//No. 13301 타일 장식물 ----------------------------------------
public class Tile {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		int n=sc.nextInt();
		
		long[] arr=new long[n+1];
		
		arr[0]=0;
		arr[1]=1;
		
		for(int i=2;i<n+1;i++) {
			arr[i]=arr[i-1]+arr[i-2];
		}
		
		long a=arr[n-1]+arr[n];
		long b=arr[n];
		System.out.println((arr[n-1]+arr[n])*2+arr[n]*2);
		sc.close();
	}
}


//No. 5800 성적 통계 ----------------------------------------
public class Score_Data {
	public static void main(String[] args) throws IOException{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw=new BufferedWriter(new OutputStreamWriter(System.out));
		
		int n=Integer.parseInt(br.readLine());
		for(int i=0;i<n;i++) {
			int gap=0;
			
			ArrayList<Integer> arr=new ArrayList<>();
			StringTokenizer st=new StringTokenizer(br.readLine());
			int x=Integer.parseInt(st.nextToken());
			for(int a=0;a<x;a++) {
				int y=Integer.parseInt(st.nextToken());
				arr.add(y);
			}
			
			Collections.sort(arr);
			int min=arr.get(0);
			int max=arr.get(arr.size()-1);
			for(int a=1;a<arr.size();a++) {
				gap=Math.max(gap, arr.get(a)-arr.get(a-1));
			}
			System.out.printf("Class %d\nMax %d, Min %d, Largest gap %d\n", i+1, max, min, gap);
		}
		bw.flush();
		br.close();
		bw.close();
		
	}
}

