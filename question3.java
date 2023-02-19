public class question3 {
    static class Node {
        int data;
        Node next;
        Node(int s) { 
            data = s; 
            next = null; }
    }
    public static void removeDuplicates(Node head) {
        if (head == null) {
            return;
        }
        Node current = head;
        while (current != null) {
            Node runner = current;
            while (runner.next != null) {
                if (runner.next.data == current.data) {
                    runner.next = runner.next.next;
                } else {
                    runner = runner.next;
                }
            }
            current = current.next;
        }
    }
    
    public static void printList(Node head) {
        Node current = head;
        while (current != null) {
            System.out.print(current.data + " ");
            current = current.next;
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Node head = new Node(9);
        head.next = new Node(3);
        head.next.next = new Node(7);
        head.next.next.next = new Node(9);
        head.next.next.next.next = new Node(2);
        head.next.next.next.next.next = new Node(3);
        head.next.next.next.next.next.next = new Node(5);
        head.next.next.next.next.next.next.next = new Node(9);
        head.next.next.next.next.next.next.next.next = new Node(4);
        
        System.out.println("Before removing duplicates: ");
        printList(head);
        
        removeDuplicates(head);
        
        System.out.println("After removing duplicates: ");
        printList(head);
    }
    
    
}