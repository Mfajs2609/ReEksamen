package UDP;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;

public class UDP_Server {

    public static void main(String[] args) throws Exception {
        String sendSentence;
        String receiveSentence;
        int receiveSize;
        boolean go_on = true;

        BufferedReader inFromUser = new BufferedReader(new InputStreamReader(System.in));

        DatagramSocket receivingSocket = new DatagramSocket(6710);
        DatagramSocket sendingSocket = new DatagramSocket();

        InetAddress IPAddress = InetAddress.getByName("10.111.176.254");

        byte[] data = new byte[1024];

        while (go_on) {

            DatagramPacket receivePacket = new DatagramPacket(data, data.length,IPAddress, 6710);

            receivingSocket.receive(receivePacket);
            receiveSentence = new String(receivePacket.getData());

            receiveSize = receivePacket.getLength();

            System.out.println("FROM SERVER size: " + receiveSize);
            System.out.println("FROM SERVER: " + receiveSentence);
            System.out.println("Please type you message: ");

            sendSentence = inFromUser.readLine();

            byte[] sendData = sendSentence.getBytes();

            DatagramPacket sendPacket = new DatagramPacket(sendData, sendData.length, IPAddress, 6701);
            sendingSocket.send(sendPacket);
            data = new byte[1024];

            if (sendSentence.equals("quit")) go_on = false;

        }
    }
}
