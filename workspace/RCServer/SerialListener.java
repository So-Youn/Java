package test;

import java.io.IOException;
import java.io.InputStream;

import gnu.io.SerialPortEvent;
import gnu.io.SerialPortEventListener;

public class SerialListener implements SerialPortEventListener{
	private InputStream in;
	private DistanceDTO dto;
	private boolean readingStatus;
	public SerialListener(InputStream in) {
		super();
		this.in = in;
		dto = new DistanceDTO();
		readingStatus = false;
	}
	//이벤트가 발생할때마다 호출되는 메소드
	//발생한 이벤트의 정보를 담고있는 객체 - SerialPortEvent
	@Override
	public void serialEvent(SerialPortEvent event) {
		//전송된 데이터가 있는 경우 데이터를 읽어서 콘솔에 출력
		if(event.getEventType()==SerialPortEvent.DATA_AVAILABLE) {
			byte[] buffer = new byte[1024]; //사이즈(1024)는 임의로 설정
			int len = -1;
			
			try {
				while((len=in.read(buffer))!=-1) {	
					System.out.println(new String(buffer,0,len)); //buffer의0번부터len까지
					dto.setMsg(new String(buffer,0,len));
					Thread.sleep(1000);
					//밖에서 포트가 데이터값을 읽고 있는지 아닌지 판단해 밖에서 접근할 수 있게 함
					if(len == -1) readingStatus = false;
					else readingStatus = true;
				}
				
			} catch (IOException | InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
	
	public DistanceDTO getDto() {
		return dto;
	}
	
	public boolean getStatus() {
		return readingStatus;
	}

}
