package server;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;

public class AndroidClient {
	Socket client;
	InputStream in;
	InputStreamReader ir;
	BufferedReader br;
	PrintWriter pw;
	
	SerialClient serialClient;
	
	public AndroidClient(Socket client) {
		this.client = client;
		ioWork();
		new ReceiveThread().start();
	}
	public void ioWork() {
		try {
			in = client.getInputStream();
			ir = new InputStreamReader(in);
			br = new BufferedReader(ir);
			pw = new PrintWriter(client.getOutputStream(),true);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	//시리얼과 연동할 수 있도록 연결해주는 메서드
	public void setSerialClient(SerialClient client) {
		this.serialClient = client;
	}
	
	public void sendMessage(String msg) {
		new Thread(new Runnable() {
			@Override
			public void run() {
				pw.println(msg);
				pw.flush();
			}
		}).start();
	}
	
	class ReceiveThread extends Thread {
		@Override
		public void run() {
			while(true) {
				try {
					String msg = br.readLine();
					if(serialClient != null) {
						if(msg.equals("auto_on")) {
							serialClient.sendMessageToArduino('1');
						} else {
							serialClient.sendMessageToArduino('0');
						}
					}
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		}
	}
}
