package Beakjoon.step08;
//ũ�ξ�Ƽ�� ���ĺ� ���
//Scanner ����
import java.util.*;
public class Test2941_2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String[] croatia = {"c=","c-","dz=","d-","lj","nj","s=","z="};
		
		String input = sc.nextLine();
		
		for(int i=0;i<8;i++) {
			input = input.replaceAll(croatia[i], "A");
	}
		System.out.println(input.length());
	}
}
