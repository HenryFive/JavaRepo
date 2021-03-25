import java.util.Scanner;
import java.util.Random;

public class main
{
    public static void main(String args[])
    {
        //Primitive
        int wholeNumbers = 122;
        long largeDecimalNumbers = -12;
        float numberWithDecimalPlaces = 8.3f;
        double veryLargeNumberWithDecimalPlaces = 12312312.1232;
        char singleCharacter = '\u0041';

        //Print all primitive types, output and run
        System.out.println("Int:    " + wholeNumbers);
        System.out.println("Long:   " + largeDecimalNumbers);

        double doubleNumber;
        int i = 23;
        doubleNumber = 1;

        System.out.println("doubleNumber:   " + doubleNumber);


        // if else statement
        int randomNumber;
        Random random = new Random();
        randomNumber = random.ints(1, (100)).findFirst().getAsInt();

        Scanner input = new Scanner(System.in);

        System.out.print("If else example:");
        System.out.print("Enter an integer from 1 - 100: ");
        int number = input.nextInt();

        if(number>100) {
            System.out.print("Your number is more than what is asked.");
        }
        if(number<randomNumber) {
            System.out.print("Your number is lesser than my number(" + randomNumber + ").\n");
        }
        if(number>randomNumber) {
            System.out.print("Your number is more than my number(" + randomNumber + ").\n");
        }
        // closing the scanner object

        // switch case example
        System.out.print("How many days is it since last Saturday: ");
        int days = input.nextInt();
        input.close();

        switch (days)
        {
            case 1:
                System.out.println("Today must be Sunday");
                break;
            case 2:
                System.out.println("Today must be Monday");
                break;
            case 3:
                System.out.println("Today must be Tuesday");
                break;
            case 4:
                System.out.println("Today must be Wednesday");
                break;
            case 5:
                System.out.println("Today must be Thursday");
                break;
            case 6:
                System.out.println("Today must be Friday");
                break;
            case 7:
                System.out.println("Today must be Saturday");
                break;
        }

    }
}