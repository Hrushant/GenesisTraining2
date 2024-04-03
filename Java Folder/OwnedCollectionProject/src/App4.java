import java.util.*;

public class App4 {
    public static void main(String[] args) {
        BookSelf book1 = new BookSelf("Bhagvatgeeta", 1000, "Mythology");
        BookSelf book2 = new BookSelf("Shyam Chi Aai", 1000, "Story Book");
        BookSelf book3 = new BookSelf("Mrutunjay", 1000, "Mythology");

        HashSet<BookSelf> hashset = new HashSet<>();
        hashset.add(book1);
        hashset.add(book2);
        hashset.add(book3);

        Iterator<BookSelf> itr = hashset.iterator();
        int i = 1;
        while (itr.hasNext()) {
            BookSelf val = (BookSelf) itr.next();
            System.out.println(i + " = " + val);
            i++;
        }
    }
}

class BookSelf {
    String bookName;
    int bookPrice;
    String catagory;

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((bookName == null) ? 0 : bookName.hashCode());
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        BookSelf other = (BookSelf) obj;
        if (bookName == null) {
            if (other.bookName != null)
                return false;
        } else if (!bookName.equals(other.bookName))
            return false;
        return true;
    }

    public BookSelf(String bookName, int bookPrice, String catagory) {
        this.bookName = bookName;
        this.bookPrice = bookPrice;
        this.catagory = catagory;
    }

    @Override
    public String toString() {
        return "BookSelf [bookName=" + bookName + ", bookPrice=" + bookPrice + ", catagory=" + catagory + "]";
    }
}