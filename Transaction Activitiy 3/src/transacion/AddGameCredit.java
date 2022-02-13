package transacion;

import java.time.LocalDate;

public class AddGameCredit extends Transaction {
    protected String companyName;


    public AddGameCredit(String storeID, String transactionID, String accountID, LocalDate now, Float amount, String companyName) {
        super(storeID, transactionID, accountID, amount);
        this.companyName = companyName;

    }
    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    @Override
    public String toString() {
        return "[ADD GAME CREDIT]" +
                "\n Transaction ID: " + this.getTransactionID() +
                "\n Store ID: " + this.getStoreID() +
                "\n Account ID: " + this.getAccountID() +
                "\n Time Stamp: " + this.getTimeStamp() +
                "\n Amount: " + this.getAmount() +
                "\n Company Name: " + this.getCompanyName() +
                "\n ********************************************************************************";
    }
}

