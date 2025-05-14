import java.util.List;
import java.util.ArrayList;
import java.util.Iterator;

public class MainExFive {
    public static void main(String[] args) {
        List<String> fruits = new ArrayList<>();
        fruits.add("Apple");
        fruits.add("Banana");

        // Enhanced for-loop
        for (String fruit : fruits) {
            System.out.println(fruit);
        }

        // Using Iterator
        Iterator<String> iterator = fruits.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }
}

