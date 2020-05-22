package serial;

import java.io.IOException;
import java.io.InputStream;

import gnu.io.SerialPortEvent;
import gnu.io.SerialPortEventListener;

//이벤트에 대해서 처리하는 리스너클래스
//시리얼포트로 데이터가 전송될때마다 이벤트가 발생하고 이벤트가 발생될때 데이터를 읽기
public class SerialListener  implements SerialPortEventListener{
	private InputStream in;
	public SerialListener(InputStream in) {
		super();
		this.in = in;
	}
	//이벤트가 발생할때마다 호출되는 메소드
	//발생한 이벤트의 정보를 담고 있는 객체 - SerialPortEvent
	@Override
	public void serialEvent(SerialPortEvent event) {
		//전송된 데이터가 있는 경우 데이터를 읽어서 콘솔에 출력
		if(event.getEventType()==SerialPortEvent.DATA_AVAILABLE) {
			try {
				//전송되는 데이터의 크기를 추출
				int check_size = in.available();
				byte[] data = new byte[check_size];
				in.read(data,0,check_size);
				System.out.println("받은 데이터:"+new String(data));
			} catch (IOException e) {
				e.printStackTrace();
			}//
		}
	}
}






