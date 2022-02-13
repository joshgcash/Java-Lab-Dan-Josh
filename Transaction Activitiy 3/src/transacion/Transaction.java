package transacion;

import java.time.LocalDate;

public class Transaction {
    protected String storeID;
    protected String transactionID;
    protected LocalDate timeStamp;
    protected String accountID;
    protected Float amount;

    public Transaction(String storeID, String transactionID, String accountID, Float amount){
        this.storeID = storeID;
        this.transactionID = transactionID;
        this.timeStamp = LocalDate.now();
        this.accountID = accountID;
        this.amount = amount;

    }

    public Transaction() {
    }

    public String getStoreID() {
        return storeID;
    }

    public void setStoreID(String storeID) {
        this.storeID = storeID;
    }

    public String getTransactionID() {
        return transactionID;
    }

    public void setTransactionID(String transactionID) {
        this.transactionID = transactionID;
    }

    public LocalDate getTimeStamp() {
        return timeStamp;
    }

    public void setTimeStamp(LocalDate timeStamp) {
        this.timeStamp = timeStamp;
    }

    public String getAccountID() {
        return accountID;
    }

    public void setAccountID(String accountID) {
        this.accountID = accountID;
    }

    public Float getAmount() {
        return amount;
    }

    public void setAmount(Float amount) {
        this.amount = amount;
    }

    @Override
    public String toString() {
        return "[TRANSACTION]" +
                "storeID=" + this.getStoreID() +
                ", transactionID=" + this.getTransactionID() +
                ", timeStamp=" + this.getTimeStamp() +
                ", accountID=" + this.getAccountID() +
                ", amount=" + this.getAmount();
    }
}

