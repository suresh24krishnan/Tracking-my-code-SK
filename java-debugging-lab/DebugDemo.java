public class DebugDemo {
    public static void main(String[] args) {
        System.out.println("Start of DebugDemo");
        int sum = 0;
        for (int i = 1; i <= 5; i++) {
            sum += i;
            System.out.println("i = " + i + ", sum = " + sum); // line 7
        }
        System.out.println("Final sum = " + sum);
    }
}

