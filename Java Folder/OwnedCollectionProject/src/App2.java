import java.util.*;

public class App2 {
    public static void main(String[] args) {
        ContactList cList1 = new ContactList("Hrushant", "8830209747", "hraghwarte@gmail.com");
        ContactList cList2 = new ContactList("Abhi", "894678936", "abhi@gmail.com");
        ContactList cList4 = new ContactList("Pranav", "8967653489", "pranav@gmail.com");
        ContactList cList5 = new ContactList("Mayuri", "9089786756", "mayu@gmail.com");

        LinkedList<ContactList> linkedList = new LinkedList<>();
        linkedList.add(cList1);
        linkedList.add(cList2);
        // linkedList.add(cList3);
        linkedList.add(cList4);
        linkedList.add(cList5);

        Iterator<ContactList> iter = linkedList.iterator();
        int i = 1;
        while (iter.hasNext()) {
            ContactList val = iter.next();
            System.out.println(i + " = " + val);
            i++;
        }
    }
}

class ContactList {
    String contactName;
    String contactNumber;
    String email;

    public ContactList(String contactName, String contactNumber, String email) {
        this.contactName = contactName;
        this.contactNumber = contactNumber;
        this.email = email;
    }

    @Override
    public String toString() {
        return "ContactList [contactName=" + contactName + ", contactNumber=" + contactNumber + ", email=" + email
                + "]";
    }
}