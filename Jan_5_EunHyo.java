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


//No. 16435 스네이크버드 ----------------------------------------


//No. 1251 단어 나누기----------------------------------------


//No. 2828 사과 담기 게임 ----------------------------------------


//No. 2628 종이자르기 ----------------------------------------


//No. 13301 타일 장식물 ----------------------------------------


//No. 5800 성적 통계 ----------------------------------------