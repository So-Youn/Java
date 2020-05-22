package android.control;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

import basic.SerialArduinoLEDTest;

public class AndroidLEDControlServer {
	//서버 - 요청을 받기 위해 계속 돌고있어야 하는 프로그램
	
	private ServerSocket server;
	
	
	public void connect() {
		try {
			server = new ServerSocket(12345);
			
			
		} catch (IOException e1) {
			e1.printStackTrace();
		}
		Thread th = new Thread(new Runnable(){
			@Override
			public void run() {//여러 명 받아야 하기 때문에 무한 루프
				while(true){
					try {
						Socket client = server.accept();
						String ip = client.getInetAddress().getHostAddress();
						System.out.println(ip+"사용자 접속!!\n");
						//클라이언트가 보내는 메시지를 (지속적으로)읽고 있는 쓰레드
						new ReceiverThread(client).start();
					} catch (IOException e) {
						e.printStackTrace();
					}
				}
			}
		});
		th.start();
	}
	public static void main(String[] args) {
		new AndroidLEDControlServer().connect();
	}

}
