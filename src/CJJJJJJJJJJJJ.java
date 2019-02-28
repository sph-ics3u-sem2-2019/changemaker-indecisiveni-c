import java.util.Scanner;

public class CJJJJJJJJJJJJ {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// TODO Auto-generated method stub
		/*
		 * Create a program that reads in a dollar amount for the cost of an item
		 * Read in a second amount for how much was paid
		 * Print out how to break it into change
		 * How many 100s,50s,20s,10s,5s,toonies,loonies,quarters,dimes,nickels.
		 * If it does not end in a 5 or 0, you must round the number appropriately.
		 * If the payment doesn't cover the cost, output the amount still owing.
		 */
		Scanner in=new Scanner(System.in);
		System.out.println("How much is the cost?");
		double cost=in.nextDouble();
		System.out.println("How much was paid?");
		double payment=in.nextDouble();
		//TODO: Here is where your code goes
		
		double x = payment - cost;
		System.out.println("Your change is "+x);
				
		//Hundreds
	
				int hundreds = (int)(x / 100);
				if (hundreds != 0) {
				System.out.println(x+" dollars is equal to "+hundreds+" 100 dollar bill(s).");}
				
				//Fifties
				double z = x - (hundreds*100);
				int fifties = (int)(z/50);
				if (fifties != 0) { 
					System.out.println(x+" dollars is equal to "+fifties+" 50 dollar bill(s)."); } 
				
				//Twenties
				double n = z - (fifties*50);
				int twenties = (int)(n/20);
				if (twenties != 0) {
					System.out.println(x+" dollars is equal to "+twenties+" 20 dollar bill(s).");}
                                                          
				//Tens
				double c = n - (twenties*20);
				int tens = (int)(c/10);
				if (tens != 0) { 
					System.out.println(x+" dollars is equal to "+tens+" 10 dollar bill(s)."); }
				
				//Fives
				double w = c - (tens*10);
				int fives = (int)(w/5);
				if (fives != 0) {
					System.out.println(x+" dollars is equal to "+fives+" 5 dollar bill(s).");}
				
				//Toonies
				double v = w - (fives*5);
				int toonies = (int)(v/2);
				if (toonies != 0) {
					System.out.println(x+" dollars is equal to "+toonies+" toonie(s).");}
				
				//Loonies
				double o = v - (toonies*2);
				int loonies = (int)(o/1);
				if (loonies != 0) {
					System.out.println(x+" dollars is equal to "+loonies+" loonie(s)."); }
				//Quarters
				double u = o - (loonies*1);
				int quarters = (int)(u/0.25);
				if (quarters != 0) {
					System.out.println(x+" dollars is equal to "+quarters+" quarter(s)."); }
				//Dimes
				double d = u - (quarters*0.25);
				int dimes = (int)(d/0.1);
				if (dimes != 0) {
					System.out.println(x+" dollars is equal to "+dimes+" dime(s)."); }
				//Nickels
				double s = d - (dimes*0.1);
				int nickel = (int)(s/0.1); 
				if (hundreds != 0) { 
					System.out.println(x+" dollars is equal to "+nickel+" nickel(s)."); 
				}
				
	}

}
