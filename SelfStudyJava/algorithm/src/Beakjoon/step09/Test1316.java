package Beakjoon.step09;
import java.util.*;
//�׷�ܾ� üũ�ϱ�

public class Test1316 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String input = sc.nextLine();
		
		int inputcnt = Integer.valueOf(input); // ��ü�� �޾ƿ��� ���� �� valueOf 
		int result = inputcnt;
		
		for(int i=0;i<inputcnt;i++) {
			String inputstr = sc.nextLine();
			int[] chk = new int[26];
			
			for(int j =1;j<inputstr.length();j++) {
				chk[inputstr.charAt(0)-'a'] =1;
				if(inputstr.charAt(j)!=inputstr.charAt(j-1)) {
					if(chk[inputstr.charAt(j)-'a']==0) {
						chk[inputstr.charAt(j)-'a']=1;
					}else {
						result = result-1;
						break;
					}
				}
			}
			chk = new int[26];
		}
		System.out.println(result);
		sc.close();
	}

}
