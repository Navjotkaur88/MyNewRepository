package inheritancedemo;

public class BankOfCanada extends Bank {

            double mortgageRate;
           public BankOfCanada(String accountInfo, int accountNumber, double mortgageRate) {
               super(accountInfo, accountNumber);
               this.mortgageRate = mortgageRate;


           }
        public void printMortgageDetail()
        {

        System.out.println("My mortgage is : " + mortgageRate);
    }
}
