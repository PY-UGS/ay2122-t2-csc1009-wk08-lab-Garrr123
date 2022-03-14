package Week8;

import java.util.Scanner;
public class BankDemoTest {
    public static void main(String[] args) throws Exception{
        Scanner sc = new Scanner(System.in);
        CheckingAccount ca = new CheckingAccount();
        int Choice = 1;
        while(Choice ==1){
            System.out.println("Withdraw or deposit :\n1) Deposit\n2) Withdraw ");
            int choice = sc.nextInt();
            System.out.println("Please Enter Amount : ");
            double amount = sc.nextDouble();
            if(choice ==1){
                ca.deposit(amount);
                System.out.println("The balance after withdraw is $"+ ca.getBalance());
            }
            else if(choice ==2){
                try{
                    ca.withdraw(amount);
                    System.out.println("The balance after deposit is $"+ ca.getBalance());
                }catch(InsufficientFundsException ife){
                    System.err.println(ife);
                    System.err.println("Sorry, your account is lack with $" + ife.getAmount());
                }
            }
            System.out.println("1)Continue \n2)End Session");
            Choice = sc.nextInt();
        }
        sc.close();
    }
}
