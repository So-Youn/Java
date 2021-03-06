package android.control;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.net.Socket;

//tcp서버쪽에 클라이언트의 요청을 계속 읽는 쓰레드
public class ReceiverThread extends Thread {
	Socket client; 
	BufferedReader br;// 클라이언트의 메시지 읽는 스트림
	PrintWriter pw; // 클라이언트에게 메시지를 전달하는 스트림	SerialArduinoLEDControl serialObj;//시리얼 통신을 위한 객체
	OutputStream os;//시리얼 통신에서 아두이노로 데이터를 보내기 위한 객체
	 public ReceiverThread(Socket client){
		 this.client=client;
		 //클라이언트가 보내오는 메시지를 읽기 위한 스트림
		 try {
			br = new BufferedReader(new InputStreamReader(
					client.getInputStream()));
			pw = new PrintWriter(client.getOutputStream(), true);
			//true 해주어야 br 에 있는 내용 비워줄 수 있음
			//아두이노와 시리얼통신을 위해서 아두이노로 데이터를 내보내기 위한 스트림 얻기
			serialObj = new SerialArduinoLEDControl();
			serialObj.connect("COM10");
			//생성자 - 포트 한번만 호출하도록
			os = serialObj.getOutput();
		 } catch (IOException e) {
			e.printStackTrace();
		}
	 }
	 public void run(){
		 //클라이언트의 메시지를 받아서 아두이노로 데이터를 전송
		 while(true){
			 try {
				String msg = br.readLine();
				System.out.println("클라이언트가 보낸 메시지"+msg);
				if(msg.equals("led_on")){
					os.write('1');
				}else{
					os.write('0');
				}
			} catch (IOException e) {
				e.printStackTrace();
			}
			 
		 }
	 }
	
}
