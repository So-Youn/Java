package Beakjoon.step08;
import java.util.*;
public class Test1157 {
//���� ���� ���� ���ĺ� ã��.
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] cnt = new int[26]; //���ĺ� ī��Ʈ ����
		int max =0;  //���� ���� ���� ���ĺ� ���� ������ ����
		char answer = '?';
		
		String word = sc.next().toUpperCase();
		//�ܾ� �Է� + �빮�� ��ȯ
		for(int i=0;i<word.length();i++) {
			cnt[word.charAt(i)-65]++;  // ���ĺ�ī��Ʈ �迭 index�� +1
			if(max < cnt[word.charAt(i)-65]) {
				answer = word.charAt(i); 
				max = cnt[word.charAt(i)-65];
			}
			else if(max == cnt[word.charAt(i)-65]) {
				answer ='?'; // ���� ���ĺ� ���� max�� ���ٸ�
			}
		}
		System.out.println(answer);
		sc.close();
		
	}

}
