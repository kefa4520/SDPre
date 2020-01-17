import java.util.Scanner;

public class Objective3Lab5 {
  public static void main(String[] args) {
    double llama, mama, somedrama;

    Scanner input = new Scanner(System.in);

    System.out.println( "Please enter a number: ");
    llama = input.nextDouble();

    System.out.println( "Please enter another number: ");
    mama = input.nextDouble();

    somedrama = llama + mama;

    System.out.println( "The sum of " + llama + " + " + mama + " = " + somedrama );
  }
}
