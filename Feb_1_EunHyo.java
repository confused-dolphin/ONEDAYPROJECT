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



//No. 10709 기상캐스터 --------------------------------------



//No. 10431 줄세우기 --------------------------------------



//No. 1268 임시 반장 정하기 --------------------------------------



//No. 9237 이장님 초대 --------------------------------------



//No. 1402 아무래도이문제는A번난이도인것같다  --------------------------------------


