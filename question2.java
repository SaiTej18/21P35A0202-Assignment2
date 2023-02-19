class Node {
    int data;
    Node next;
  
    Node(int data) {
      this.data = data;
      this.next = null;
    }
  }
  
  class LinkedList {
    Node head;
  
    LinkedList() {
      this.head = null;
    }
  
    void add(int data) {
      Node newNode = new Node(data);
      if (head == null) {
        head = newNode;
      } else {
        Node last = head;
        while (last.next != null) {
          last = last.next;
        }
        last.next = newNode;
      }
    }
  
    void printList() {
      Node temp = head;
      while (temp != null) {
        System.out.print(temp.data + " ");
        temp = temp.next;
      }
      System.out.println();
    }
  }
  
  public class question2 {
    public static void main(String[] args) {
      LinkedList list1 = new LinkedList();
      list1.add(3);
      list1.add(1);
      list1.add(5);
      list1.add(9);
      list1.add(7);
      list1.add(11);
  
      LinkedList list2 = new LinkedList();
      list2.add(6);
      list2.add(2);
      list2.add(10);
      list2.add(4);
      list2.add(8);
      list2.add(12);
  
      LinkedList mergedList = new LinkedList();
  
      Node head1 = list1.head;
      Node head2 = list2.head;
  
      while (head1 != null && head2 != null) {
        if (head1.data < head2.data) {
          mergedList.add(head1.data);
          head1 = head1.next;
        } else {
          mergedList.add(head2.data);
          head2 = head2.next;
        }
      }
  
      while (head1 != null) {
        mergedList.add(head1.data);
        head1 = head1.next;
      }
  
      while (head2 != null) {
        mergedList.add(head2.data);
        head2 = head2.next;
      }
  
      System.out.println("Merged List: ");
      mergedList.printList();
      System.out.println("Sorted Merged List: ");
      sortList(mergedList);
      mergedList.printList();
    }
  
    static void sortList(LinkedList list) {
      Node curr = list.head;
      Node index = null;
  
      int temp;
  
      if (list.head == null) {
        return;
      } else {
        while (curr != null) {
          index = curr.next;
          while (index != null) {
            if (index.data < curr.data) {
              temp = curr.data;
              curr.data = index.data;
              index.data = temp;
            }
            index = index.next;
          }
          curr = curr.next;
        }
      }
    }
  }