package oneday;

import java.util.*;
import java.io.*;

// No. 1316
public class WordChecker {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		int a=sc.nextInt();
		int count=0;
		
		for(int i=0;i<a;i++) {
			int[] arr=new int[26];
			char[] word=sc.next().toCharArray();
			int ct=0;
			
			while(ct!=word.length) {
				int pos=(int)word[ct]-97;
				if(arr[pos]==0||arr[pos]==ct) {
					ct++;
					arr[pos]=ct;
				}
				else break;
			}
			
			if(ct==word.length) {
				count++;
			}
		}
		
		System.out.println(count);
		sc.close();
	}
}


// No. 2751
public class Ascending {
	public static void main(String[] args) throws IOException {
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw=new BufferedWriter(new OutputStreamWriter(System.out));
		List<Integer> dq=new LinkedList<>();
		
		int count=Integer.parseInt(br.readLine());

		for(int i=0; i<count;i++) {
			dq.add(Integer.parseInt(br.readLine()));
		}
		
		Collections.sort(dq);
		/* 배열로 문제를 해결할 경우 시간 초과가 발생함. (count에 들어갈 수 있는 값이 1부터 1,000,000이므로)
		배열이 아닌 방법(스택/큐) 중 Collections.sort()를 사용할 수 있는 List를 사용해 시간 초과 문제 해결.*/
		for(int a:dq) {
			bw.write(a+"\n");
		}
		
		br.close();
		bw.flush();
		bw.close();
	}
}



// No. 1181
public class Wordsort {
	public static void main(String[] args) throws IOException{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw=new BufferedWriter(new OutputStreamWriter(System.out));
		List<String> arr=new LinkedList<>();
	
		
		int count=Integer.parseInt(br.readLine());
		
		/* 2751번과 유사하게 list로 받아 정렬을 시도했으나... 첫 번째 조건인 알파벳이 적은 순서대로 나열하는 부분에서 막혔습니다.
		 *  문제 해결을 위해 찾아본 자료 주소는 다음과 같습니다. https://st-lab.tistory.com/112. 다음 모임 이전까지 관련된 부분 학습해오겠습니다.  */
		
		br.close();
		bw.flush();
		bw.close();
	}
}