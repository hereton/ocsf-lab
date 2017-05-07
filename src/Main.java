

import java.io.IOException;
import java.util.Scanner;

/**
 * try to connect to demoserver.jar
 * 
 * @author Totsapon Menkul.
 *
 */
public class Main {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		Client client = new Client("10.2.12.83", 5001);
		try {
			client.openConnection();
			client.sendToServer("Login Ton");
			String ans = "";
			while (!ans.equalsIgnoreCase("quit")) {
				ans = scanner.next();
				client.sendToServer(ans);
			}
			client.closeConnection();
			scanner.close();
		} catch (IOException e) {
			scanner.close();
			throw new RuntimeException();
		}

	}
}
