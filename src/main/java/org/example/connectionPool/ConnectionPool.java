package org.example.connectionPool;

import java.util.concurrent.Semaphore;

public class ConnectionPool {
    private Connection[] connections;
    private boolean[] isConnectionUsed;

    private int maxConnections;
    //semaphore controls access to a shared pool of resources
    private Semaphore semaphore;

    public ConnectionPool(int maxConnections) {
        this.maxConnections = maxConnections;
        this.semaphore = new Semaphore(maxConnections);
        this.connections = new Connection[maxConnections];
        this.isConnectionUsed = new boolean[maxConnections];
    }

    public Connection getConnection() {
        try {
            semaphore.acquire();
            //Only one thread at a time can access the below = Thread-safe
            synchronized (this) {
                //we iterate through our connections
                for (int i = 0; i < maxConnections; i++) {
                    //if the connection is not used
                    if (!isConnectionUsed[i]) {
                        //then we mark it as used
                        isConnectionUsed[i] = true;
                        if (connections[i] == null) {
                            //if connection[i] is empty - then we lazy initialize it
                            connections[i] = new Connection();
                        }
                        //return the connection
                        return connections[i];
                    }
                }
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        //if no unused connection was find in the array - we return null
        return null;
    }

    public void releaseConnection(Connection connection) {
        synchronized (this) {
            for(int i = 0; i < maxConnections; i++) {
                if(connections[i] == connection) {
                    isConnectionUsed[i] = false;
                    semaphore.release();
                    //we've found our connection
                    break;
                }
            }
        }
    }
}
