import java.util.Scanner;

public class BasicPart1 {

    public static void getExA1() {
        Scanner input = new Scanner (System.in);
        System.out.print("Input your first name: ");
        String fname = input.next();
        System.out.print("Input your last name: ");
        String lname = input.next();
        System.out.println();
        System.out.println("Hello\n" + fname + " " + lname);
    }

    public static void getExA2() {
        Scanner input = new Scanner (System.in);
        System.out.print("Input your first number: ");
        int firstNumber = input.nextInt();
        System.out.print("Input your second number: ");
        int secondNumber = input.nextInt();
        int sum = firstNumber + secondNumber;
        System.out.println();
        System.out.println("The sum of your two numbers is " + sum);
    }

    public static void getExA3() {
        Scanner input = new Scanner(System.in);
        System.out.print("Input your first number: ");
        int num1 = input.nextInt();
        System.out.print("Input your second number: ");
        int num2 = input.nextInt();
        int div = num1 / num2;
        System.out.println();
        System.out.println("Dividing your two numbers gives you " + div);
    }

    public static void getExA4() {
        int num1 = -5 + 8 * 6;
        int num2 = (55 + 9) % 9;
        int num3 = 20 + -3 * 5 / 8;
        int num4 = 5 + 15 / 3 * 2 - 8 % 3;
        System.out.println(num1 + "\n" + num2 + "\n" + num3 + "\n" + num4 + "\n");
    }

    public static void getExA5() {
        Scanner input = new Scanner(System.in);
        System.out.print("Input your first number: ");
        int num1 = input.nextInt();
        System.out.print("Input your second number: ");
        int num2 = input.nextInt();
        System.out.println();
        System.out.println(num1 + " x " + num2 + " = " + num1 * num2);
    }

    public static void getExA6() {
        Scanner input = new Scanner(System.in);
        System.out.print("Input your first number: ");
        int num1 = input.nextInt();
        System.out.print("Input your second number: ");
        int num2 = input.nextInt();
        int sum = num1 + num2;
        int subt = num1 - num2;
        System.out.println();
        System.out.println(num1 + " + " + num2 + " = " + sum);
        System.out.println(num1 + " - " + num2 + " = " + subt);
        System.out.println(num1 + " x " + num2 + " = " + num1 * num2);
        System.out.println(num1 + " / " + num2 + " = " + num1 / num2);
        System.out.println(num1 + " mod " + num2 + " = " + num1 % num2);
    }

    public static void getExA7() {
        Scanner input = new Scanner(System.in);
        System.out.print("Input your number: ");
        int num = input.nextInt();
        System.out.println("Your chosen number's multiplication table is: ");
        for(int i = 1; i < 11; i++) {
            System.out.println(num + " x " + i + " = " + num * i);
        }
    }

    public static void getExA8() {
        Scanner input = new Scanner(System.in);
        System.out.println("What is your favorit OOP programming language?");
        String answer = input.next();
        switch(answer) {
            case "Java":
                System.out.println("    J     a      V     V      a");
                System.out.println("    J    a a      V   V      a a");
                System.out.println("J   J   aaaaa      V V      aaaaa");
                System.out.println(" JJ    aa   aa      V      aa   aa");
                break;
            default:
                System.out.println("  CC       ## ##");
                System.out.println("CC  CC   ########");
                System.out.println("CC        ## ##");
                System.out.println("CC  CC  ########");
                System.out.println("  CC     ## ##");
                break;

        }
    }

}
