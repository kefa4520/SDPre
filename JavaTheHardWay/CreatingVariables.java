public class CreatingVariables {
  public static void main( String[] args ){
    //study drill: Add four more variables to the program: another integer, another double, and two Strings.
    //Name them whatever you want. Give them values. Print them out.
    int x, y, year, age;
    double seconds, e, checking, weight;
    String firstName, lastName, title, course, schoolName;

    x = 10;
    y = 400;
    year = 2019;
    age = 30;

    seconds = 4.71;
    e = 2.71828182845904523536;
    checking = 1.89;
    weight = 144.5;

    firstName = "Iryna";
    lastName = "Tretynyk";
    title = "Ms.";
    course = "Java Coding";
    schoolName = "Skill Distillery";

    System.out.println( "The variable x contains " + x );
    System.out.println( "The value " + y + " is stored in the variable y." );
    System.out.println( "The experiment took " + seconds + " seconds." );
    System.out.println( "A favorite irrational # is Euler's number: " + e );
    System.out.println( "Hopefully you have more than $" + checking + "!" );
    System.out.println( "My name's " + title + " " + firstName + lastName );
    System.out.println( "In " + year + " I turned " + age + " and my weight was " + weight);
    System.out.print( "I study " + course + " at " + schoolName);
  }
}
