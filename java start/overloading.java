import java.util.Scanner;

public class overloading {

    int a, b;

    overloading(int a, int b) {
        this.a = a;
        this.b = b;
    }

    overloading(int a) {
        this.a = a;
        this.b = 5;
    }

    public void printall() {
        System.out.println("the value of a \t " + a + " \t and the value of b is \t " + b);
    }

    int addition(int num) {

        return num + 5;
    }

    int addition(int num, int num2) {
        return num + num2;
    }

    public static void main(String[] args) {
        int num1, num2;
        overloading c = new overloading(3, 6);
        c.printall();
        overloading a = new overloading(8);
        a.printall();
        Scanner sc = new Scanner(System.in);
        System.out.println("enter value of 2 numbers");
        num1 = sc.nextInt();
        System.out.println("enter value of second number");
        num2 = sc.nextInt();

        System.out.println("the added value is" + c.addition(num1, num2));
        System.out.println("enter only one value");
        num1 = sc.nextInt();
        System.out.println("the added value is " + c.addition(num1));
        sc.close();
    }

}
