import java.net.http.HttpRequest;
import java.util.ArrayList;

public class ServersList implements IObservable {
    private ArrayList<Integer> portsOfAliveServers;
    private IObserver serversHashTable;

    public ServersList() {
        // initialize a random number of servers

    }

    private Double hashRequest( HttpRequest request ) {
        // here to hash the request according to
        // the consistent hashing algorithm

        return 1.12;
    }

    public JSONlLikeObject handleRequest( HttpRequest request) {
        // direct the request to the that port and return
        // back the JSON

        return new JSONlLikeObject(); // to be removed
    }

    private ArrayList<Integer> checkAliveServers() {
        // check the servers lives periodically

        return new ArrayList<>(); // to be removed
    }

    private Integer getClosestServer( HttpRequest request ) {
        // find the closest server to that request hash

        return 123; // to be removed
    }

    public void notify_() {
        // notify the servers hash table of the alive servers
        // arr = this.checkServerslives();
        // this.serversHashTable.update(arr);
    }
}
