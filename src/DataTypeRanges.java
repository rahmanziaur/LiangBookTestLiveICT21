import java.math.BigInteger;

public class DataTypeRanges {
    public static void main(String[] args) {

        System.out.println("===== Primitive Data Type Ranges =====");

        System.out.println("byte:");
        System.out.println("  Min: " + Byte.MIN_VALUE);
        System.out.println("  Max: " + Byte.MAX_VALUE);

        System.out.println("\nshort:");
        System.out.println("  Min: " + Short.MIN_VALUE);
        System.out.println("  Max: " + Short.MAX_VALUE);

        System.out.println("\nint:");
        System.out.println("  Min: " + Integer.MIN_VALUE);
        System.out.println("  Max: " + Integer.MAX_VALUE);

        System.out.println("\nlong:");
        System.out.println("  Min: " + Long.MIN_VALUE);
        System.out.println("  Max: " + Long.MAX_VALUE);

        System.out.println("\nfloat:");
        System.out.println("  Min: " + Float.MIN_VALUE);
        System.out.println("  Max: " + Float.MAX_VALUE);

        System.out.println("\ndouble:");
        System.out.println("  Min: " + Double.MIN_VALUE);
        System.out.println("  Max: " + Double.MAX_VALUE);

        System.out.println("\n===== BigInteger =====");
        System.out.println("BigInteger can represent integers of arbitrary size, limited only by available memory.");

        // Example of very large BigInteger
        BigInteger big = new BigInteger("999999999999999999999999999999999999999999999999999999");
        System.out.println("Example BigInteger value: " + big);
        System.out.println("Number of digits in example BigInteger: " + big.toString().length());
    }
}
