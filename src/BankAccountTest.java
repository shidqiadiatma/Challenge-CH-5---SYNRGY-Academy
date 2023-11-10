public class BankAccountTest {
    public static void main(String[] args) {
        // Create BankAccount object
        BankAccount myAccount = new BankAccount("880124321", 1000.0, "Lord Shidqi Adiatma", "shidqi.adiatma@lord.com", "+62-1366-3213-56");

        // Display initial account information
        System.out.println("Informasi Akun Nasabah:");
        displayAccountInfo(myAccount);

        // Deposit
        double depositAmount = BankAccount.inputDeposit();
        myAccount.deposit(depositAmount);

        // Withdraw
        double withdrawAmount = BankAccount.inputWithdraw();
        myAccount.withdraw(withdrawAmount);

        // Test withdrawal with invalid amount
        myAccount.withdraw(-1.0);
    }

    // Method to display account information
    public static void displayAccountInfo(BankAccount account) {
        System.out.println("Nomor Rekening: " + account.getAccountNumber());
        System.out.println("Nama Nasabah: " + account.getCustomerName());
        System.out.println("Jumlah Saldo: $" + account.getBalance());
        System.out.println("Email Nasabah: " + account.getCustomerEmail());
        System.out.println("Nomor Handphone: " + account.getCustomerPhone());
        System.out.println("--------------------------");
    }
}
