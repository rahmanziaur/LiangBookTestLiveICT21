import java.util.Scanner;

public class ReadDifferentDataTypes {
    public static void main(String[] args) {
        // Create a Scanner object to read input from keyboard
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a byte value: ");
        byte b = sc.nextByte();

        System.out.print("Enter a short value: ");
        short s = sc.nextShort();

        System.out.print("Enter an int value: ");
        int i = sc.nextInt();

        System.out.print("Enter a long value: ");
        long l = sc.nextLong();

        System.out.print("Enter a float value: ");
        float f = sc.nextFloat();

        System.out.print("Enter a double value: ");
        double d = sc.nextDouble();

        System.out.print("Enter a boolean value (true/false): ");
        boolean bool = sc.nextBoolean();

        // To read a single character, read a String and take its first char
        System.out.print("Enter a character: ");
        char ch = sc.next().charAt(0);

        // To read a full string (single word)
        System.out.print("Enter a string (single word): ");
        String str = sc.next();

        // To read a full line (including spaces)
        sc.nextLine(); // consume leftover newline
        System.out.print("Enter a full line: ");
        String line = sc.nextLine();

        // Displaying all the entered values
        System.out.println("\n===== You Entered =====");
        System.out.println("byte: " + b);
        System.out.println("short: " + s);
        System.out.println("int: " + i);
        System.out.println("long: " + l);
        System.out.println("float: " + f);
        System.out.println("double: " + d);
        System.out.println("boolean: " + bool);
        System.out.println("char: " + ch);
        System.out.println("String (word): " + str);
        System.out.println("Full line: " + line);

        sc.close();
    }
}
