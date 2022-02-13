package transacion;

import java.time.LocalDate;

public class AddAccountCredit extends Transaction {
    protected Float mobileNumber;

    public AddAccountCredit(String storeID, String transactionID, String accountID, LocalDate now, String amount, Float mobileNumber) {
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
        return "[ADD ACCOUNT CREDIT]" +
                "\n Transaction ID: " + this.getTransactionID() +
                "\n Store ID: " + this.getStoreID() +
                "\n Account ID: " + this.getAccountID() +
                "\n Time Stamp: " + this.getTimeStamp() +
                "\n Amount: " + this.getAmount() +
                "\n Mobile Number: " + this.getMobileNumber() +
                "\n ********************************************************************************";
    }
}
