public class MyClass {
    public static void main(String[] args) {
        int x = 5;
        int y = 0;
        int z = x / y; // This line will cause an ArithmeticException
        System.out.println(z);
    }
}