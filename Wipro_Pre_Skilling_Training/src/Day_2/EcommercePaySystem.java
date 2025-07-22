package Day_2;

interface PaymentMode 
{
	void pay(double amount);
}

class UpiPayment implements PaymentMode 
{
	public void pay(double amount) 
	{
		System.out.println("Paid ₹" + amount + " via UPI.");
	}
}

class CreditCardPayment implements PaymentMode 
{
	public void pay(double amount) 
	{
		System.out.println("Paid ₹" + amount + " using Credit Card.");
	}
}

class CashOnDelivery implements PaymentMode 
{
	public void pay(double amount) 
	{
		System.out.println("Payment of ₹" + amount + " will be collected on delivery.");
	}
}

public class EcommercePaySystem 
{
	public static void main(String[] args) 
	{
		PaymentMode pm = new UpiPayment();
		pm.pay(2000);
		
		pm = new CreditCardPayment() ;
		pm.pay(3000);
		
		pm = new CashOnDelivery();
		pm.pay(6000);
		
		
	}

}
