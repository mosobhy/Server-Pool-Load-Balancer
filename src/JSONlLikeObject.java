import java.util.Hashtable;

public class JSONlLikeObject {
    private Hashtable<String, String> jsonObject;

    public JSONlLikeObject() {
        this.jsonObject = new Hashtable<String, String>();
    }

    public Hashtable<String, String> getObject() {
        // this will return the object as hash table type
        return this.jsonObject;
    }

    public void addPair( String key, String value ) {
        this.jsonObject.put(key, value);
    }

    public String getValue( String key ) {
        return this.jsonObject.get(key);
    }

    public void changeValue( String key, String newValue ) {
        this.jsonObject.put( key, newValue );
    }

    public void printObject() {
        System.out.println(this.jsonObject);
    }
}
