import java.util.Scanner;

public class HelloWorld{
  public static void main(String args[]){
    Scanner input = new Scanner(System.in);
    System.out.print("Hello what is your name!!:    ");
    String name = input.next();

    System.out.println("welcome " + name + "!!!!");
    System.out.println("this is the start of your coding journey");
  }
}
