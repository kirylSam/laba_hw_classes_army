package org.example.connectionPool;

import java.util.concurrent.CompletableFuture;

public class SimulateCollectionPoolUsageCompletableFuture {

    public void startSimulation() {
        int maxConnections = 5;
        int numberOfClients = 7;

        ConnectionPool connectionPool = new ConnectionPool(maxConnections);

        CompletableFuture<?>[] clientFutures = new CompletableFuture[numberOfClients];

        for (int i = 0; i < numberOfClients; i++) {
            Client client = new Client(i + 1, connectionPool);
            clientFutures[i] = CompletableFuture.runAsync(client);
        }

        //wait for all the futures to finish their work
        CompletableFuture.allOf(clientFutures).join();
    }
}
