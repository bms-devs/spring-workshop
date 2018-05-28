package pl.com.bms.springworkshop.model;

public class Transfer {

    private long accountNumberFrom;
    private long accountNumberTo;
    private long amount;

    public long getAccountNumberFrom() {
        return accountNumberFrom;
    }

    public void setAccountNumberFrom(long accountNumberFrom) {
        this.accountNumberFrom = accountNumberFrom;
    }

    public long getAccountNumberTo() {
        return accountNumberTo;
    }

    public void setAccountNumberTo(long accountNumberTo) {
        this.accountNumberTo = accountNumberTo;
    }

    public long getAmount() {
        return amount;
    }

    public void setAmount(long amount) {
        this.amount = amount;
    }

    @Override
    public String toString() {
        return "Transfer{" +
                "accountNumberFrom=" + accountNumberFrom +
                ", accountNumberTo=" + accountNumberTo +
                ", amount=" + amount +
                '}';
    }
}
