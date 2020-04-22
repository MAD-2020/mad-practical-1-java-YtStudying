import java.util.Scanner;

public class Question2
{
  public static void main(String[] args)
  {
    Scanner in = new Scanner(System.in);
    
    System.out.println("Please enter your height: ");
    double height = in.nextDouble();
    
    System.out.println("Please enter your weight: ");
    double weight = in.nextDouble();
    
    double bmi = (weight * weight) / height;
    
    System.out.println("Height: " + height);
    System.out.println("Weight: " + weight);
    System.out.println("BMI: " + bmi);
  }
}
