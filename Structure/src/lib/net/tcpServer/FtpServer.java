package lib.net.tcpServer;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

public class FtpServer{
	
	private final int PORT = 7777;
	private ServerSocket ftpSocket;
	
	public static void main(String[] argv){
		new FtpServer().start();
	}
	
	public FtpServer(){
		try{
			ftpSocket = new ServerSocket(PORT);
			System.out.println(" Start Server ");
		}catch(IOException e){
			e.printStackTrace();
		}
	}
	
	public void start(){
		try{
			while(true){
				Socket socket = ftpSocket.accept();
				ServerReceiver thread = new ServerReceiver(socket);
				thread.start();
			}
		}catch(IOException e){
			e.printStackTrace();
		}
	}
	

}
