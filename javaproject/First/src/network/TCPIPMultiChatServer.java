package network;

import java.awt.RenderingHints.Key;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

public class TCPIPMultiChatServer {
	//접속 사용자 정보를  저장: 메시지를 전체에게 보내기 위해서 
	//저장 정보: name,OutputStream
	//Map<String,Object>
	HashMap<String,Object> clients;
	
	public TCPIPMultiChatServer() {
		clients=new HashMap<String, Object>();
		Collections.synchronizedMap(clients);//쓰래드 동가화에 안전하게 사용 하도록 해주는 메서드
	}
	
	
	public static void main(String[] args) throws IOException {
	
		new TCPIPMultiChatServer().start();
		
	}
	public void start() throws IOException {
	   
		//ServerSocket 실행 
		//사용자의 요청이 있으면 Socket 생성해서 
		//연결 -> clients 사용자 정보를 저장 쓰래드로 처리 
		
		ServerSocket serverSocket=new ServerSocket(7777);
		System.out.println("Chatting Server Start......!!!!!");
		
	Socket socket=null;
	
	while(true) {
		// 요청이 들어올 때 까지 대기... 요청이 들어오면 새로운 Socket 생성해서 반환 
		socket=serverSocket.accept();
		//map에 정보 저장, 접속한 사용자들에게 메시지를 전송 
		
		System.out.println("["+socket.getInetAddress()+":"+socket.getPort()+"]사용자 접속 ");
	//	ServerReceiver receiver=new ServerReceiver(socket);
	//	receiver.start();
	}
	}
	
	void sendToAll(String msg) {
		//일괄 처리,Map은 순서없다-> Map Key->Set
		Set<String> keys=clients.keySet();
		Iterator<String> itr =keys.iterator();
		
		while (itr.hasNext()) {
			DataOutputStream out=(DataOutputStream) clients.get(itr.next());
		try {
			out.writeUTF(msg);
		} catch (IOException e) {
		
			e.printStackTrace();
		}
			
		}
	}


//내부 클래스 : e데이터 받아서 저장,메시지 전체 발송 
private class ServerReceiver extends Thread{
	//Socket,InputStream,OutPutStream
Socket socket;
DataOutputStream out;
DataInputStream in;
public ServerReceiver(Socket socket, DataOutputStream out, DataInputStream in) {

	this.socket = socket;
try {
	in= new DataInputStream(socket.getInputStream());
} catch (IOException e) {
	// TODO Auto-generated catch block
	e.printStackTrace();
}
try {
	out=new DataOutputStream(socket.getOutputStream());
} catch (IOException e) {
	// TODO Auto-generated catch block
	e.printStackTrace();
}
	
}
@Override
public void run() {

String name=null;// 접속함 사용자의 이름 

try {
	name=in.readUTF();
	clients.put(name,out);//map에 사용자 정보저장
	sendToAll(">>>>>>>>>>>>>>>>"+name+"님이 접속하셨습니다");//내부클래스에서는 아웃터 클래스
	
	while(in!=null) {
		sendToAll(in.readUTF());
	}
} catch (IOException e) {
	// TODO Auto-generated catch block
	e.printStackTrace();
} finally{
 clients.remove(name);
	System.out.println("님이 나가셨습니다");
	//이름을 스트림을 통해 받는다.
}

}


}	
}
