package org.example.connectionPool;

public class Client implements Runnable{
    //implements Runnable = can be run() in Threads
    private int clientID;
    private ConnectionPool connectionPool;

    public Client(int clientID, ConnectionPool connectionPool){
        this.clientID = clientID;
        this.connectionPool = connectionPool;
    }

    public int getID() {
        return this.clientID;
    }

    @Override
    public void run() {
        //each client has only one task to try and get a connection from the pool
        try {
            connectionPool.getConnection(this);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
