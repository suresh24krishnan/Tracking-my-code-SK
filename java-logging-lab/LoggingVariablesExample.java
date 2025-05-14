import java.util.logging.Logger;
import java.util.logging.Level;

public class LoggingVariablesExample {
    private static final Logger logger = Logger.getLogger(LoggingVariablesExample.class.getName());

    public static void main(String[] args) {
        int a = 50;
        int b = 0;  // updating b to be 0

        logger.info("Dividing " + a + " by " + b);

        try {
            int result = divide(a, b);
            logger.info("Result: " + result);
        } catch (ArithmeticException e) {
            logger.severe("Error: " + e.getMessage());
            logger.log(Level.SEVERE, "Exception occurred", e);
        }
    }

    public static int divide(int x, int y) {
        return x / y;
    }
}

