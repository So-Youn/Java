package Chap03;

import java.util.Random;

public class RandTest02 {

	public static void main(String[] args) {
		//Random�� nextInt �̿��ؼ� 1���� 100���� ���� �߻���Ų �� �۾�
		Random rand = new Random();
		int num = rand.nextInt(100)+1;
		System.out.println(num);
		

	}

}
