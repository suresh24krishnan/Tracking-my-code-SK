class SmartExample {
    // Static methods (can be called without an object)
    static void welcome() {
        System.out.println("Welcome! This is a static method.");
    }

    static int multiply(int a, int b) {
        return a * b;
    }

    // Instance methods (requires an object)
    void display() {
        System.out.println("This is an instance method.");
    }

    int add(int a, int b) {
        return a + b;
    }
}

public class Main {
    public static void main(String[] args) {
        // Calling static methods directly
        SmartExample.welcome();
        System.out.println("Multiplication result: " + SmartExample.multiply(3, 4));

        // Creating an object to call instance methods
        SmartExample obj = new SmartExample();
        obj.display();
        System.out.println("Addition result: " + obj.add(5, 7));
    }
}

