package api.io;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

//�׻� �� �÷����� ����
//[�������]
//�̹�ȣ�� ������ 100��
//������ ������ 98��
//������� ������ 99��
//���� :____	
//��� :____
public class ScoreTest {
	public static void main(String[] args) {
		BufferedReader br = null;
		int sum=0;
		int count=0;
		try {
			br = new BufferedReader(new FileReader("src/data/score.txt"));
			while (true) {
				String data = br.readLine();
				if (data == null) {
					break;
				}
				//null�� ������ break���� �ʵ��� if�� �ؿ� ����.
				String[] newdata = data.split(",");
				System.out.println(newdata[0]+"��������"+newdata[1]);
				
				sum=sum+Integer.parseInt(newdata[1]);
				count++;
			}
			
			System.out.println("����:"+sum);
			System.out.println("���:"+sum/count);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			// 3.���� �ݱ�
			try {
				if (br != null) {
					br.close();
				}
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}

}
