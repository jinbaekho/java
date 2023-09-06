package com.acorn2;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

public class Server {
	
	public Server() throws IOException {
		ServerSocket serverSocket = new ServerSocket(10001);
		System.out.println("서버 : 10001포트가 오픈");
		
		Socket socket = serverSocket.accept();
		System.out.println("서버: 클라이언트:"+socket.getInetAddress()+"연결됨.");
		
		
	}
	
	public static void main(String[] args) {
		try {
			new Server();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}