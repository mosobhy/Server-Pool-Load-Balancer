import java.net.http.HttpRequest;
public class LoadBalancerFacade {
    private IObservable serversList;
    private HttpRequest request;

    public LoadBalancerFacade( IObservable serversList, HttpRequest request ) {
        this.serversList = serversList;
        this.request = request;
    }

    public JSONlLikeObject handleRequest() {
        // here delegate the request to serversList Object to handle it

        return new JSONlLikeObject(); // to be removed
    }
}
