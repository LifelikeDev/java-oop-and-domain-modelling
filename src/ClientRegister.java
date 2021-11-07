import java.util.ArrayList;
import java.util.List;

public class ClientRegister {
    private List<Client> corporateClients = new ArrayList<>();
    private List<Client> privateClients = new ArrayList<>();

    public ClientRegister(List<Client> corporateClients, List<Client> privateClients) {
        this.corporateClients = corporateClients;
        this.privateClients = privateClients;
    }
}
