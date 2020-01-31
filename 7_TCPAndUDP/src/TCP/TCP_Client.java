package TCP;

import java.io.BufferedReader;
import java.io.DataOutputStream;
import java.io.InputStreamReader;
import java.net.Socket;

public class TCP_Client {

    public static void main(String[] args) throws Exception {

        System.out.println("starting TCPClient main");
        String sentence;
        boolean go_on = true;

        BufferedReader inFromUser = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("trying to connect");
        Socket clientSocket = new Socket("127.0.0.1", 5656);
        System.out.println("we are connected");

        DataOutputStream outToServer = new DataOutputStream(clientSocket.getOutputStream());
        BufferedReader inFromServer = new BufferedReader(new InputStreamReader(clientSocket.getInputStream()));

        while (go_on) {
            System.out.print("Please type your text: ");
            sentence = inFromUser.readLine();
            outToServer.writeBytes(sentence + '\n');

            sentence = inFromServer.readLine();
            System.out.println("FROM SERVER: " + sentence);
            if (sentence.equals("quit")) go_on = false;
        }

        clientSocket.close();

    }

}
