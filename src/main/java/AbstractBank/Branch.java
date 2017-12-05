package AbstractBank;

public enum Branch {
    LA("Basic"), BOSTON("Loan"), MUMBAI("Full");
    String serviceLevel;

    Branch(String serviceLevel) {
        this.serviceLevel = serviceLevel;
    }

    public String getServiceLevel() {
        return serviceLevel;
    }
}
