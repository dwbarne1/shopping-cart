import java.util.Scanner;
public class ShoppingCart {

	public static void main(String[] args) {		
		
		Scanner scan = new Scanner(System.in);
		
		String[] productNames = new String[5];
		String[] productCategories = new String[5];
		double[] prices = new double[5];
		// Three arrays initialized for later values in the for loop
		
		double techTotalOfPrices = 0;
		double techAverageOfPrices = 0;
		int techPriceCounter = 0;
		
		double groceryTotalOfPrices = 0;
		double groceryAverageOfPrices = 0;
		int groceryPriceCounter = 0;
		
		double officeTotalOfPrices = 0;
		double officeAverageOfPrices = 0;
		int officePriceCounter = 0;
		
		double otherTotalOfPrices = 0;
		double otherAverageOfPrices = 0;
		int otherPriceCounter = 0;
		/* TotalOfPrices variables as accumulated totals; 
		   AverageOfPrices variable as averages for each; 
		   Counter variable as the total products in each category and divisor in the later average calculation
		*/
		
		System.out.println("\t\t\tShopping Cart");
		System.out.println("\n\nThis program maintains a list of products (name, category, price). It will calculate average dollars spent per category for you.");
		
		/* for loop will determine the product name, product category, and product price of each of 5 products and store the values in the three respective arrays created;
		   also will check the product category name on each iteration, and the accumulated total for each respective category will increase depending on the respective price entered for the product
		   the category price counter will increment by 1 inside each if statement depending on the category entered
		*/
		for(int i = 0; i < 5; i++)
		
		{
		
			System.out.print("\nEnter product name: ");
			productNames[i] = scan.nextLine();
		
			System.out.print("Enter product category (Tech/Grocery/Office): ");
			productCategories[i] = scan.nextLine();
		
			System.out.print("Enter product price: ");
			prices[i] = Double.parseDouble(scan.nextLine());
			
			if(productCategories[i].equalsIgnoreCase("Tech"))
			{
				techTotalOfPrices += prices[i];
				techPriceCounter++;
			}
			
			else if(productCategories[i].equalsIgnoreCase("Grocery"))
			{
				groceryTotalOfPrices += prices[i];
				groceryPriceCounter++;
			}
			
			else if(productCategories[i].equalsIgnoreCase("Office"))
			{
				officeTotalOfPrices += prices[i];
				officePriceCounter++;
			}
			
			else
			{
				otherTotalOfPrices += prices[i];
				otherPriceCounter++;
			}
		
		}
		// end for loop
		
		// if statements used to calculate each of the four averages; protection against the value being displayed as "NaN" if trying to divide by zero
		if(techPriceCounter > 0)
		{
			techAverageOfPrices = techTotalOfPrices/techPriceCounter;
		}
		
		else
		{
			techAverageOfPrices = 0;
		}
		
		if(groceryPriceCounter > 0)
		{
			groceryAverageOfPrices = groceryTotalOfPrices/groceryPriceCounter;
		}
		
		else
		{
			groceryAverageOfPrices = 0;
		}
		
		if(officePriceCounter > 0)
		{
			officeAverageOfPrices = officeTotalOfPrices/officePriceCounter;
		}
		
		else
		{
			officeAverageOfPrices = 0;
		}
		
		if(otherPriceCounter > 0)
		{
			otherAverageOfPrices = otherTotalOfPrices/otherPriceCounter;
		}
		
		else
		{
			otherAverageOfPrices = 0;
		}
		// end if statement blocks
		
		// products for each category listed below, as well as the average dollars spent
		
		System.out.println("\nTECH PRODUCTS");
		for(int i = 0; i < productNames.length; i++)
		{
			if(productCategories[i].equalsIgnoreCase("Tech"))
			{
				System.out.println(productNames[i]);
			}
			
		}
		System.out.printf("Average dollars spent: $%.2f", techAverageOfPrices);
		
		System.out.println("\n\nGROCERY PRODUCTS");
		for(int i = 0; i < productNames.length; i++)
		{
			if(productCategories[i].equalsIgnoreCase("Grocery"))
			{
				System.out.println(productNames[i]);
			}
			
		}
		System.out.printf("Average dollars spent: $%.2f", groceryAverageOfPrices);
		
		System.out.println("\n\nOFFICE PRODUCTS");
		for(int i = 0; i < productNames.length; i++)
		{
			if(productCategories[i].equalsIgnoreCase("Office"))
			{
				System.out.println(productNames[i]);
			}
			
		}
		System.out.printf("Average dollars spent: $%.2f", officeAverageOfPrices);
		
		System.out.println("\n\nOTHER");
		for(int i = 0; i < productNames.length; i++)
		{
			if(!(productCategories[i].equalsIgnoreCase("Tech")) && !(productCategories[i].equalsIgnoreCase("Grocery")) && !(productCategories[i].equalsIgnoreCase("Office")))
			{
				System.out.println(productNames[i]);
			}
			
		}
		System.out.printf("Average dollars spent: $%.2f", otherAverageOfPrices);
		
		System.out.print("\n\nPress Enter to Exit...");
		scan.nextLine();
		
		scan.close();

	}

}
