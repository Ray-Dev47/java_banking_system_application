
/*
 This system will allow you to perform basic banking operations like creating, reading, deposit & withdraw money.
 */

import java.util.Scanner;
     public class BankAccount{
        Scanner input = new Scanner(System.in);
     private String acctName; 
          private long balance; 
          private int amount; 
          
          

          public BankAccount(String acctName, long balance, int amount){
               this.acctName = acctName;
               this.balance = balance;
               this.amount = amount;
          }

          int deposit(){
               System.out.println("Please enter amount you wish to deposit");
               if(amount < 0){
                    System.out.println("Invalid amount, please enter number greater that 1");
                    return 1;
               }
               int amount = input.nextInt();
               balance += amount;
               return 0;
          }

          int withdraw(){
               System.out.println("Please enter amount you wish to withdraw");
               if(balance < amount){
                    System.out.println("Insufficient balacnce");
                    return 1;
               }
               if(amount < 0){
                    System.out.println("Invalid amount, please enter number greater that 1");
                    return 1;
               }
               amount = input.nextInt();
               balance = balance - amount;
               return 0;
          }

          void displayInfo(){
               System.out.println("Account name: " + acctName);
               // System.out.println("Account type: " + acctType);
               System.out.println("Amount: " + amount);
               System.out.println("Balance : " + balance);
          }

          // void displayBalance(){
          //      System.out.println("Balance " + balance);
          // }


          public class Main {
               public static void main(String[] args) {
                     try (Scanner input = new Scanner(System.in)) {
                              System.out.println("Enter account name");
                              String name = input.nextLine();
                         //      System.out.println("Enter account Type");
                         //     String acctType = input.nextLine();
                             
                             System.out.println("Enter amount");
                             int amt = input.nextInt();
                             System.out.println("Enter initial balance");
                             long bal = input.nextLong();
                             
                             
                             BankAccount bank1  = new BankAccount(null, 0, 0);
                             int menu;

                             System.out.println("Menu");
                             System.out.println("Account name: " + name);
                         //     System.out.println("Account type: " + acctType);
                             System.out.println("Account balance: " + bal);
                             System.out.println("Account amount: " + amt);
                             boolean exit = false;

                             do {
                              System.out.println("Please enter from option 1 to 4");
                              menu = input.nextInt();
                                switch (menu) {
                                   case 1:
                                        bank1.deposit();
                                        break;

                                   case 2:
                                        bank1.withdraw();
                                        break;
                                   case 3:
                                        bank1.displayInfo();
                                        break;
                                   case 4:
                                       exit = true;
                                        break;
                                
                                
                                   default:
                                   System.out.println("Invalid input");
                                        break;
                                }
                             } while (!exit);
                    }

               }
           }
           
     
     }