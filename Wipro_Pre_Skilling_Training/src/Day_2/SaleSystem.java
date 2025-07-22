package Day_2;

public class SaleSystem {
	String name;
	double price;
	int quantity;

	public SaleSystem(String name, double price, int quantity) 
	{
		this.name = name;
		this.price = price;
		this.quantity = quantity;
	}

	public double getTotalCost() 
	{
		return price * quantity;
	}

	public void display() 
	{
		System.out.println("Product: " + name);
		System.out.println("Price: ₹" + price);
		System.out.println("Quantity: " + quantity);
		System.out.println("Total Cost: ₹" + getTotalCost());
		System.out.println("-----------------------------");
	}
	
	public static void displayAllProductsAndTotal(SaleSystem[] products) {
        double totalBill = 0;

        System.out.println("\n--- Sales Summary ---");
        for (SaleSystem p : products) {
            p.display();
            totalBill += p.getTotalCost();
        }

        System.out.println("Total Bill Amount: ₹" + totalBill);
    }
	
	
	public static void main(String[] args) {
        // Creating an array of products
		SaleSystem[] products = {
            new SaleSystem("Soap", 25, 3),
            new SaleSystem("Shampoo", 90, 2),
            new SaleSystem("Toothpaste", 40, 1)
        };

        // Calling the method
        displayAllProductsAndTotal(products);
    }
	
	

}
