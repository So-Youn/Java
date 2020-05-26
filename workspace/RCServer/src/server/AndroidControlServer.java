package server;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

public class AndroidControlServer {
	private ServerSocket server;
	private AndroidClient androidClient;
	private SerialClient serialClient;
	
	public void connect() {
		try {
			server = new ServerSocket(12345);
			
			
		} catch (IOException e1) {
			e1.printStackTrace();
		}
		Thread th = new Thread(new Runnable(){
			@Override
			public void run() {
				Socket client;
				try {
					client = server.accept();
					androidClient = new AndroidClient(client);
					serialClient = new SerialClient();
					
					//안드로이드와 시리얼 연결
					androidClient.setSerialClient(serialClient);
					serialClient.setAndoridClient(androidClient);
					
				} catch (IOException e1) {
					e1.printStackTrace();
				}
			}
		});
		th.start();
		
	}
	public static void main(String[] args) {
		new AndroidControlServer().connect();
	}

}
