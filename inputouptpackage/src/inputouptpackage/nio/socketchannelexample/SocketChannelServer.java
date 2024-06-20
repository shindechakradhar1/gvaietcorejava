package inputouptpackage.nio.socketchannelexample;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.net.InetSocketAddress;
import java.nio.ByteBuffer;
import java.nio.channels.ServerSocketChannel;
import java.nio.channels.SocketChannel;

public class SocketChannelServer {
	public static void main(String[] args) {
		int port = 8080;
		try (ServerSocketChannel serverChannel = ServerSocketChannel.open()) {
			serverChannel.bind(new InetSocketAddress(port));
			System.out.println("Server Started At:" + port);
			while (true) {
				try (SocketChannel clientChannel = serverChannel.accept();) {
					System.out.println("Server Connected to:" + clientChannel.getRemoteAddress());
					ByteBuffer buffer = ByteBuffer.allocate(1024);
					int byteLength = clientChannel.read(buffer);
					if (byteLength != -1) {
						buffer.flip(); // flipped for reading buffer
						byte[] recievedData = new byte[buffer.remaining()];
						buffer.get(recievedData); // get data from buffer to byte Array
						try (ByteArrayInputStream byteArray = new ByteArrayInputStream(recievedData);
								ObjectInputStream objectInput = new ObjectInputStream(byteArray);) {
							Employee emp = (Employee) objectInput.readObject();
							System.out.println("Recieved On server:" + emp);
						} catch (ClassNotFoundException e) {
							// TODO Auto-generated catch block
							e.printStackTrace();
						}
					}
				}
			}

		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
