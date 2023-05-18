package AtmUtil;

public class atm {
private long accountNo;
private String name;
private int pin;
private double balance;
private String mobileNo;

// Constructor to initialize the user values
public atm(long accountNo, String name, int pin, double balance, String mobileNo) {
    this.accountNo = accountNo;
    this.name = name;
    this.pin = pin;
    this.balance = balance;
    this.mobileNo = mobileNo;
}

public long getAccountNo() {
    return accountNo;
}

public String getName() {
    return name;
}

public int getPin() {
    return pin;
}

public double getBalance() {
    return balance;
}

public String getMobileNo() {
    return mobileNo;
}

// Necessary in order to update the user's phone number by verifying if the old number matches
public void setMobile(String prevMobileNo, String newMobileNo) {
    if (prevMobileNo.equals(mobileNo)) {
    	mobileNo = newMobileNo;
        System.out.println("\nYour phone number was successfully updated!");
        System.out.println("Your new mobile number is: " + mobileNo);
    } else {
        System.out.println("\nOld phone number does not match.");
    }
}

// Necessary in order to update the user's balance based on how much they withdraw
public void setCashWithdraw(double withdrawAmount) {
    if (withdrawAmount > 0 && withdrawAmount <= balance) {
        balance -= withdrawAmount;
        System.out.println("\nPlease Collect Your Cash\n");
    	}
	}

public void setCashDeposit(double depositAmount) {
    if (depositAmount > 0) {
        balance += depositAmount;
        System.out.println("\nThank you for you time!\n");
    	}
    else {
    	System.out.println("\nInvalid input\n");
    }
	}
}