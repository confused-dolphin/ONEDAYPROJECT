package oneday;
import java.util.*;
import java.io.*;

// No. 4673
public class Selfnumber {
	public static void main(String[] args) {
		boolean[] a=new boolean [10001];
		
		for(int i=1;i<10000;i++) {
			int sum=0;
			
			if(i<10) {
				sum=i+i;
				a[sum]=true;
			}
			
			else if(i>=10&&i<100) {
				sum=i+(i/10)+(i%10);
				a[sum]=true;
			}
			
			else if(i>=100&&i<1000) {
				sum=i+(i/100)+((i%100)/10)+((i%100)%10);
				a[sum]=true;
			}
			
			else {
				sum=i+(i/1000)+((i%1000)/100)+(((i%1000)%100)/10)+(((i%1000)%100)%10);
				if(sum>10000) continue;
				else a[sum]=true;
			}
		}
		
		for(int i=1; i<10000;i++) {
			if(a[i]==false) {
				System.out.println(i);
			}
		}
	}
}


//No. 11650
public class Line_up {
	public static void main(String[] args) throws IOException {
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw=new BufferedWriter(new OutputStreamWriter(System.out));
		
		int a=Integer.parseInt(br.readLine());
		String[] arr=new String[a];
		
		for(int i=0;i<a;i++) {
			arr[i]=br.readLine();
		}
		
		for(int i=0;i<a-1;i++) {
			if(arr[i].compareTo(arr[i+1])>0) {
				String num=arr[i];
				arr[i]=arr[i+1];
				arr[i+1]=num;
				
				i=0;
			}
			
			// x좌표끼리 비교해서 정렬하는 것 까지는 완성했는데... y좌표가 음수일 경우를 어떻게 처리해야할지 모르겠음!
		}
		
		for(int i=0;i<a;i++) {
			String s=arr[i];
			bw.write(s+"\n");
			bw.flush();
		}
		bw.close();
		br.close();
	}
}


//No. 10814
import java.util.*;

//class를 만들어서 입력받은 정보 값(나이, 이름)을 관리해야  함
class people{
	int age; 
	String name;
	public people(int age, String name) {
		this.age=age;
		this.name=name;
	}
}

public class Old_sort {
	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		List<people> list=new ArrayList<>();
		// people 클래스를 이용하여 만든 객체를 담는 list 생성
		
		int a=sc.nextInt();
		
		for(int i=0;i<a;i++) {
			int age=sc.nextInt();
			String name=sc.next();
			list.add(new people(age, name));
		}
		
		Collections.sort(list, new Comparator<people>() {
			@Override
			public int compare(people p1, people p2) {
				return p1.age-p2.age;
			}
		});
		// 람다 표현식이 뭔지 공부 필요할 것 같음. 더해서 comparator과 @Override도... 
		// 참고한 블로그(https://velog.io/@dev-easy/Java-Map%EC%9D%84-Key-Value%EB%A1%9C-%EC%A0%95%EB%A0%AC%ED%95%98%EA%B8%B0)에 람다표현식으로 sort를 진행하는 방식이 나와있는데... 이해가 안감...
		
		for(people p:list) {
			System.out.println(p.age+" "+p.name);
		}
	}
}

//No. 1427  
public class SortInside {
	public static void main(String[] args) throws IOException{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw=new BufferedWriter(new OutputStreamWriter(System.out));
		
		String num=br.readLine();
		int len=num.length();
		char[] result=new char[len];
		for(int i=0;i<len;i++) {
			result[i]=num.charAt(i);
		}
		
		Arrays.sort(result);
		for(int i=len-1;i>=0;i--) {
			bw.write(result[i]);
		}
		bw.flush();
		br.close();
		bw.close();
	}
}


//No. 1436
public class ACT_Shom {
	public static void main(String[] args) {
		// 죄송합니다. 문제 자체도 이해하지 못했습니다......
	}
}


//No. 7568
public class Weight {
	import java.util.*;

	class human{
		int weight;
		int tall;
		
		public human(int weight, int tall) {
			this.weight=weight;
			this.tall=tall;
		}
	}

	public class Weight {
		public static void main(String[] args) {
			Scanner sc=new Scanner(System.in);
			List<human> list=new ArrayList<>();
			
			int num=sc.nextInt();
			
			for(int i=0;i<num;i++) {
				int weight=sc.nextInt();
				int tall=sc.nextInt();
				list.add(new human(weight, tall));
			}
			
			int[] result=new int[num];
			
			
			
		}
	}
}