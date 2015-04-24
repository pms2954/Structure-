package lib.net.tcpClient;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.Socket;

public class ClientReceiver extends Thread {
	Socket socket;
	DataInputStream in;
	
	ClientReceiver(Socket socket){
		this.socket = socket;
		try{
			in = new DataInputStream(socket.getInputStream());
		}catch(IOException e ){}
	}
	
	public void run(){
		while(in != null){
			try{
				System.out.println(in.readUTF());
			}catch(IOException e){}
		}
	}

}
