import java.util.Scanner;

public class Question3
{
  public static void main(String[] args)
  {
    Scanner in = new Scanner(System.in);
    System.out.println("Please enter an integer: ");

    int num = in.nextInt();
    int product = num * num;
    
    System.out.println("Result: " + product);
  }
}
