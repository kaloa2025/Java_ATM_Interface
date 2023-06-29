package com.mycompany.atm;
import java.util.*;
public class ATM 
{
    static int balance=0;
    static void atm_interface()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("----------------------------------");
        System.out.println("    Automated Teller Machine");
        System.out.println("    System time : 10 choices");
        System.out.println("----------------------------------");
        System.out.println("Choose 1 for Display");  
        System.out.println("Choose 2 for Withdraw");  
        System.out.println("Choose 3 for Deposit");  
        System.out.println("Choose 4 for Transfer");
        System.out.println("Choose 5 for History");
        System.out.println("Choose 0 for EXIT");
        System.out.println("----------------------------------");
        
        List<String> history = new ArrayList<>();
        history.add(0,"Balance-                      :"+balance);
    for(int j=0;j<10;j++)
    {
        System.out.print("Choose the operation you want to perform : "); 
        System.out.println(" [ Time left :"+(9-j)+" choices ]");
        int choice = sc.nextInt();  
        switch(choice)  
        {  
            case 1:
            {
                System.out.println("----------------------------------");
                System.out.println("Amount Balance :"+balance);
                System.out.println("----------------------------------");
                break;
            }
            case 2:
            {
                System.out.println("----------------------------------");
                System.out.println("Enter the amount to Withdraw");
                System.out.println("----------------------------------");
                int wit=sc.nextInt();
                if(wit>balance)
                {
                    System.out.println("Insufficient Balance");
                }
                else
                {
                    System.out.println("Withdrawl Proccessed");
                    balance=balance-wit;
                    history.add("WITHDRAW------------------------"+wit);
                    history.add("Balance-                      :"+balance);
                }
                break;
            }
            case 3:
            {
                System.out.println("----------------------------------");
                System.out.println("Enter the amount to Deposit");
                System.out.println("----------------------------------");
                int dep=sc.nextInt();
                balance+=dep;
                    System.out.println("Amount Deposited");
                    history.add("DEPOSIT------------------------"+dep);
                    history.add("Balance-                      :"+balance);
                break;
            }
            case 4:
            {
                System.out.println("----------------------------------");
                System.out.println("Enter the amount to Transfer");
                System.out.println("----------------------------------");
                int tran=sc.nextInt();
                if(tran>balance)
                {
                    System.out.println("Insufficient Balance");
                }
                else
                {
                    System.out.println("Transfer Proccessed");
                    balance-=tran;
                    history.add("TRANSFER------------------------"+tran);
                    history.add("Balance-                      :"+balance);
                }
                break;
            }
            case 5:
            {
                Iterator itr=history.iterator();
                while(itr.hasNext())
                {
                   System.out.println(itr.next());
                }
                break;
            }
            case 0:
            {
                System.out.println("THANK YOU");
                System.out.println("----------------------------------");
                System.out.println("System is exited");
                System.exit(0);
                break;
            }
            default:
            {
                System.out.println("Operation requested cannot be processed");
            }
        }
    }
    }

    static void Authenticate()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("----------------------------------");
        System.out.println("--------------WELCOME");
        System.out.println("Please enter Username and Password");
        System.out.println("----------------------------------");
        System.out.println("           Hint : Username");
        System.out.println("----------------------------------");
        String uname=sc.nextLine();
        String pword=sc.nextLine();
        if(uname.equals(pword))
        {
            System.out.println("Authentication Successful");
            atm_interface();
            
        }
        else
        {
            System.out.println("Authentication Failed");
        }
        
    }
    public static void main(String[] args) 
    {
        Authenticate();
    }
}
