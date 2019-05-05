import java.util.Scanner;

public class DataTypes {

    public static void ExC1() {
        Scanner input = new Scanner(System.in);
        System.out.print("Input a degree in Fahrenheit: ");
        double fahr = input.nextDouble();
        double celsius = (fahr - 32) * 5 / 9;
        System.out.println();
        System.out.println(fahr + " degrees Fahrenheit equals to " + celsius + " degrees Celsius.");
    }

    public static void ExC2() {
        Scanner input = new Scanner(System.in);
        System.out.print("Input your value in inches: ");
        double inch = input.nextFloat();
        double metre = inch / 39.37;
        System.out.println();
        System.out.println(inch + " inches is equal to " + metre + " metres.");
    }

    public static void ExC3() {
        Scanner input = new Scanner(System.in);

        System.out.print("Input an integer between 0 and 1000: ");
        int num = input.nextInt();

        int firstDigit = num % 10;
        int remainingNumber = num / 10;
        int secondDigit = remainingNumber % 10;
        remainingNumber = remainingNumber / 10;
        int thirdDigit = remainingNumber % 10;
        remainingNumber = remainingNumber / 10;
        int fourthDigit = remainingNumber % 10;
        int sum = thirdDigit + secondDigit + firstDigit + fourthDigit;
        System.out.println("The sum of all digits in " + num + " is " + sum);
    }





}
