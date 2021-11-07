public class CorporateClient extends Client {
    private AccountManager accountManager;

    public CorporateClient(String id, ServiceLevel serviceLevel, AccountManager accountManager) {
        super(id, serviceLevel);
        this.accountManager = accountManager;
    }

    @Override
    public String getClientName() {
        return this.accountManager.getName();
    }

}
