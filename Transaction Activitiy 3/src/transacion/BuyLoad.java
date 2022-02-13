package transacion;

import java.time.LocalDate;

public class BuyLoad extends Transaction {
    protected Float mobileNumber;


    public BuyLoad(String storeID, String transactionID, String accountID, LocalDate now, Float amount, Float mobileNumber) {
        super(storeID, transactionID, accountID, amount);
        this.storeID = storeID;
        this.transactionID = transactionID;
        this.accountID = accountID;
        this.timeStamp = LocalDate.now();
        this.amount = amount;

        this.mobileNumber = mobileNumber;

    }


    public Float getMobileNumber() {
        return mobileNumber;
    }

    public void setMobileNumber(Float mobileNumber) {
        this.mobileNumber = mobileNumber;
    }

    @Override
    public String toString() {
        return "[BUY LOAD]" +
                "\n Transaction ID: " + this.getTransactionID() +
                "\n Store ID: " + this.getStoreID() +
                "\n Account ID: " + this.getAccountID() +
                "\n Time Stamp: " + this.getTimeStamp() +
                "\n Amount: " + this.getAmount() +
                "\n Mobile Number: " + this.getMobileNumber() +
                "\n ********************************************************************************";
    }
}
