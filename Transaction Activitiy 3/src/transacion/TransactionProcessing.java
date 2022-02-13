package transacion;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;


public class TransactionProcessing {
    private static ArrayList transactionList = new ArrayList<>();
    private static TransactionTypes transactionTypes;

    final private static Logger logger = Logger.getLogger(TransactionProcessing.class.getName());

    public static void main(String[] args) {
        init();

//        logger.log(Level.INFO, "Displaying All Transaction Available \n ********************************************************************************");
//        showTransaction(transactionList);

//        transactionTypes = TransactionTypes.MONEY_TRANSFER;
//        logger.log(Level.INFO, "Displaying all the Transaction about Money Transfer");
//        showTransactionType(transactionList, transactionTypes);

//        transactionTypes = TransactionTypes.BILLS_PAYMENT;
//        logger.log(Level.INFO, "Displaying all the Transaction about Bills");
//        showTransactionType(transactionList, transactionTypes);

//        transactionTypes = TransactionTypes.BUY_LOAD;
//        logger.log(Level.INFO, "Displaying all the Transaction about BUYING LOAD");
//        showTransactionType(transactionList, transactionTypes);

//        transactionTypes = TransactionTypes.ADD_ACCOUNT_CREDITS;
//        logger.log(Level.INFO, "Displaying all the Transaction about Account Credits");
//        showTransactionType(transactionList, transactionTypes);

        transactionTypes = TransactionTypes.ADD_GAME_CREDITS;
        logger.log(Level.INFO, "Displaying all the Transaction about Game Credits");
        showTransactionType(transactionList, transactionTypes);
    }

    public static void init() {
        addMoneyTransfer();
        addBillsPayment();
        addBuyLoad();
        addAccountCredits();
        addGameCredits();
    }


    public static void addMoneyTransfer() {
        MoneyTransfer moneyTransfer;
        transactionTypes = TransactionTypes.MONEY_TRANSFER;

        for (int mt = 0; mt < 5; mt++){

            moneyTransfer = new MoneyTransfer("Gkyash Branch# " + (mt+1),
                    transactionTypes + " 135792468" + (mt+1),
                    "@JoshM_11",
                    LocalDate.now(),
                    100000f,
                    "Dan");

            transactionList.add(moneyTransfer);
        }
    }

    public static void addBillsPayment() {
        Bill billsPayment;
        transactionTypes = TransactionTypes.BILLS_PAYMENT;

        for (int bills = 0; bills < 3; bills++){

            billsPayment = new Bill("Gkyash Branch# " + (bills+1),
            transactionTypes + " 246813579 " + (bills+1),
            "@DanE_10",
            LocalDate.now(),
            11000f,
            "Reppa",
            12000f);

            transactionList.add(billsPayment);
        }
    }

    public static void addBuyLoad() {
        BuyLoad buyLoad;
        transactionTypes = TransactionTypes.BUY_LOAD;

        for (int load = 0; load < 5; load++){
            buyLoad = new BuyLoad( "Josh Store Branch " + (load+1),
                    transactionTypes + " 135792468" + (load+1),
                    "@DanE_10",
                    LocalDate.now(),
                    50f,
                    09457289919f);
            transactionList.add(buyLoad);
        }
    }

    public static void addAccountCredits() {
        AddAccountCredit addAccountCredit;
        transactionTypes = TransactionTypes.ADD_ACCOUNT_CREDITS;

        for(int ac = 0; ac < 2; ac++){
            addAccountCredit = new AddAccountCredit( "Josh Store Branch " + (ac+1),
                    transactionTypes + " 135792468 " + (ac+1),
                    "@JoshM_11",
                    LocalDate.now(),
                    "500 ",
                    09996666969f);

            transactionList.add(addAccountCredit);
        }
    }

    public static void addGameCredits() {
        AddGameCredit addGameCredit;
        transactionTypes = TransactionTypes.ADD_GAME_CREDITS;

        for (int gc = 0; gc < 5; gc++){
            addGameCredit = new AddGameCredit( "Josh Store Branch " + (gc+1),
                    transactionTypes.toString() + " 246813579" + (gc+1),
                    "@JoshM_11",
                    LocalDate.now(),
                    1950f,
                    "Reppa");

            transactionList.add(addGameCredit);
        }
    }


    public static void showTransaction(ArrayList transactionList) {
        for (Object transaction: transactionList) {
            logger.log(Level.INFO, transaction.toString());
        }
    }

    public static void showTransactionType(ArrayList transactionList, Object transactionTypes) {
        for (Object transaction: transactionList) {
            if (transaction.toString().contains(transactionTypes.toString())){
                logger.log(Level.INFO, transaction.toString());
            }
        }
    }
}
