package UDP;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;


public class UDP_Client {

    public static void main(String[] args) throws Exception {
        String sendSentence;
        String receiveSentence;
        boolean go_on = true;

        BufferedReader inFromUser = new BufferedReader(new InputStreamReader(System.in));
        DatagramSocket receivingSocket = new DatagramSocket(6701);
        DatagramSocket sendingSocket = new DatagramSocket();
        InetAddress IPAddress = InetAddress.getByName("10.111.176.254");
        byte[] data;


        while (go_on) {

            System.out.println("Please type you message: ");
            sendSentence = inFromUser.readLine();
            data = sendSentence.getBytes();
            DatagramPacket sendPacket = new DatagramPacket(data, sendSentence.length(), IPAddress, 6710);
            sendingSocket.send(sendPacket);
            data = new byte[1024];

            DatagramPacket receivePacket = new DatagramPacket(data, data.length, IPAddress, 6701);
            receivingSocket.receive(receivePacket);
            receiveSentence = new String(receivePacket.getData());
            int size = receivePacket.getLength();
            System.out.println("FROM SERVER size:" + size);
            System.out.println("FROM SERVER:" + receiveSentence);

            if (sendSentence.equals("quit")) go_on = false;
        }
    }
}
