package lib.net.tcpServer;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.Socket;

public class ServerReceiver extends Thread{
	
	private String hostName; 
	private Socket socket;
	private DataInputStream in;
	private DataOutputStream out;
	
	public ServerReceiver(Socket socket){

		this.hostName = socket.getInetAddress().getHostName();
		this.socket = socket;
		try{
			in = new DataInputStream(socket.getInputStream());
			out  = new DataOutputStream(socket.getOutputStream());
		}catch(IOException e){}
	}
	
	public void run(){
		try{
			/*read input Stream*/ 
			String InputMsg = in.readUTF();
			System.out.println("receive message from "+ this.hostName + ": " + InputMsg);
			
			/*processing command*/ 
			//Command();
			
			while(in != null)
				out.writeUTF(in.readUTF());
			
		}catch(IOException e){
			System.out.println("IOException occured in ServerReciever.run()");
		}
	}

}
