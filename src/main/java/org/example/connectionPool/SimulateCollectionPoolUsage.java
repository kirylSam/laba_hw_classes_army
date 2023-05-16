package org.example.connectionPool;

public class SimulateCollectionPoolUsage {

    public void startSimulation() {
       int maxConnections = 2;
       int numberOfClients = 10;

       ConnectionPool connectionPool = new ConnectionPool(maxConnections);

       //let's create numberOfClients amount of threads
       for (int i = 0; i < numberOfClients; i++) {
           //We'll create a new client
           Client client = new Client(i + 1, connectionPool);
           //simulating multiple users - when each thread is started then
           //the client's run() method is called
           new Thread(client).start();
       }
   }
}
