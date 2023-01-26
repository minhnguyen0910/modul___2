package home_work.bank;

public class Bank {
    public static final double INTEREST_RATE = 0.035;
    private long accountNumber;
    String accountName;
    private double money;

    public Bank() {
    }

    public Bank(int accountNumber, String accountName) {
        this.accountNumber = accountNumber;
        this.accountName = accountName;
        this.money = 50;
    }

    public Bank(int accountNumber, String accountName, int money) {
        this.accountNumber = accountNumber;
        this.accountName = accountName;
        this.money = money;
    }

    public long getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(int accountNumber) {
        this.accountNumber = accountNumber;
    }

    public String getAccountName() {
        return accountName;
    }

    public void setAccountName(String accountName) {
        this.accountName = accountName;
    }

    public double getMoney() {
        return money;
    }

    public void setMoney(int money) {
        this.money = money;
    }

    public double recharge(int extraMoney) {
        return this.money = extraMoney + this.money;
    }

    public double withdrawal(int withdrawals) {
        return this.money = this.money - withdrawals;
    }

    public double expire() {
        return this.money = this.money + this.money * INTEREST_RATE;
    }

    public double transfers(long accountNumber1, double extraMoney) {
        return this.money = this.money - extraMoney;
    }

    @Override
    public String toString() {
        return "Bank{" +
                "accountNumber=" + accountNumber +
                ", accountName='" + accountName + '\'' +
                ", money=" + money +
                '}';
    }
}
