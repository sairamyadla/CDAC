class ContactList {
    class Node {
        String name;
        String phone;
        Node next;

        Node(String name, String phone) {
            this.name = name;
            this.phone = phone;
            this.next = null;
        }
    }
    public Node head = null;
    public Node tail = null;

    public void addContactList(String name, String phone) {
        Node newNode = new Node(name, phone);  
        if (head == null) {
            head = newNode;  
            tail = newNode;
        } else {
            tail.next = newNode;  
            tail = newNode;
        }
    }

    public void delContactList(String name) {
        Node temp = head, prev = null;

        if (temp != null && temp.name.equals(name)) {
            head = temp.next; 
            return;
        }

        while (temp != null && !temp.name.equals(name)) {
            prev = temp;
            temp = temp.next;
        }

        if (temp == null) return;

        prev.next = temp.next;

        if (temp == tail) {
            tail = prev;
        }
    }

    public void searchContact(String name) {
        Node current = head;

        while (current != null) {
            if (current.name.equals(name)) {
                System.out.println("Contact found: Name: " + current.name + ", Phone: " + current.phone);
                return;  
            }
            current = current.next;
        }

        System.out.println("Contact not found with the name: " + name);
    }

    public void displayContacts() {
        Node current = head;
        if (head == null) {
            System.out.println("Contact list is empty.");
            return;
        }
        System.out.println("Contact List:");
        while (current != null) {
            System.out.println("Name: " + current.name + ", Phone: " + current.phone);
            current = current.next;
        }
    }

    public static void main(String[] args) {
        ContactList contactList = new ContactList();

        contactList.addContactList("Sai Ram", "6281638483");
        contactList.addContactList("ABC", "0987654321");

        contactList.displayContacts();

        contactList.searchContact("Sai Ram");
        contactList.searchContact("xyz");

        contactList.delContactList("ABC");

        contactList.displayContacts();
    }
}