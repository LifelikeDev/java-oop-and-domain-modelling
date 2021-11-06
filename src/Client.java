public abstract class Client {

    private String name;
    private String id;
    private ServiceLevel serviceLevel;

    // constructor
    public Client(String name, String id, ServiceLevel serviceLevel) {
        this.name = name;
        this.id = id;
        this.serviceLevel = serviceLevel;
    }

    // overloaded constructor
    public Client(String id, ServiceLevel serviceLevel) {
        this.id = id;
        this.serviceLevel = serviceLevel;
    }

}
