package chap08;

//API�� �޼ҵ带 ȣ���ϴ� ���
//1. API�� �޼ҵ� ����� �� ����ο� throws�� �߰��Ǿ� ������ �ݵ�� try~catch�� ó���ؾ� �Ѵ�.
//2. �޼ҵ尡 RuntimeException�� ���� Exception�� throws�ϴ� ��쿡�� ����������
//   Exception�� ���� ó���� �ϵ��� �������� �ʴ´�.
//   = �������� ���������� ������ Exception�� throws �ϰ� ������ ó���� �ؾ� �Ѵ�.
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class ExceptionTest05 {
	public static void main(String[] args) {
		try {
			FileInputStream fs = new FileInputStream("test.txt");
			System.out.println(fs.read());
			// Unhandled exception type FileNotFoundException
			//�� �����ڴ� ���� �߻����ɼ��� ������, �� exception�� ó���� ���� ������ִ� ��.
			System.out.println(Integer.parseInt("1234"));
			//System.out.println(Integer.parseInt("���ڿ�"));
			//NumberFormatException : ���ڿ�������, ���ڷ� �νĵǾ�� �Ѵ�.
		}catch (FileNotFoundException e) {
			System.out.println("������ ���� �� ������ �߻��߽��ϴ�.");
		}catch (IOException e) {
			System.out.println("������ ã�� �� �����ϴ�.");
			// ������ �ٽ� ������ �� �ֵ��� ó��
		}
	}
}