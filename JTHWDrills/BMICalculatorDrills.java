import java.util.Scanner;

public class BMICalculatorDrills {
  public static void main(String[] args ){
    Scanner keyboard = new Scanner(System.in);
    double m, kg, pounds, bmi;
    int feet, inches;

    System.out.print( "Enter your height in feet and inches. Your height(feet only): ");
    feet = keyboard.nextInt();

    System.out.print( "Your height(inches) ");
    inches = keyboard.nextInt();

    System.out.print( "Your weight in pounds: ");
    pounds = keyboard.nextDouble();

    m = (feet*12+inches)*0.0254; //conversions: 1 foot = 12 inches; 1 inch = 0.0254 meters.
    kg = pounds*0.454;

    bmi = kg/(m*m);
    System.out.println( "Your BMI is " + bmi );

  }
}
