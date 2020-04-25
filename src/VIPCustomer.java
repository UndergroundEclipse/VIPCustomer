public class VIPCustomer {

    private String Name;
    private double creditLimit;
    private String emailAddress;

    public VIPCustomer() {
        this("Default name", 50000.0, "default@MorganCorps");
    }

    public VIPCustomer(String Name, double creditLimit) {
        this(Name,creditLimit, "unknown@MorganCorps");
    }

    public VIPCustomer(String Name, double creditLimit, String emailAddress){
        this.Name = Name;
        this.creditLimit = creditLimit;
        this.emailAddress = emailAddress;

    }

    public String getName() {
        return Name;
    }

    public double getCreditLimit() {
        return creditLimit;
    }

    public String getEmailAddress() {
        return emailAddress;
    }
}
