import java.util.Hashtable;
import java.util.ArrayList;

public class ServersHashTable implements IObserver {
    private Hashtable<Double, Integer> serversMap;

    public ServersHashTable() {
        this.serversMap = new Hashtable<Double, Integer>();
    }

    private Hashtable<Double, Integer> getServersMap() {
        return this.serversMap;
    }

    private void buildServersCluster() {
        // here to implement the consistent hashing algorihtm

    }

    public void update( ArrayList<Integer> aliveServers ) {
        // here to be implemented
        // this will be invoked from the ServersList Class with the list of alive servers
        // this should update the serversMap attr
    }
}
