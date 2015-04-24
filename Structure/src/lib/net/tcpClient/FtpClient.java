package lib.net.tcpClient;

import java.io.IOException;
import java.net.Socket;
import java.rmi.ConnectException;

public class FtpClient {
	
	private static final String SERVERIP= "127.0.0.1";
	private static final int PORT= 7777;

	
	public static void main(String[] argv){
		try{
			
			Socket socket = new Socket(SERVERIP , PORT);
			new ClientSender(socket, argv[0]).start();
			new ClientReceiver(socket).start();
			
		}catch(ConnectException ce){
			ce.printStackTrace();
		}
		catch(IOException e){
			e.printStackTrace();
		}
	}
}
