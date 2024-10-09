package LibraryManagement;
import java.util.concurrent.ThreadLocalRandom;

public class Account {
    private int accountNumber;
    private boolean overdues = false;
    
    public Account(int accountNumber, boolean overdues){
        this.accountNumber = accountNumber;
        this.overdues = overdues;
    }
    
    int getAccount(){
        return this.accountNumber;
    }
    
    boolean getOverdues(){
       return overdues;
    }
    
    int setAccountNumber(){
        accountNumber = ThreadLocalRandom.current().nextInt(1000, 10000);
        return accountNumber;
    }
    
    
    
}
