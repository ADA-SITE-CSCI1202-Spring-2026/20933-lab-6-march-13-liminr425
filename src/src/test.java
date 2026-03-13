public class test {
    public static void test(String[] args) {
        try {
            Account a = new Account(1001, "Liaman", 1200.50);
            System.out.println(a);

            a.deposit(300);
            System.out.println("After deposit: " + a.getBal());

            a.withdraw(500);
            System.out.println("After withdrawal: " + a.getBal());

            System.out.println("\nTrying bad withdraw:");
            a.withdraw(2000);

        } catch (InvalidAmtEx e) {
            System.out.println("Error: " + e.getMessage());
        }

        System.out.println("Program continues...");
    }
}