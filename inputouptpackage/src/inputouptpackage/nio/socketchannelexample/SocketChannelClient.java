package inputouptpackage.nio.socketchannelexample;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.net.InetSocketAddress;
import java.nio.ByteBuffer;
import java.nio.channels.SocketChannel;

public class SocketChannelClient {
	public static void main(String[] args) {
		String serverName = "localhost";
		int port = 8080;
		try(SocketChannel client = SocketChannel.open();
			ByteArrayOutputStream byteArray = 
					new ByteArrayOutputStream();
			ObjectOutputStream objectOut = 
					new ObjectOutputStream(byteArray);
			){
			client.connect(new InetSocketAddress(serverName, port));
			Employee employee = new Employee(2l, "PQR");
			objectOut.writeObject(employee);
			objectOut.flush();
			ByteBuffer buffer = 
					ByteBuffer.wrap(byteArray.toByteArray());
			client.write(buffer);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
