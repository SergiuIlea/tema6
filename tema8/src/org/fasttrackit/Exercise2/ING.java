package org.fasttrackit.Exercise2;

public class ING implements Banca{

    public int balance = 5000;

    public void withdrawMoney (int money){
        if(money<=balance) {
            System.out.println("Congratulations! You withdrew " + money + "$");
            balance -= money;
            System.out.println("Your new balance is " + balance);
        }
        else{
            System.out.println("You cannot withdrow this amount of money. Your balance is: " + balance);
        }
    }
    public void depositMoney (int money){
        System.out.println("Please place you money in the required area!");
        System.out.println("Congratulations! You have " + money + "$ in your account!");
        balance += money;
        System.out.println("Your new balance is " + balance);
    }
}
