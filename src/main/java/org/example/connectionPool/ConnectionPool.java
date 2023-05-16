package org.example.connectionPool;

import java.util.concurrent.Semaphore;

public class ConnectionPool {
    private int maxConnections;
    //semaphore controls access to a shared pool of resources
    private Semaphore semaphore;

    public ConnectionPool(int maxConnections) {
        this.maxConnections = maxConnections;
        this.semaphore = new Semaphore(maxConnections);
    }

    public void getConnection(Client client) throws InterruptedException {
        //let's try to get a connection from the pool
        semaphore.acquire();
        System.out.println("The client " + client.getID() + " acquired a connection from the pool.");

        //client is doing something in the db
        Thread.sleep(2000);

        //release the connection
        semaphore.release();
        System.out.println("The client " + client.getID() + " released a connection from the pool.");
    }
}
