package atm;

import java.util.Scanner;

public class Main
{
    public static void main(String[] args)
    {
        int balance=500000, withdraw, deposit;
        Scanner user = new Scanner(System.in);
        System.out.println("Welcome to the Mayank ATM");
        System.out.println("Please insert your card");
        System.out.print("Enter your ID: ");
        String a = user.nextLine();
        System.out.print("Enter your ATM PIN (Hint: count from 1to4): ");
        String b = user.nextLine();
        String pin = "1234";

        if(b.equals(pin))
        {
            System.out.println("Hello "+a);
            System.out.println("Your details has been verifid for further process will proceed");
            while(true)
            {
                System.out.println("1. For Withdraw");
                System.out.println("2. For Deposit");
                System.out.println("3. For Check Balance");
                System.out.println("4. For Transfer");
                System.out.println("5. For EXIT");
                System.out.print("Choose the option you want to perform:");
                int choose = user.nextInt();
                switch(choose)
                {
                    case 1:
                        System.out.print("Enter the amount to be withdrawn:");
                        withdraw = user.nextInt();
                        if(balance >= withdraw)
                        {
                            balance = balance - withdraw;
                            System.out.println("Please collect your amount");
                        }
                        else
                        {
                            System.out.println("Insufficient Balance");
                        }
                        System.out.println("");
                        break;

                    case 2:
                        System.out.print("Enter the amount to be deposit:");
                        deposit = user.nextInt();
                        balance = balance + deposit;
                        System.out.println("Your amount has been successfully deposited");
                        System.out.println("");
                        break;

                    case 3:
                        System.out.println("Your total Balance is : "+balance);
                        System.out.println("");
                        break;

                    case 4:
                        System.out.println("Enter Id to which you want to transfer amount: ");
                        String c = user.next();
                        System.out.println("This is the ID to which you want to transfer the amount: "+c);
                        System.out.print("Enter the Amount to be transfer:");
                        int amnt = user.nextInt();
                        if(amnt > balance)
                            System.out.println("Transaction Failed");
                        else{
                            System.out.println("The amount transfer successfully");
                            balance = balance - amnt;
                        }
                        System.out.println("");
                        break;

                    case 5:
                        System.out.println("Please take your card");
                        System.out.println("Thanks for visit to Mayank ATM");
                        System.out.println("Have a nice day!!");
                        System.exit(0);
                }
            }
        }else
            System.out.println("Invalid PIN");
    }
}
