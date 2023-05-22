package org.example.connectionPool;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Connection {
    public void doSomethingWithDB(Client client) {
        Logger logger = LogManager.getLogger("org.example.connectionPool.Connection");
        logger.info("[Connection] Is used by the client with ID: " + client.getID());
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
