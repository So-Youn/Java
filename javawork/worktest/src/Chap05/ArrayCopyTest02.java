package Chap05;

public class ArrayCopyTest02 {
	public static void main(String[] args) {
		int[] firstArr = new int[5];
		//�迭�� ���� �Ҵ��ϱ� ���� for��
		for(int i =0 ;i<firstArr.length;i++) {
			firstArr[i]=10+i;
		}
		for(int i=0; i<firstArr.length;i++) {
			System.out.print(firstArr[i]+" ");
		}
		System.out.println( );
		//firstiArr �� ������ �迭 ����
		int[] SecondArr = new int[firstArr.length*2];
		//firstArr�迭�� 0������, firstArr�� ��� ��Ҹ� secondArr�� 0�� ��ġ���� 
		//copy�ؼ� �����ϱ�.
		System.arraycopy(firstArr, 3,SecondArr,2,2);
		for(int i=0; i<SecondArr.length;i++) {
			System.out.print(SecondArr[i]+" ");
		}
		System.out.println( );
		}
	}

