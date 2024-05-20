package test;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Welcome to account bank");
        System.out.println("============");
        AccountBank accountBank = new AccountBank();
        accountBank.displayAccountInfo();
        accountBank. depositMethod();
        System.out.println("Now your balance is " +accountBank.getBalance());
        accountBank. withdrawMethod();
    }
}
