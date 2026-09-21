public class typecasting {
    public static void main(String[] args) {
        // Implicit typecasting
        int i = 100;
        long l = i; // int to long
        float f = l; // long to float
        System.out.println("Implicit Typecasting:");
        System.out.println("Int: " + i);
        System.out.println("Long: " + l);
        System.out.println("Float: " + f);

        // Explicit typecasting
        double d = 9.78;
        int j = (int) d; // double to int
        System.out.println("\nExplicit Typecasting:");
        System.out.println("Double: " + d);
        System.out.println("Int: " + j);
    }
}
