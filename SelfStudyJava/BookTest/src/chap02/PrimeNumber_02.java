package chap02;
//1,000 ������ �Ҽ��� ����
public class PrimeNumber_02 {
	public static void main(String[] args) {
		int count =0;
		int ptr =0;						//ã�� �Ҽ��� ����
		int[] prime = new int[500];    // �Ҽ� ����
		
		prime[ptr++] = 2;   // 2�� �Ҽ�.
		
		for (int n = 3; n <= 1000; n+=2) {  //����� Ȧ����
			int i;
			for(i=1;i<ptr;i++) {
				count++;
				if(n % prime[i] ==0)
					break;
			}
			if(ptr ==i)
				prime[ptr++] = n;
		}
		for(int i=0;i<ptr;i++)    //ã�� ptr���� �Ҽ���  ��Ÿ��
			System.out.println(prime[i]);
		System.out.println("�������� ������ Ƚ��:" +count);
	}

}
