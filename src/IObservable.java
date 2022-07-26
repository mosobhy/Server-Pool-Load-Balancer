import org.json.simple.JSONObject;
import java.net.http.HttpRequest;

public interface IObservable {
    public JSONObject handleRequest(HttpRequest req);
    public void notify_();
}
