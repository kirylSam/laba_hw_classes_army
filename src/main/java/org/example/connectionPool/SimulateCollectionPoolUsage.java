package org.example.connectionPool;

public class SimulateCollectionPoolUsage {

    public void startSimulation() {
       int maxConnections = 2;
       int numberOfClients = 5;

       ConnectionPool connectionPool = new ConnectionPool(maxConnections);

       for (int i = 0; i < numberOfClients; i++) {
           Client client = new Client(i + 1, connectionPool);
           new Thread(client).start();
       }
   }
}
