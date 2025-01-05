import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ConcurrentModificationExceptionExampleSolution {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("A");
        list.add("B");
        list.add("C");

        // Solution 1: Using Iterator
        Iterator<String> iterator = list.iterator();
        while (iterator.hasNext()) {
            String str = iterator.next();
            if (str.equals("B")) {
                iterator.remove();
            }
            System.out.println(str);
        }

        System.out.println("\nSolution 2: Iterating over a copy");
        list = new ArrayList<>(List.of("A", "B", "C"));
        for(String str : new ArrayList<>(list)){
            if(str.equals("B")){
                list.remove(str);
            }
            System.out.println(str);
        }
    }
}