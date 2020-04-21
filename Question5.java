import java.util.Scanner;

public class Question5
{
  public static void main(String[] args)
  {
    int length;
    
    Scanner in = new Scanner(System.in);
    System.out.println("Please enter number of Integers: ");
    length = in.nextInt();
    
    int[] integers = new int[length]; 
    
    for (int i = 0; i < length; i++){
      System.out.println("Please enter an Integer " + (i+1) + ":");
      integers[i] = Integer.parseInt(in.next());
    }
    
    in.close();

    int mode = calculateMode(integers);
    
    System.out.println("The mode is: " + mode);
 
  }

   public static int calculateMode(int[] arr)
	{
		
		int modeCount = 0;	// The count of the mode value
		int mode = 0;		// The value of the mode

		int currCount = 0;	
		int currElement;
		
		// Iterate through all values in our array and consider it as a possible mode
		for (int candidateMode : arr)
		{
			// Reset the number of times we have seen the current value
			currCount = 0;
			
			// Iterate through the array counting the number of times we see the current candidate mode
			for (int element : arr)
			{
				// If they match, increment the current count
				if (candidateMode == element)
				{
					currCount++;
				}
			}
			
			// We only save this candidate mode, if its count is greater than the current mode
			// we have stored in the "mode" variable
			if (currCount > modeCount)
			{
				modeCount = currCount;
				mode = candidateMode;
			}
		}
		
		return mode;
	}
}
