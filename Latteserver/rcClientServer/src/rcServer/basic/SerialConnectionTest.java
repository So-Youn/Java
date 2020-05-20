package basic;

import gnu.io.CommPort;
import gnu.io.CommPortIdentifier;
import gnu.io.NoSuchPortException;
import gnu.io.PortInUseException;

public class SerialConnectionTest {
	public SerialConnectionTest() {
		
	}
	public void connect(String portName) {
		try {
			//COM��Ʈ�� ���� �����ϰ� ��밡���� �������� Ȯ��
			CommPortIdentifier commPortIdentifier = 
					CommPortIdentifier.getPortIdentifier(portName);
			//��Ʈ�� ��������� üũ
			if(commPortIdentifier.isCurrentlyOwned()) {
				System.out.println("��Ʈ ����� �� �����ϴ�.");
			}else {
				System.out.println("��Ʈ ��밡��.");
				//port�� ��� �����ϸ� ��Ʈ�� ���� ��Ʈ��ü�� ������
				//�Ű�����1 : ��Ʈ�� ���� ����ϴ� ���α׷��� �̸�(���ڿ�)
				//�Ű�����2 : ��Ʈ�� ���� ����ϱ� ���ؼ� ��ٸ��� �ð�(�и�������)
				CommPort commPort =
						commPortIdentifier.open("basic_serial",
								5000);
				System.out.println(commPort);
			}
		} catch (NoSuchPortException e) {
			e.printStackTrace();
		} catch (PortInUseException e) {
			e.printStackTrace();
		}
	}
	public static void main(String[] args) {
		new SerialConnectionTest().connect("COM5");
	}
}