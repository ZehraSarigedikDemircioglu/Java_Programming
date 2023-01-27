package day18_garbageCollection;

public class BankAccount {

    public String accountHolder;
    public long accountNumber;
    public double balance;

    public void setInfo(String accountHolder, long accountNumber) {
        this.accountHolder = accountHolder;
        this.accountNumber = accountNumber;
    }

    public String toString() {
        return "BankAccount{" +
                "accountHolder='" + accountHolder + '\'' +
                ", accountNumber=" + accountNumber +
                ", balance= $" + balance +
                '}';
    }

    public void checkBalance(){
        System.out.println("Your available balance is: $" + balance);
    }

    public void deposit(double amount){
        if(amount < 1){
            System.out.println("Insufficient amount: $" + amount);
            return;
        }
        System.out.println("Depositing $"+amount +" to "+accountHolder);
        balance += amount;
    }
    public void withdraw(double amount){
        if(amount > balance){
            System.out.println("Insufficient withdraw amount: $" + amount);
            return;
        }
        System.out.println("Withdrawing $"+amount +" from "+accountHolder);
        balance -= amount;
    }

    public static void main(String[] args) {

        BankAccount obj1 = new BankAccount();
        obj1.setInfo("Zehra", 123456789);

        System.out.println(obj1);
        obj1.deposit(1000);
        obj1.checkBalance();

        obj1.withdraw(700);
        obj1.checkBalance();

        obj1.deposit(-1000);
        obj1.checkBalance();


        obj1.withdraw(5000);
        obj1.checkBalance();


        System.out.println("----------------------------------------------");

        BankAccount account1 = new BankAccount();
        account1.setInfo("Sebastian", 781638931);

        BankAccount account2 = new BankAccount();
        account2.setInfo("Weilberg", 827397301);

        account1.deposit(5000);
        account2.deposit(10000);
        System.out.println(account1);
        System.out.println(account2);

        account2.withdraw(200);
        System.out.println(account2);

    }


}
/*
2. Create a custom class named BankAccount:
			Attributes:
				1. accountHolder
				2. accountNumber
				3. balance
			Actions:
				        1. setInfo(): sets the accountHolder and accountNumber attributes
		            	2. toString(): displays the full account info
		                3. checkBalance():displays the available balance
		                4. deposit(amount): increases the balance by the specified amount
		        	    5. withdraw(amount): decreases the balance by the specified amount
 */
