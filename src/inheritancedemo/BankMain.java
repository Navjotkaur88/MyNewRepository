package inheritancedemo;

public class BankMain {
    public static void main(String[] args){
        BankOfCanada bank = new BankOfCanada("RBC", 1234,14.0);
        bank.printBankDetails();
        bank.printMortgageDetail();
    }
}
