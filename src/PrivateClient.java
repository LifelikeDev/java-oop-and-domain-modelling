public class PrivateClient extends Client {
    public PrivateClient(String name, String id, ServiceLevel serviceLevel) {
        super(name, id, serviceLevel);
    }

    public PrivateClient(String id, ServiceLevel serviceLevel) {
        super(id, serviceLevel);
    }
}
