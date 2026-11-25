public class Bank {
    private double balance;
    private String accountHolder;

    public Bank(String accountHolder,double initialBalance){
        this.accountHolder=accountHolder;
        if(initialBalance >= 0){
            this.balance=initialBalance;
        }else{
            this.balance =0.0;
            System.out.print("Initial balance cannot be negative. Set to 0.0");
        }

    }

    public double getBalance(){
        return this.balance;
    }

    public void deposit(double amount){
        if(amount>0){
            this.balance += amount;
        System.out.println("Deposited: " + amount + " | New Balance: " + this.balance);
        }else {
            System.out.println("Invalid deposit amount.");
        }
    }
    public void withdraw(double amount){
        if(this.balance>amount && amount>0){
            this.balance -= amount;
            System.out.println("Withdrawn: " + amount + " | Remaining Balance: " + this.balance);
        }else{
            System.out.println("Withdrawal failed: Insufficient balance or invalid amount.");
        }
    }

    public static void main(String[]args){
        Bank b1 = new Bank("Praneeth",9000.0);

        System.out.println("Current Balance:"+b1.getBalance());

        b1.deposit(500.0);
        b1.withdraw(1500.0);
    }
}
