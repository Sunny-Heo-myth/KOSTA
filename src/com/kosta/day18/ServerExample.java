package com.kosta.day18;

import java.io.IOException;
import java.net.InetSocketAddress;
import java.net.ServerSocket;
import java.net.Socket;

public class ServerExample {

	public static void main(String[] args) {
		ServerSocket serverSocket = null;
		Socket socket = null;
		
		try {
			serverSocket = new ServerSocket(5001);
			while(true) {
				System.out.println("waiting for connect with client...");
				socket = serverSocket.accept();
				InetSocketAddress ia = (InetSocketAddress)socket.getRemoteSocketAddress();
				System.out.println(ia.getHostName() + "connect accepted.");
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			try {
				if(serverSocket.isClosed()) serverSocket.close();
			} catch (IOException e) {
				
			}
		}

	}


}
