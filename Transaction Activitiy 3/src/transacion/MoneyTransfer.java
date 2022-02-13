package transacion;

import java.time.LocalDate;

public class MoneyTransfer extends Transaction{
    protected String recipient = "";

    public MoneyTransfer(String storeID, String transactionID, String accountID, LocalDate now, Float amount, String recipient) {
        this.storeID = storeID;
        this.transactionID = transactionID;
        this.timeStamp = LocalDate.now();
        this.accountID = accountID;
        this.amount = amount;

        this.recipient = recipient;
    }

    public  MoneyTransfer() { this.recipient = recipient; }

    public  String getRecipient() { return  recipient; }

    public void setRecipient(String recipient) { this.recipient = recipient; }

    @Override
    public String toString() {
        return " [MONEY TRANSFER]" +
                "\n Transaction ID: " + this.getTransactionID() +
                "\n Store ID: " + this.getStoreID() +
                "\n Account ID: " + this.getAccountID() +
                "\n Time Stamp: " + this.getTimeStamp() +
                "\n Amount: " + this.getAmount() +
                "\n Recipient: " + this.getRecipient() +
                "\n ********************************************************************************";
    }
}

