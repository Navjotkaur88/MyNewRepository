package inheritancedemo;

public class Bank {
        String accountInfo;
        int accountNumber;
    public Bank(String accountInfo, int accountNumber){
        this.accountInfo = accountInfo;
        this.accountNumber = accountNumber;
    }
public void printBankDetails()
{
        System.out.println("Bank account Info : " +accountInfo);
        System.out.println("Bank account Number : " +accountNumber);
    }
}
