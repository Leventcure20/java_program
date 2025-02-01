public class Main {
    public static void main(String[] args) {
        BankAccount myAccount = new BankAccount(1500, "Levent Cure", 3458.50);
        myAccount.depositMoney(15000);
        myAccount.displayAccountInfo();
    }
}