public class Main {
    public static void main(String[] args) {
        VIPCustomer Morgan = new VIPCustomer();
        System.out.println(Morgan.getName());

        VIPCustomer Adam = new VIPCustomer("Adam", 50000);
        System.out.println(Adam.getName());


        VIPCustomer newAccount = new VIPCustomer("Tim",100.00,"Tim@MorganCorps");
        System.out.println(newAccount.getName() + ", your emailaddres: " + newAccount.getEmailAddress());

    }
}
