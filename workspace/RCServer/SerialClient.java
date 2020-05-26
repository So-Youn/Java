package test;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.TooManyListenersException;

import gnu.io.CommPort;
import gnu.io.CommPortIdentifier;
import gnu.io.NoSuchPortException;
import gnu.io.PortInUseException;
import gnu.io.SerialPort;
import gnu.io.UnsupportedCommOperationException;

public class SerialClient {
	SerialListener listener;
	OutputStream out;
	String msg;
	
	AndroidClient androidClient;
	
	public SerialClient() {
		connect("COM5");
	}
	public void connect(String portName) {
		try {
			CommPortIdentifier commPortIdentifier = CommPortIdentifier.getPortIdentifier(portName);
			if(commPortIdentifier.isCurrentlyOwned()) {
				System.out.println("포트사용 불가");
			}else {
				System.out.println("포트사용 가능");
					CommPort commPort = commPortIdentifier.open("basic_serial",5000);
					if(commPort instanceof SerialPort) {
						System.out.println("SerialPort");
						SerialPort serialPort = (SerialPort)commPort;
						serialPort.setSerialPortParams(9600,
														SerialPort.DATABITS_8,
														SerialPort.STOPBITS_1,
														SerialPort.PARITY_NONE);
						InputStream in = serialPort.getInputStream();
						out = serialPort.getOutputStream();
						listener = new SerialListener(in);
						
						try {
							serialPort.addEventListener(listener);
						} catch (TooManyListenersException e) {
							e.printStackTrace();
						}
						serialPort.notifyOnDataAvailable(true);
						new ReceiveThread().start();
					}else {
						System.out.println("SerialPort만 작업할 수 있습니다.");
					}
			}
		} catch (NoSuchPortException e) {
			e.printStackTrace();
		} catch (PortInUseException e) {
			e.printStackTrace();
		} catch (UnsupportedCommOperationException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	public void setAndoridClient(AndroidClient client) {
		this.androidClient = client;
	}
	
	public void sendMessageToArduino(char data) {
		new Thread(new Runnable() {
			@Override
			public void run() {
				try {
					out.write(data);
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		}).start();
	}
	
	class ReceiveThread extends Thread {
		@Override
		public void run() {
			while(true) {
				if(listener.getStatus()) {
					msg = listener.getDto().getMsg();
				} else {
					msg = "";
				}
				System.out.println("현재 받은 메시지: " + msg);
				androidClient.sendMessage(msg);
				try {
					Thread.sleep(1000);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}
	}
}
