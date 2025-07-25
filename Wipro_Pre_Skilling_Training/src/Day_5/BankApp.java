package Day_5;

interface Bank 
{
	double getBalance();

	void deposite(double amount);

	void withdraw(double amount);

	default void displyAccountType() 
	{
		System.out.println("Account Type: Generic Bank Account");
	}

	default void executeTransaction(String type, double amount) 
	{
		switch (type.toUpperCase()) 
		{
			case "DEPOSITE": 
			{
				deposite(amount);
				System.out.println("Deposited $" + amount + ". New balance: $" + getBalance());
				break;
			}
			
			case "WITHDRAW": 
			{
				withdraw(amount);
				System.out.println("Withdrew $" + amount + ". New balance: $" + getBalance());
				break;
			}
			
			default:
				System.out.println("Unknown transaction type: '" + type+"' It should be DEPOSITE OR WITHDRAW");

		}
	}
	
	static boolean isValid(double amount)
	{
		return amount > 0 ;
	}
}

class SavingAccount implements Bank 
{
	public double balance ;
	
	public double getBalance()
	{
		return balance ;
	}
	
	public void deposite(double amount) 
	{
		if(Bank.isValid(amount))
		{
			balance += amount ;
		}
		else
		{
			System.out.println("InValid Amount ");
		}
	}
	
	public void withdraw(double amount) 
	{
		
		if(Bank.isValid(amount) && amount <= balance)
		{
			balance -= amount ;
		}
		else
		{
			System.out.println("Enter Valid Amount or Insufficient Balance");
		}
	}
}


public class BankApp 
{
	public static void main(String[] args) 
	{
		Bank b = new SavingAccount() ;
		
		b.executeTransaction("DEPOSITE", 2000);
		b.executeTransaction("DEPOSITE", 5000);
		b.executeTransaction("DEPOSITE", 10000);
		b.executeTransaction("WITHDRAW", 16000);
		
		
	}
}












