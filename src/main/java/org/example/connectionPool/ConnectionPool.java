package org.example.connectionPool;

import java.util.concurrent.Semaphore;

public class ConnectionPool {
    private Connection[] connections;
    private boolean[] isConnectionUsed;

    private int maxConnections;
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
            synchronized (this) {
                for (int i = 0; i < maxConnections; i++) {
                    if (!isConnectionUsed[i]) {
                        isConnectionUsed[i] = true;
                        if (connections[i] == null) {
                            connections[i] = new Connection();
                        }
                        return connections[i];
                    }
                }
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        return null;
    }

    public void releaseConnection(Connection connection) {
        synchronized (this) {
            for(int i = 0; i < maxConnections; i++) {
                if(connections[i] == connection) {
                    isConnectionUsed[i] = false;
                    semaphore.release();
                    break;
                }
            }
        }
    }
}
