public class App {
    public static void main(String[] args) throws Exception {
        Bank bank = new Bank("ICICI", "Pune", 20000);
        bank.accOpened();
        bank.accClosed();

        try {
            Account acc = new Account(bank);
            acc.notBank();
        } catch (bankNotFound b) {
            System.out.println("................"+b);
        } catch (CashNotAvailable c){
            System.out.println("Cash is not available..."+c);
        }
    }
}

class Bank {
    String bankName;
    String bankLoc;
    int balance;

    public Bank(String bankName, String bankLoc , int balance) {
        this.bankName = bankName;
        this.bankLoc = bankLoc;
        this.balance = balance;
    }

    public void setBankName(String bankName) {
        this.bankName = bankName;
    }

    public String getBankName() {
        return bankName;
    }

    public void setBankLoc(String bankLoc) {
        this.bankLoc = bankLoc;
    }

    public String getBankLoc() {
        return bankLoc;
    }

    void accOpened() {
        System.out.println("Account is opened...");
    }

    void accClosed() {
        System.out.println("Account is closed...");
    }
}

class bankNotFound extends Exception {  //checked
    bankNotFound(String msg) {
        super(msg);
    }
}

class CashNotAvailable extends RuntimeException{   //unchecked
    CashNotAvailable(String msg){
        super(msg);
    }
}

class Account {
    String bName;
    String bLoc;
    int bal;

    public Account(Bank bankObjRef) {
        this.bName = bankObjRef.bankName;
        this.bLoc = bankObjRef.bankLoc;
        this.bal = bankObjRef.balance;
    }

    void notBank() throws bankNotFound {

        int val = bal%10;
        if (val > 4){
            throw new CashNotAvailable("Cash is not available...");
        }
        if (bName == "Union" && bLoc == "Pune")
        {
            System.out.println("Bank found");
        } else {
            throw new bankNotFound("BaNk not found........");
        }
    }
}