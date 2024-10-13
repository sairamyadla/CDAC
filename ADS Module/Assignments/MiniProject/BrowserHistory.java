public class BrowserHistory {
    private class Node {
        String url;
        Node prev;
        Node next;

        Node(String url) {
            this.url = url;
            prev = null;
            next = null;
        }
    }

    private Node current; 

    public void visitPage(String url) {
        Node newNode = new Node(url);
        if (current == null) {
            current = newNode;
        } else {
            current.next = newNode;
            newNode.prev = current;
            current = newNode;
        }
        System.out.println("Visited: " + url);
    }
    public void moveBackward() {
        if (current != null && current.prev != null) {
            current = current.prev;
            System.out.println("Moved to previous page: " + current.url);
        } else {
            System.out.println("No previous page.");
        }
    }
    public void moveForward() {
        if (current != null && current.next != null) {
            current = current.next;
            System.out.println("Moved to next page: " + current.url);
        } else {
            System.out.println("No next page.");
        }
    }

    public void clearHistory() {
        current = null;
        System.out.println("History cleared.");
    }

    public void displayCurrentPage() {
        if (current != null) {
            System.out.println("Current page: " + current.url);
        } else {
            System.out.println("No page visited.");
        }
    }

    public static void main(String[] args) {
        BrowserHistory history = new BrowserHistory();

        history.visitPage("www.example.com");
        history.displayCurrentPage();

        history.visitPage("www.google.com");
        history.displayCurrentPage();

        history.moveBackward();
        history.displayCurrentPage();

        history.moveForward();
        history.displayCurrentPage();

        history.clearHistory();
        history.displayCurrentPage();
    }
}
