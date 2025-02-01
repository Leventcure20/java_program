public class BankAccount {
    
    private int accountNumber;
    private String accountHolderName;       
    private double balance;
    
    
    public BankAccount(int number, String name, double newBalance) {
            accountNumber = number;
            accountHolderName = name;
            balance = newBalance;
        }

    public void setAccountNumber(int number) {
        accountNumber = number;
    }

    public void setHolderName(String name) {
        accountHolderName = name;
    }

    public void setBalance(double newBalance) {
        balance = newBalance;
    }

    public void depositMoney(double amount) {
            balance = balance + amount;
        }

    public void withdrawMoney(double amount) {
        if (amount > balance) {
            System.out.println("Insufficient balance!");
        } else {
            System.out.println("Your account balance before transaction " + balance);
            balance = balance - amount;
            System.out.println("Your account balance after transaction " + balance);
        }
    }
    public void displayAccountInfo() {
        System.out.println("Hi " + accountHolderName + "!");
        System.out.println("Your account number is " + accountNumber + " and your balance is " + balance);
    }
}