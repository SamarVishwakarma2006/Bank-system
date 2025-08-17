import java.util.Scanner;

public class bankmanagement {
    static double withdraw;
    static double deposit =  0;
    static double newDeposit;
    static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        //Declare variable
        int choice;
        boolean open = true;
        Scanner scanner = new Scanner(System.in);

        while(open){
            System.out.println("*****************");
            System.out.println("Banking Program ");
            System.out.println("*****************");
            System.out.println("1. Show Balance");
            System.out.println("2. Deposit");
            System.out.println("3. Withdraw");
            System.out.println("4. Exit");
            System.out.println("*****************");
            System.out.print("Enter your choice(1-4): ");
            choice = scanner.nextInt();

            switch(choice){
                case 1 -> showBalance();
                case 2 -> deposit();
                case 3 -> withdraw();
                case 4 -> open = false;

                default -> System.out.println("\nInvalid Input!!");
            }

        }
    }
    static void showBalance(){
        System.out.printf("Balancd : $%.2f\n", deposit);

    }
    static void deposit(){
        System.out.print("Enter the amount you want to deposit: ");
        newDeposit = scanner.nextDouble();
        deposit = deposit + newDeposit;
    }
    static void withdraw(){
        System.out.print("Enter the amount you want to withdraw: ");
        withdraw = scanner.nextDouble();
        if (withdraw < 0){
            System.out.println("You cannot enter a negative number!!");
        }
        else{
            if(withdraw > deposit){
                System.out.println("Not enough money in account");
            }
            else{
                deposit = deposit - withdraw;
                System.out.printf("New balance is $%.2f\n", deposit);
            }
        }

    }
}