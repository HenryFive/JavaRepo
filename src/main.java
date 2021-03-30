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

        System.out.print("\nIf else example: \n");
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
        System.out.print("\nSwitch Case Example: \n");
        System.out.print("Enter a number: ");
        int days = input.nextInt();

        switch (days)
        {
            case 1:
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("Tuesday");
                break;
            case 3:
                System.out.println("Wednesday");
                break;
            case 4:
                System.out.println("Thursday");
                break;
            case 5:
                System.out.println("Friday");
                break;
            case 6:
                System.out.println("Saturday");
                break;
            case 7:
                System.out.println("Sunday");
                break;
        }

        System.out.print("\nIf else Case Example: \n");
        System.out.print("Enter a day: ");
        int days2 = input.nextInt();

        if(days2 == 1) {
            System.out.println("Monday");
        } else if (days2 == 2) {
            System.out.println("Tuesday");
        } else if (days2 == 3) {
            System.out.println("Wednesday");
        } else if (days2 == 4) {
            System.out.println("Thursday");
        } else if (days2 == 5) {
            System.out.println("Friday");
        } else if (days2 == 6) {
            System.out.println("Saturday");
        } else if (days2 == 7) {
            System.out.println("Sunday");
        }

        System.out.print("\nFor loop example: \n");
        for (int a = 0; a < 5; a++) {
            System.out.println(a);
        }


        System.out.print("\nDo While example: \n");
        int x = 10;

        do {
            System.out.print("value of x : " + x );
            x++;
            System.out.print("\n");
        }while( x < 20 );

        System.out.println("\nWhile example: \n");
        int y = 1;
        while (y <=10){
            System.out.println(y);
            y++;
        }

        System.out.println("\nWhile example with input. Enter a number:");
        int y2 = input.nextInt();
        int y3 = 1;
        while (y3 <= y2){
        System.out.print("["+y3+"] ");
        y3++;
        }

        // while loop sum practice
        System.out.println("\n\nWhile example with sum. Enter a number");
        int j = input.nextInt();
        int j2 = 1;
        int j3 = 0;
        while ( j2 <= j){
            System.out.print(j2);
            if (j2 < j){
                System.out.print(" + ");
            }
            j3 += j2++;
        }
        System.out.print(" = "+j3);

        // do while

        System.out.println("\n\nDo While Loop for First n even numbers. Enter a number: ");
        int k = input.nextInt();
        int k2 = 1;
        do{
            if(k2%2==0) {
                System.out.print(k2);
                if(k2/2<k){
                    System.out.print(", ");
                }
            }
            k2++;
        } while(k2/2<=k);

        //Fibonacci
        System.out.print("\n\nFibonacci. Enter a number: ");
        int m = input.nextInt();
        int n=1;
        int o=0;
        int p=1;
        for(int l=1;l<=m;l++){
            System.out.print(p);
            p=n+o;
            if(l<m){System.out.print(", ");}
            o=n;
            n=p;
        }


        System.out.println("\n\nArithmetic examples:");
        double b = 4.5;
        double c = 5.5;
        double f;
        f = b + c;
        System.out.println("value of b + c is: " + f );

        int d = 7;
        int e = 3;
        int g = d % e;
        System.out.println("\nvalue of d % e is: " + g);

        System.out.println("Comparison Examples");
        System.out.println("\nEnter number H:");
        int H = input.nextInt();

        System.out.println("Enter number I:");
        int I = input.nextInt();
        input.close();

        if(H>I){
            System.out.println("H is greater than I");
        }
        else if(H<I){
            System.out.println("H is less than I");
        }

        if(H>=I){
            System.out.println("H is greater than or equal to I");
        }
        else if(H<=I){
            System.out.println("H is less than or equal to I");
        }

        if(H==I){
            System.out.println("H is equal to I");
        }
        else if(H!=I){
            System.out.println("H is not equal to I");
        }

        System.out.println("Complex Assignment Operation");
        int complexAssignOperand = 4;

        System.out.println("\nOriginal value is "+complexAssignOperand);

        complexAssignOperand += 5;
        System.out.println("\ncomplexAssignOperand += 5\n"+complexAssignOperand);

        complexAssignOperand -= 2;
        System.out.println("complexAssignOperand -= 2\n"+complexAssignOperand);

        complexAssignOperand *= 8;
        System.out.println("complexAssignOperand *= 8\n"+complexAssignOperand);

        complexAssignOperand /= 5;
        System.out.println("complexAssignOperand /= 5\n"+complexAssignOperand);

        complexAssignOperand %= 5;
        System.out.println("complexAssignOperand %= 5\n"+complexAssignOperand);

        System.out.println("Increment and Decrement Operators");
        int numberApples = 7;
        int numberOranges = 8;

        System.out.println("Apples = "+numberApples);
        System.out.println("Oranges = "+numberOranges);

        System.out.println("Apples increment= "+(++numberApples));

        System.out.println("Oranges decrement= "+(--numberOranges));

        int incrementOperationA = 5;
        int incrementOperationB = 5;

        int incrementOperationC = incrementOperationA * ++incrementOperationB;
        System.out.println(incrementOperationC);
        int incrementOperationD = incrementOperationA * --incrementOperationB;
        System.out.println(incrementOperationD);

        byte b2 = 127;
        b2 %= 7;
        System.out.println(b2);
        byte b3 = 120;
        b3 &= 40;
        System.out.println(b3);
        short s1 = 300;
        s1 ^= 100;
        System.out.println(s1);
        byte b4 = 127;
        b4 >>=3;
        System.out.println(b4);

        byte number1 = 5;
        System.out.println("Widening casting");
        // byte -> short -> char -> int -> long -> float -> double

        short myShort = 9;
        double myDouble = myShort;

        System.out.println(myShort);
        System.out.println(myDouble);

        System.out.println("Narrow casting");
        double mySecondDouble = 9.78;
        short mySecondShort = (short) mySecondDouble;

        System.out.println(mySecondDouble);
        System.out.println(mySecondShort);
    }

}