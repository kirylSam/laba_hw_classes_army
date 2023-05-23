package org.example.connectionPool;

import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

public class SimulateCollectionPoolUsageExecutorService {

    public void startSimulation() {
        int maxConnections = 5;
        int numberOfClients = 7;

        ConnectionPool connectionPool = new ConnectionPool(maxConnections);
        ExecutorService executorService = Executors.newFixedThreadPool(maxConnections);
        for (int i = 0; i < numberOfClients; i++) {
            Client client = new Client(i + 1, connectionPool);
            executorService.execute(client);
        }

        //Gracefully shutting down the executor
        executorService.shutdown();
        try {
            executorService.awaitTermination(Long.MAX_VALUE, TimeUnit.NANOSECONDS);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

    }
}
