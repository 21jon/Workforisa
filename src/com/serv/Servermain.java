package com.serv;

import java.io.IOException;
import java.lang.reflect.Array;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.ArrayList;

public class Servermain extends Thread {

    ServerSocket serverSocket = null;
    ArrayList<ClientHandler> clients = new ArrayList<ClientHandler>();

    @Override
    public void run() {
        try {
            serv();
        } catch (Exception e) {
            System.out.println("Ohoh, da ist ein Fehler, das ist nicht gut. :-<");
        }
    }

    public void serv() throws IOException {
        serverSocket = new ServerSocket();

        while (true) {

            System.out.println("Server is waiting for connection");
            Socket s = serverSocket.accept();
            ClientHandler handler = new ClientHandler(this, s);
            handler.run();
            System.out.println(s.getInetAddress() + " : Client socket accepted");

        }

    }

    public ArrayList<ClientHandler> getClients() {
        return clients;
    }

    public void setClients(ArrayList<ClientHandler> clients) {
        this.clients = clients;
    }

}
