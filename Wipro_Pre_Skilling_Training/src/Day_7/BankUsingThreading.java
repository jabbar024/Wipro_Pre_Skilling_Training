package Day_7;


class Bank 
{
    private int balance = 1000;

    public synchronized void deposit(int amount) 
    {
        System.out.println(Thread.currentThread().getName() + " is depositing: " + amount);
        balance += amount;
        System.out.println("Balance after deposit: " + balance);
        notify();
    }

    public synchronized void withdraw(int amount) 
    {
        System.out.println(Thread.currentThread().getName() + " wants to withdraw: " + amount);
        while (balance < amount) 
        {
            System.out.println("Insufficient balance. Waiting for deposit...");
            try 
            {
                wait();
            } catch (InterruptedException e) 
            {
                e.printStackTrace();
            }
        }
        balance -= amount;
        System.out.println("Withdrawal successful. Remaining balance: " + balance);
    }
}


public class BankUsingThreading 
{
	public static void main(String[] args) 
	{
        Bank bank = new Bank();

        // Withdraw thread
        Thread t1 = new Thread(() -> {
            bank.withdraw(1500);
        }, "WithdrawThread");

        Thread t2 = new Thread(() -> {
            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            bank.deposit(1000);
        }, "DepositThread");

        t1.start();
        t2.start();
    }
	


}
