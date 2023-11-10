import java.util.Scanner;

public class BankAccount {
    private String accountNumber;
    private double balance;
    private String customerName;
    private String customerEmail;
    private String customerPhone;

    // Constructor
    public BankAccount(String accountNumber, double balance, String customerName, String customerEmail, String customerPhone) {
        this.accountNumber = accountNumber;
        this.balance = balance;
        this.customerName = customerName;
        this.customerEmail = customerEmail;
        this.customerPhone = customerPhone;
    }

    // Getter and Setter for accountNumber
    public String getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    // Getter and Setter for balance
    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    // Getter and Setter for customerName
    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    // Getter and Setter for customerEmail
    public String getCustomerEmail() {
        return customerEmail;
    }

    public void setCustomerEmail(String customerEmail) {
        this.customerEmail = customerEmail;
    }

    // Getter and Setter for customerPhone
    public String getCustomerPhone() {
        return customerPhone;
    }

    public void setCustomerPhone(String customerPhone) {
        this.customerPhone = customerPhone;
    }

    // Method to deposit
    public void deposit(double amount) {
        this.balance += amount;
        System.out.println("Deposit dengan nominal $" + amount + " telah sukses. Rekening Anda sekarang: $" + this.balance);
    }

    // Method to withdraw
    public void withdraw(double amount) {
        if (amount <= 0) {
            System.out.println("Terimakasih sudah berkunjung, sampai jumpa kembali");
        } else if (amount <= this.balance) {
            this.balance -= amount;
            System.out.println("Penarikan dengan nominal $" + amount + " telah sukses. Rekening Anda sekarang: $" + this.balance);
        } else {
            System.out.println("Saldo tidak mencukupi");
        }
    }

    // Method to input nominal deposit
    public static double inputDeposit() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Masukkan jumlah nominal deposit Anda: $");
        return scanner.nextDouble();
    }

    // Method to input nominal withdraw
    public static double inputWithdraw() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Masukkan jumlah nominal penarikkan Anda: $");
        return scanner.nextDouble();
    }
}
