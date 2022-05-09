package echo01;

import java.io.IOException;
import java.net.InetSocketAddress;
import java.net.ServerSocket;
import java.net.Socket;
 
public class Server {
	
	
	public static void main(String[] args) throws IOException {
		
		ServerSocket serverSocket = new ServerSocket();
		serverSocket.bind(new InetSocketAddress("119.195.181.210", 10001));	
		
		System.out.println("<서버시작>");
		System.out.println("============================================");
		System.out.println("[연결을 기다리고 있습니다.]");
		
		
		////반복 시작/////////////////////////////////////////////////////////////
		
		
		while(true) {
			
			Socket socket = serverSocket.accept();	
			
			//쓰레드 - 출장보내기(나가서 스트림 보강하고 대화해라)
			Thread thread = new ServerThread(socket);	//???????????
			thread.start();
			
		}
		
		
		////반복 종료/////////////////////////////////////////////////////////////
		
		
	}
}
