public class Account {
    private int num;
    private String holder;
    private double bal;

    public Account(int num, String holder, double bal) {
        this.num = num;
        this.holder = holder;
        if (bal < 0) {
            throw new InvalidAmtEx("Initial balance cannot be negative");
        }
        this.bal = bal;
    }

    public int getNum() {
        return num;
    }

    public String getHolder() {
        return holder;
    }

    public double getBal() {
        return bal;
    }

    public void setHolder(String holder) {
        this.holder = holder;
    }

    public void deposit(double amt) {
        if (amt <= 0) {
            throw new InvalidAmtEx("Deposit must be positive");
        }
        bal += amt;
    }

    public void withdraw(double amt) {
        if (amt <= 0) {
            throw new InvalidAmtEx("Withdrawal must be positive");
        }
        if (amt > bal) {
            throw new InvalidAmtEx("Not enough funds. Balance: " + bal);
        }
        bal -= amt;
    }

    @Override
    public String toString() {
        return num + " | " + holder + " | " + bal;
    }
}