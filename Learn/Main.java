public class Main {
    public static void main(String[] args) {
        operation op = new operation();
        int a = 10;
        int b = 5;
        System.out.println("Addition: " + op.add(a, b));
        System.out.println("Subtraction: " + op.subtract(a, b));
        System.out.println("Multiplication: " + op.multiply(a, b));
    }
}