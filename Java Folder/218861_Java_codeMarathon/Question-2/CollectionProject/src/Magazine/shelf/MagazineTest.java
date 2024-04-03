package Magazine.shelf;

import java.util.HashSet;
import java.util.Iterator;

//Creation of MagazineTest class
public class MagazineTest {
    public static void main(String[] args) {

        // Storing Magazine information
        Magazine magazine1 = new Magazine(101, "Daily Updates", "Virat", 10, 300);
        Magazine magazine2 = new Magazine(102, "Weekly Updates", "Aman", 20, 100);
        Magazine magazine3 = new Magazine(103, "Monthly Updates", "Ryan", 50, 230);
        Magazine magazine4 = new Magazine(104, "Good Thoughts", "Joel", 40, 430);
        Magazine magazine5 = new Magazine(105, "Today's Time", "Joel", 40, 110);
        Magazine magazine6 = new Magazine(101, "Daily Updates", "Virat", 10, 300);

        // Create Container for storing unique objects
        HashSet<Magazine> set = new HashSet<Magazine>();
        set.add(magazine1);
        set.add(magazine2);
        set.add(magazine3);
        set.add(magazine4);
        set.add(magazine5);
        set.add(magazine6);

        Iterator<Magazine> itr = set.iterator();  // It shows the content of the container one-by-one.

        int i = 1;
        while (itr.hasNext()) {
            Magazine magazine = itr.next();
            System.out.println(i + " => " + magazine);
            i++;
        }
    }
}
