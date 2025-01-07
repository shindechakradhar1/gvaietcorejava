package batchpractices;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.net.InetSocketAddress;
import java.nio.ByteBuffer;
import java.nio.channels.ServerSocketChannel;
import java.nio.channels.SocketChannel;

public class SocketChannelServer {
	public static void main(String[] args) {
		int port=8989;
		try(ServerSocketChannel server = ServerSocketChannel.open();){
			server.bind(new InetSocketAddress(port));
			System.out.println("Server Opened At:" + port);
			while(true) {
				try(SocketChannel client = server.accept()){
					System.out.println("Client connected at: " + client.getRemoteAddress());
					ByteBuffer buffer = ByteBuffer.allocate(990);
					int byteVal=client.read(buffer);
					if(byteVal!=-1) {
						buffer.flip();
						byte[] byteArray = new byte[buffer.remaining()];
						buffer.get(byteArray);
						try(ObjectInputStream ois = new ObjectInputStream(new ByteArrayInputStream(byteArray))){
							Student student=(Student)ois.readObject();
							System.out.println(student);
						} catch (ClassNotFoundException e) {
							e.printStackTrace();
						}
					}
				}
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}