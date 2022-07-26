import java.net.http.HttpRequest;

public interface IObservable {
    public JSONlLikeObject handleRequest(HttpRequest req);
    public void notify_();
}
