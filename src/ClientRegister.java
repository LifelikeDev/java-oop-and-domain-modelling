import java.util.ArrayList;
import java.util.List;

public class ClientRegister {
    private List<Client> corporateClients;
    private List<Client> privateClients;

    public ClientRegister(List<Client> corporateClients, List<Client> privateClients) {
        this.corporateClients = corporateClients;
        this.privateClients = privateClients;
    }

    public List<Client> getCorporateClients() {
        return this.corporateClients;
    }

    public List<Client> getPrivateClients() {
        return this.privateClients;
    }

}
