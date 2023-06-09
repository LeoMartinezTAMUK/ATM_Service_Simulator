package AtmUtil;
public class atmFunc {
    private atm user;

    public atmFunc(atm user) {
        this.user = user;
    }

    public void menu() { // Displays the main menu of the ATM
    	System.out.println("\n**** Welcome to the ATM ****");
        System.out.println("\nSelect Options");
        System.out.println("1. Check Balance");
        System.out.println("2. Cash Withdrawal");
        System.out.println("3. Cash Deposit");
        System.out.println("4. Show User Details");
        System.out.println("5. Update Mobile Number");
        System.out.println("6. Exit");
    }
    
    public void checkBalance() { // Displays the available balance of a user
        System.out.println("\n**** Check Balance ****");
        System.out.printf("\nYour Bank balance is: $%.2f\n", user.getBalance());
        System.out.print("\nPress ENTER for Main Menu");
    }

    public void cashWithdraw(double withdrawAmount) { // Checks if the user's balance is more than the withdraw
        if (withdrawAmount > user.getBalance()) {
            System.out.printf("Error: Insufficient funds. Cannot withdraw $%.2f\n", withdrawAmount);
        } else {
            user.setCashWithdraw(withdrawAmount);
            System.out.printf("You have withdrawn $%.2f\n", withdrawAmount);
            System.out.printf("Your new balance is: $%.2f\n", user.getBalance());
        }
        System.out.print("\nPress ENTER for Main Menu");
    }

    public void cashDeposit(double depositAmount) { // Function to deposit money into the user's bank account
        user.setCashDeposit(depositAmount);
        System.out.printf("You have deposited: $%.2f\n", depositAmount);
        System.out.printf("Your new balance is: $%.2f\n", user.getBalance());
            
        System.out.print("\nPress ENTER for Main Menu");
    }

    public void showUserDetails() { // Displays basic information of the user
        System.out.println("\n**** User Details ****");
        System.out.println("\n-> Account No: " + user.getAccountNo());
        System.out.println("\n-> Name: " + user.getName());
        System.out.printf("\n-> Balance: $%.2f\n", user.getBalance());
        System.out.println("\n-> Mobile No.: " + user.getMobileNo());
        System.out.print("\nPress ENTER for Main Menu");
    }

    public void updateMobileNo(String prevMobileNo, String newMobileNo) { // Allows the user to update their phone number
        user.setMobile(prevMobileNo, newMobileNo);
        System.out.print("\nPress ENTER for Main Menu");
    }

    
    public static void clearScreen() { // Function to clear screen in Java
        System.out.print("\033[H\033[2J");
        System.out.flush();}
}
