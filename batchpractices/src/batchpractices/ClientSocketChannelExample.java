package batchpractices;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.net.InetSocketAddress;
import java.nio.ByteBuffer;
import java.nio.channels.SocketChannel;

public class ClientSocketChannelExample {
	public static void main(String[] args) {
		int port=8989;
		String host="localhost";
		try(
				SocketChannel client = SocketChannel.open();
				ByteArrayOutputStream baos = new ByteArrayOutputStream();
				ObjectOutputStream oos = new ObjectOutputStream(baos);
			){
			client.connect(new InetSocketAddress(host,port));
			Student student = new Student(123, "Mansi");
			oos.writeObject(student);
			oos.flush();
			ByteBuffer buffer = ByteBuffer.wrap(baos.toByteArray());
			client.write(buffer);
			
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}