/*package test;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.net.Socket;

import gnu.io.SerialPortEvent;
import gnu.io.SerialPortEventListener;

public class ReceiverThread extends Thread{
	Socket client;
	BufferedReader br; 
	PrintWriter pw;
	SerialArduinoLEDControl serialObj; 
	OutputStream os; 
	InputStream in;
	InputStreamReader ir;
	public ReceiverThread(Socket client) {
		this.client = client;
		try {
			in = client.getInputStream();
			ir = new InputStreamReader(in);
			br = new BufferedReader(ir);
			pw = new PrintWriter(client.getOutputStream(),true);
			serialObj = new SerialArduinoLEDControl();
			serialObj.connect("COM5");
			os = serialObj.getOutput();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	public void run() {
		while(true) {
			try {
				String msg = br.readLine();	//안드로이드 읽기
				String str = serialObj.listener.dto.getMsg(); //시리얼 읽기 
				pw.println(str); //안드로이드 쓰기
				System.out.println("안드로이드에서 전달된 메시지 : "+msg);
				if(msg.equals("led_on")) {
					os.write('1');	//시리얼 쓰기
				}else {
					os.write('0');
				}
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}
	class SerialListener implements SerialPortEventListener{
		private InputStream in;
		public SerialListener(InputStream in) {
			super();
			this.in = in;
		}
		@Override
		public void serialEvent(SerialPortEvent event) {
			if(event.getEventType()==SerialPortEvent.DATA_AVAILABLE) {
				byte[] buffer = new byte[1024];
				int len = -1;
				try {
					while((len=in.read(buffer))!=-1) {
						System.out.println(new String(buffer,0,len));
						sendmsg = new String(buffer,0,len);
						Thread.sleep(1000);
					}
				} catch (IOException | InterruptedException e) {
					e.printStackTrace();
				}
			}
		}
		
	}
}
*/