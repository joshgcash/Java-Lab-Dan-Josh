package transacion;

import java.time.LocalDate;

public class Bill extends Transaction {
    protected String companyName = "";
    protected Float billCharge;

    public Bill(String storeID, String transactionID, String accountID, LocalDate now, Float amount, String companyName, Float billCharge) {
        super(storeID, transactionID, accountID, amount);
        this.storeID = storeID;
        this.transactionID = transactionID;
        this.accountID = accountID;
        this.timeStamp = LocalDate.now();
        this.amount = amount;

        this.companyName = companyName;
        this.billCharge = billCharge;

    }

    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    public Float getBillCharge() {
        return billCharge;
    }

    public void setBillCharge(Float billCharge) {
        this.billCharge = billCharge;
    }

    @Override
    public String toString() {
        return "[BILL]" +
                "\nTransaction ID: " + this.getTransactionID() +
                "\n Store ID: " + this.getStoreID() +
                "\n Account ID: " + this.getAccountID() +
                "\n Time Stamp: " + this.getTimeStamp() +
                "\n Amount: " + this.getAmount() +
                "\n Company Name: " + this.companyName +
                "\n Bill: " + this.billCharge +
                "\n ********************************************************************************";
    }

}
