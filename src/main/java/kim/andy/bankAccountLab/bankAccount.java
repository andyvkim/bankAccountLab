package kim.andy.bankAccountLab;
import java.lang.Math;

/**
 * Created by andykim on 1/17/17.
 */
public class bankAccount {

    protected String accountType;

    protected int accountNumber = 0;

    protected int balance;

    protected String holderName;

    protected String statusType;

    protected int interestRate;

    protected boolean overDraftStatus;




    protected static String setUpNewAccountType(String type){
        if (type.equals("checking")){
            return type;
        }
        else if (type.equals("savings")){
            return type;
        }
        else if (type.equals("investments")){
            return type;
        }
        else System.out.println("error");
            return null;
    }

    protected double setNewAccountNumber(){
        accountNumber += 1;
        return accountNumber;

    }

    protected String setNewAccountHolder(){
        String newHolderName = this.holderName;
        return newHolderName;
    }

    protected double getBalance(String status) {
        if (!this.accountType.equals("OFAC")){
        System.out.println(balance);
        }
        return balance;
    }

    protected double setInterestRate() {
        if (this.accountType.equals("Savings")){
            double newInterestRate = this.interestRate;
            return interestRate;
        } else if (this.accountType.equals("Investments")) {
            double newInterestRate = this.interestRate;
            return interestRate;
        }
            else return 0.00;
    }


    protected String getStatus() {
        String newStatusType = this.statusType;
        return newStatusType;
    }

    protected boolean getOverDraftStatus() {
        boolean newOverDraftStatus = this.overDraftStatus;
        return overDraftStatus;
    }

//    protected String record() {
//    }



}
