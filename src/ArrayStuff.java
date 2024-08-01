import java.util.Random;
import java.util.Scanner;

public class ArrayStuff
{
    public static void main(String[] args)
    {
        //Task #1
        int[] dataPoints;
        dataPoints = new int[100];

        for(int x = 0; x < dataPoints.length; x++)
        {
            System.out.println("Value " + x + " " + dataPoints[x]);
        }

        System.out.println("");

        //Task #2
        Random rnd = new Random();
        for(int b = 0; b < dataPoints.length; b++)
        {
            dataPoints[b] = rnd.nextInt(100) + 1;
        }
        for(int x = 0; x < dataPoints.length; x++)
        {
            System.out.println("Value " + x + " " + dataPoints[x]);
        }

        System.out.println("");

        //Task #3
        for(int b = 0; b < dataPoints.length; b++)
        {
            System.out.printf("%3d |", dataPoints[b]);
        }

        System.out.println("\n");

        //Task #4
        int sum = 0;

        for(int c = 0; c < dataPoints.length; c++)
        {
            sum = sum + dataPoints[c];
        }

        System.out.println("The sum of dataPoints is: " + sum + "\n");

        int ave = sum / dataPoints.length;
        System.out.println("The average of dataPoints is: " + ave);

        System.out.println("");

        //Task #5
        Scanner in = new Scanner(System.in);
        int luckyGuess = SafeInput.getRangedInt(in,"Enter a random number: ",1,100);

        System.out.println("You put in the number: " + luckyGuess + "\n");

        //Task #6
        System.out.println("Enter value to search for in the index: ");
        int targetValue = 0;
        targetValue = in.nextInt();
        in.nextLine();

        boolean foundValue = false;

        for(int d = 0; d < dataPoints.length; d++)
        {
            if (dataPoints[d] == targetValue)
            {
                foundValue = true;
                System.out.println("Your value " + targetValue + " was found at index " + d);
            }
        }
        if(!foundValue)
        {
            System.out.println("Target " + targetValue + " not found!");
        }

        System.out.println("");

        //Task #7
        System.out.println("Enter value to search for in the index: ");
        int targetValueb = 0;
        targetValueb = in.nextInt();
        in.nextLine();

        boolean foundValueb = false;

        for(int d = 0; d < dataPoints.length; d++)
        {
            if (dataPoints[d] == targetValueb)
            {
                foundValueb = true;
                System.out.println("BREAK: Your value " + targetValueb + " was found at index " + d);
                break;
            }
        }
        if(!foundValueb)
        {
            System.out.println("Target " + targetValueb + " not found!");
        }

        System.out.println("");

        //Task #8
        int min = dataPoints[0];
        int max = dataPoints[0];

        for(int d = 0; d < dataPoints.length; d++)
        {
            if(min > dataPoints [d])
            {
                min = dataPoints[d];
            }
            if(max < dataPoints[d])
            {
                max = dataPoints[d];
            }
        }

        System.out.println("The min is: " + min + "\n");

        System.out.println("The max is: " + max + "\n");


        System.out.println("Average of dataPoints is: " + SafeInput.getAverage (dataPoints));

    }
}
