package TCP;

import java.io.BufferedReader;
import java.io.DataOutputStream;
import java.io.InputStreamReader;
import java.net.ServerSocket;
import java.net.Socket;

public class TCP_Server {

    public static void main(String[] args) throws Exception {

        boolean go_on = true;

        System.out.println("Starting TCP Server main program");
        String sentence;
        String userText;

        ServerSocket welcomeSocket = new ServerSocket(5656);
        System.out.println("we have a socket");
        BufferedReader inFromUser = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("Waiting for a connection");
        Socket connectionSocket = welcomeSocket.accept();
        BufferedReader inFromClient = new BufferedReader(new InputStreamReader(connectionSocket.getInputStream()));
        DataOutputStream outToClient = new DataOutputStream(connectionSocket.getOutputStream());
        sentence = inFromClient.readLine();
        System.out.println("FROM CLIENT: " + sentence);

        while (go_on) {

            System.out.print("Please type your text here: ");
            userText = inFromUser.readLine();
            outToClient.writeBytes(userText + '\n');

            sentence = inFromClient.readLine();
            System.out.println("FROM CLIENT: " + sentence);
            if (userText.equals("quit")) go_on = false;

        }

        connectionSocket.close();
        welcomeSocket.close();

    }

}

