package oneday_Jan3;
import java.io.*;
import java.util.*;


// No. 11004  K번째 수
public class Kth_num {
	public static void main(String[] args) throws IOException{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw=new BufferedWriter(new OutputStreamWriter(System.out));
		
		StringTokenizer st=new StringTokenizer(br.readLine(), " ");
		int N=Integer.parseInt(st.nextToken());
		int K=Integer.parseInt(st.nextToken());
		List<Integer> arr=new ArrayList<>();
		
		st=new StringTokenizer(br.readLine(), " ");
		while(st.hasMoreTokens()) {
			arr.add(Integer.parseInt(st.nextToken()));
		}
		
		Collections.sort(arr);
		bw.write(String.valueOf(arr.get(K-1)));
		bw.flush();
		bw.close();
		br.close();
	}
}


// No. 13241  최소공배수
public class Common_multiple {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		long a=sc.nextLong();
		long b=sc.nextLong();	
		long gcd=0;
		long A=a*b;
		
		while(b!=0) {
			long r=a%b;
			a=b;
			b=r;
			gcd=a;
		}
		System.out.println(A/gcd);
	}
}


// No. 2167  2차원 배열의 합
public class Arr_sum {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int m=sc.nextInt();
		int[][] arr=new int[n][m];
		
		for(int i=0;i<n;i++) {
			for(int j=0;j<m;j++) {
				arr[i][j]=sc.nextInt();
			}
		}
		
		int k=sc.nextInt();
		
		while(k!=0) {
			int i=sc.nextInt()-1;
			int j=sc.nextInt()-1;
			int x=sc.nextInt();
			int y=sc.nextInt();
			int sum=0;
			
			for(int a=i;a<x;a++) {
				for(int b=j;b<y;b++) {
					sum+=arr[a][b];
				}
			}
			System.out.println(sum);
			k--;
		}
		sc.close();
	}
}


// No. 11728  배열 합치기
public class Arr_addup {
	public static void main(String[] args) throws IOException {
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw=new BufferedWriter(new OutputStreamWriter(System.out));
		
		StringTokenizer st=new StringTokenizer(br.readLine(), " ");
		
		List<Integer> A=new ArrayList<>(Integer.parseInt(st.nextToken()));
		List<Integer> B=new ArrayList<>(Integer.parseInt(st.nextToken()));
		List<Integer> result=new ArrayList<>();
		
		st=new StringTokenizer(br.readLine(), " ");
		while(st.hasMoreElements()) {
			A.add(Integer.parseInt(st.nextToken()));
		}
		
		st=new StringTokenizer(br.readLine(), " ");
		while(st.hasMoreElements()) {
			B.add(Integer.parseInt(st.nextToken()));
		}
		
		result.addAll(A);
		result.addAll(B);
		Collections.sort(result);

		for(int i=0;i<result.size();i++) {
			bw.write(result.get(i)+" ");
		}
		bw.flush();
		bw.close();
		br.close();
	}
}


// No. 24313  알고리즘 수업-점근적 표기 1
public class Algorism {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		int a=sc.nextInt();
		int b=sc.nextInt();
		int c=sc.nextInt();
		int n=sc.nextInt();
		boolean flag=true;
		
		while(n!=100) {
			if(a*n+b>c*n) {
				flag=false; 
			}
			n++;
		}
		
		if(flag) System.out.println("1");
		else System.out.println("0");
	}
}


// No. 2740  행렬 곱셈
public class matrix_mul {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		int N=sc.nextInt();
		int M=sc.nextInt();
		int[][] A=new int[N][M];
		
		for(int i=0;i<N;i++) {
			for(int j=0;j<M;j++) {
				A[i][j]=sc.nextInt();
			}
		}
		
		M=sc.nextInt();
		int K=sc.nextInt();
		int[][] B=new int[M][K];
		
		for(int i=0;i<M;i++) {
			for(int j=0;j<K;j++) {
				B[i][j]=sc.nextInt();
			}
		}
		
		int[][] result=new int[N][K];
		for(int i=0;i<N;i++) {
			for(int j=0;j<K;j++) {
				for(int k=0;k<M; k++) {
					result[i][j]+=A[i][k]*B[k][j];
				}
				System.out.print(result[i][j]+" ");
			}
			System.out.println();
		}
	}
}


// No. 14916  거스름돈
public class Charge {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int N=sc.nextInt();
		int result=N/5;
		int M=N%5;
		
		if(M%2==0) result+=M/2;
		while(M%2!=0) {
			result--;
			M+=5;
			if(M%2==0) result+=M/2;
			if(M>N) {
				result=-1;
				break;
			}
		}
		System.out.println(result);
		sc.close();
	}
}


// No.2161  카드1



// No.1543  문서 검색



// No. 10867  중복 빼고 정렬하기


