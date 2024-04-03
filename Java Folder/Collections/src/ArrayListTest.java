import java.util.*;

public class ArrayListTest {
    public static void main(String[] args) {
        ArrayList numberList = new ArrayList(); // container is ready
       // LinkedList numberList = new LinkedList<>(); // container is ready
       // TreeSet numberList = new TreeSet<>(); // container is ready
        //HashSet numberList = new HashSet<>(); // container is ready
        System.out.println("Container is created...");
        numberList.add(30); // content is ready
        numberList.add(20);
        numberList.add(30);
        numberList.add(10);
        numberList.add(70);
        numberList.add(40);
        numberList.add(50);
        System.out.println("Content is Added...");

        // lets access the content of the container - means iterate over it...
        System.out.println("Accessing Iterator...");
        Iterator numbIterator = numberList.iterator();
        System.out.println("Got the iterator...");

        System.out.println("ITERATOR through the collection...");

        while (numbIterator.hasNext()) {
            Integer intValue = (Integer) numbIterator.next();
            System.out.println("The integer value is " + intValue);
        }
        System.out.println("Done");
    }
}
