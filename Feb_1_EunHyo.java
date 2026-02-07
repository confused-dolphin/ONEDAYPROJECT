package oneday_Feb1;
import java.util.*;
import java.io.*;

// No. 1312 소수 --------------------------------------
public class Decimal {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int a=Integer.parseInt(st.nextToken());
        int b=Integer.parseInt(st.nextToken());
        int n=Integer.parseInt(st.nextToken());

        int result=a%b;

        for(int i=0;i<n-1;i++) {
        	result*=10;
        	result%=b;
        }

        result*=10;
        System.out.println(result/b);
        
        br.close();
    }
}


//No. 1312 3의 배수 --------------------------------------
public class Drainage {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		String a=br.readLine();
		int count=0;
		
		while(a.length()!=1) {
			int sum=0;
			for(int i=0;i<a.length();i++) {
				sum+=a.charAt(i)-'0';
			}
			count++;
			a=String.valueOf(sum);
		}
		
		System.out.println(count);
		if(Integer.parseInt(a)%3==0) System.out.println("YES");
		else System.out.println("NO");
	}
}


//No. 11576 Base Conversion --------------------------------------
public class Base_Conversion {
	public static void main(String[] args) throws IOException {
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		
		StringTokenizer st=new StringTokenizer(br.readLine());
		int a=Integer.parseInt(st.nextToken());
		int b=Integer.parseInt(st.nextToken());
		
		int m=Integer.parseInt(br.readLine());
		
		st=new StringTokenizer(br.readLine());
		long mid=0;
		for(int i=0;i<m;i++) {
			int x=Integer.parseInt(st.nextToken());
			mid=mid*a+x;
		}
		
		Stack<Integer> stack=new Stack<>();
		while(mid>0) {
			stack.push((int)(mid%b));
			mid/=b;
		}
		
		while(!stack.isEmpty()) System.out.print(stack.pop()+" ");
		br.close();
	}
}


//No. 15688 수 정렬하기5 --------------------------------------
public class Num_sort5 {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int a=Integer.parseInt(br.readLine());
		ArrayList<Integer> list = new ArrayList<>();
		
		for(int i=0;i<a;i++) {
			list.add(Integer.parseInt(br.readLine()));
		}
		
		Collections.sort(list);;
		StringBuilder sb = new StringBuilder();
		
		for(int i:list) {
			sb.append(i).append('\n');
		}
		System.out.print(sb);
	}
}


//No. 16395 파스칼의 삼각형 --------------------------------------
public class Pascal_triangle {
	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int k=sc.nextInt();
		
		if(n>=k) { 
			int[][] arr=new int[n+1][n+1];
			
			arr[0][1]=1;
			arr[1][0]=1;
			arr[1][1]=1;
			
			for(int i=2;i<n+1;i++) {
				for (int j=1;j<n+1;j++){
					if(j==1||j==i) {
						arr[i][j]=1;
					}
					else {
						arr[i][j]=arr[i-1][j-1]+arr[i-1][j];
					}
				}
			}
			
			System.out.println(arr[n][k]);
		}
	}
}


//No. 10709 기상캐스터 --------------------------------------
public class Cloud {
	public static void main(String[] args) throws IOException{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		
		StringTokenizer st=new StringTokenizer(br.readLine());
		int a=Integer.parseInt(st.nextToken());
		int b=Integer.parseInt(st.nextToken());
		
		StringBuilder sb=new StringBuilder();
		for(int i=0;i<a;i++) {
			String x=br.readLine();
			int flag=-1;
			
			for(int j=0;j<b;j++) {
				char now=x.charAt(j);
				if(now=='.'&&flag>-1) {
					flag++;
					sb.append(flag).append(" ");
				}
				else if(now=='.'&&flag==-1) sb.append(flag).append(" ");
				
				if(now=='c') {
					flag=0;
					sb.append(flag).append(" ");
				}
			}
			sb.append("\n");
		}
		System.out.println(sb);
	}
}


//No. 10431 줄세우기 --------------------------------------
public class Line_up {
	public static void main(String[] args) throws IOException{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		
		int n=Integer.parseInt(br.readLine());
		StringBuilder sb=new StringBuilder();

		for(int k=0;k<n;k++) {
			StringTokenizer st=new StringTokenizer(br.readLine());
			
			String num=st.nextToken();
			int[] arr=new int[20];
			
			for(int i=0;i<20;i++) {
				arr[i]=Integer.parseInt(st.nextToken());
			}
			
			int result=0;
			for(int i=0;i<20;i++) {
				for(int j=0;j<i;j++) {
					if(arr[j]>arr[i]) result++;
				}
			}
			sb.append(num).append(" ").append(result).append("\n");
		}
		System.out.print(sb);
	}
}


//No. 1268 임시 반장 정하기 --------------------------------------
public class Temporary_President {
	public static void main(String[] args) throws IOException{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		
		int n=Integer.parseInt(br.readLine());
		
		int[][] arr=new int[n][5];

		for(int i=0;i<n;i++) {
			StringTokenizer st=new StringTokenizer(br.readLine());
			for(int j=0;j<5;j++) {
				arr[i][j]=Integer.parseInt(st.nextToken());
			}
		}

		int friend=-1;
		int flag=0;
		
		for(int i=0;i<n;i++) {
			int count=0;
			for(int j=0;j<n;j++) {
				if(i==j) continue;
				else {
					for(int k=0;k<5;k++) {
						if(arr[i][k]==arr[j][k]) {
							count++;
							break;
						}
					}
					
					if(count>friend) {
						friend=count;
						flag=i+1;
					}
				}
			}
		}
		System.out.println(flag);
		br.close();
	}
}


//No. 9237 이장님 초대 --------------------------------------
public class Chief_invitation {
	public static void main(String[] args) throws IOException{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		
		int n=Integer.parseInt(br.readLine());
		List<Integer> list=new ArrayList();
		
		StringTokenizer st=new StringTokenizer(br.readLine());
		for(int i=0;i<n;i++) {
			list.add(Integer.parseInt(st.nextToken()));
		}
		
		Collections.sort(list);
		Collections.reverse(list);
		
		int max=0;
		for(int i=0;i<n;i++) {
			int a=list.get(i)+i+2;
			if(a>max) max=a;
		}
		
		System.out.println(max);
	}
}


//No. 1402 아무래도이문제는A번난이도인것같다  --------------------------------------
public class Level_A {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		int a=sc.nextInt();
		int x=sc.nextInt();
		int y=sc.nextInt();
		
		for(int i=0;i<a;i++) {
			boolean flag=false;
			
			if(x<=0) {
				for(int k=x;k>=0;k--) {
					for(int j=x;j>y;j--) {
						if(i+j==x&&i*j==y) flag=true;
						else continue;
					}
				}
			}
			
			else {
				for(int k=1;k<=x;k++) {
					for(int j=1;j<=y;j++) {
						if(i+j==x&&i*j==y) flag=true;
						else continue;
					}
				}
			}
			if(flag=true) System.out.println("yes");
			else System.out.println("no");
		}
	}
}


