

import com.lloseng.ocsf.client.AbstractClient;

/**
 * Client class that will using to connect to server.
 * 
 * @author Totsapon Menkul.
 *
 */
public class Client extends AbstractClient {

	/**
	 * create an object connect by input server and port.
	 * @param host is an IP address.
	 * @param port is a server port.
	 */
	public Client(String host, int port) {
		super(host, port);
	}

	
	@Override
	protected void handleMessageFromServer(Object msg) {
		System.out.println(msg);
	}

	protected void connectionClosed() {
		System.out.println("Closing na jub jub");
	}

	protected void connectionEstablished() {
		System.out.printf("You are connecting: %s on PORT: %d\n", this.getHost(), this.getPort());
	}

}
