package Chap03;

import java.util.Random;

public class RandTest02 {

	public static void main(String[] args) {
		//Random의 nextInt 이용해서 1부터 100까지 값을 발생시킨 후 작업
		Random rand = new Random();
		int num = rand.nextInt(100)+1;
		System.out.println(num);
		

	}

}
