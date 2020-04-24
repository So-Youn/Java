package api.io;

import java.io.IOException;
import java.io.InputStream;
import java.io.PrintStream;

//InputStream�� �̿��ؼ� Ű����� �Է¹޴� ���ڿ� �б� - ScannerŬ������ next�޼ҵ��� ��� ����
//
public class InputStreamTest {
	public static void main(String[] args) {
		InputStream in = System.in; // System.in�� ���
		PrintStream out = System.out;
		// read�޼ҵ�� �ѹ��� 1byte�ۿ� ���� ���ϹǷ� �ݺ����� �����־�� �Ѵ�.
		while (true) {
			// 1. ��Ʈ���� �����͸� 1byte �д� �۾�
			try {
				int data = in.read();
				if (data == 13) {
					// 13�� ; enter�ǹ�
					break;
				}
				out.print((char) data);
				// �ѱ��� 2byte�̱� ������ ������ ���� ���Ͽ� ���� ���Ѵ�.
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}

}
