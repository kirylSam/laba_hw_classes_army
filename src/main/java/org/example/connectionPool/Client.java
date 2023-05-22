package org.example.connectionPool;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Client implements Runnable {
    //implements Runnable = can be run() in Threads
    private int clientID;
    private ConnectionPool connectionPool;

    public Client(int clientID, ConnectionPool connectionPool) {
        this.clientID = clientID;
        this.connectionPool = connectionPool;
    }

    public int getID() {
        return this.clientID;
    }

    @Override
    public void run() {
        Logger logger = LogManager.getLogger("org.example.connectionPool.Client");
        Connection connection = connectionPool.getConnection();
        if (connection != null) {
            logger.info("[Client] Acquired the connection: " + this.clientID);
            connection.doSomethingWithDB(this);
            connectionPool.releaseConnection(connection);
            logger.info("[Client] Released the connection: " + this.clientID);
        } else {
            logger.error("[Client] The connection is null");
        }
    }
}
