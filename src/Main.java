public class Main {
    public static void main(String[] args) {
        Account account = new Account("Mariia M", 788, "6632819323323");

        try {
            account.transfer(800);
        } catch (FundsException e) {
            System.out.println("Transfer failed: " + e.getMessage());
        } catch (Exception e) {
            System.out.println("An unexpected error occurred: " + e.getMessage());
        } finally {
            System.out.println("Current account balance: " + account.getBalance());
        }
    }
}
