package Account;

public class Account implements IAccount {
    private String name;
    private String email;
    private int accountNumber;
    private double accountBalance;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(int accountNumber) {
        this.accountNumber = accountNumber;
    }

    public double getAccountBalance() {
        return accountBalance;
    }

    public void setAccountBalance(double accountBalance) {
        this.accountBalance = accountBalance;
    }


    @Override
    public void recharge(double amount) {
        accountBalance+=amount;
    }

    @Override
    public void changeEmail(String email) {
        this.email=email;
    }

    @Override
    public void displayInfo() {
        System.out.println("********************************");
        System.out.println("Mã người dùng : "+accountNumber);
        System.out.println("Tên người dùng : "+name);
        System.out.println("Email người dùng : "+ email);
        System.out.println("Số dư tài khoản : "+accountBalance + " VND");
        System.out.println("********************************");
    }
}
