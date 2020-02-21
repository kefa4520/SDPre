import java.util.Scanner;
public class Sequencing {
public static void main( String[] args ) {
//Move the two lines of code that give values to salesTax and total so they occur after price has been given a real value.

Scanner keyboard = new Scanner(System.in);
double price, salesTax, total;

System.out.print( "How much is the purchase price? " );
price = keyboard.nextDouble();

salesTax = price * 0.0825;
total = price + salesTax;

System.out.println( "Item price:\t" + price );
System.out.println( "Sales tax:\t" + salesTax );
System.out.println( "Total cost:\t" + total );
  }
}
