public class Calculator
{
    static int a = 60;
    static int b = 10;
    static int ans;
    // this is static - no return type no parameter method
    static void addition() {
        ans = a + b;
        System.out.println("addition of " + a + "+" + b + " = " + ans);
    }
    static void multiplication() {
        ans = a * b;
        System.out.println("multiplication of " + a + "*" + b + " = " + ans);
    }
    static void division() {
        ans = a / b;
        System.out.println("division of " + a + "/" + b + " = " + ans);
    }
    static void subtraction() {
        ans = a - b;
        System.out.println("subtraction of " + a + "-" + b + " = " + ans);
    }
    // main method
    public static void main(String[] args) {
        addition();
        multiplication();
        division();
        subtraction();
    }
}