package test;

import java.util.Scanner;

public class AccountBank {
    private String accountNumber;
    private String accountHolderName;
    private double Balance;
    Scanner sc = new Scanner(System.in);
    public String getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    public String getAccountHolderName() {
        return accountHolderName;
    }

    public void setAccountHolderName(String accountHolderName) {
        this.accountHolderName = accountHolderName;
    }

    public double getBalance() {
        return Balance;
    }

    public void setBalance(double balance) {
        Balance = balance;
    }
    public AccountBank(){
        this.accountNumber="";
        this.accountHolderName="";
        this.Balance=0.0;
    }
    public void displayAccountInfo(){
        System.out.println("Enter account number: ");
        this.accountNumber = sc.nextLine();
        System.out.println("Enter account holder name: ");
        this.accountHolderName = sc.nextLine();
        System.out.println("Enter balance: ");
        this.Balance = sc.nextDouble();
        System.out.println("Your account number is: " + this.accountNumber);
        System.out.println("Your account holder name is: " + this.accountHolderName);
        System.out.println("Your balance is: " + this.Balance);
    }
    public  double depositMethod(){
        System.out.println("Enter the deposit money: ");
        double d = sc.nextDouble();
        return  this.Balance = this.Balance + d;
    }
    public  double withdrawMethod() {
        System.out.println("Enter the withdraw money: ");
        double w = sc.nextDouble();
        double result = 0;
        if (w > this.Balance) {
            System.out.println("Notenough balance to withdraw ");
        } else {
            result = this.Balance - w;
            System.out.println("Now your balance is: "+result);
        }
        return result;
    }
}
