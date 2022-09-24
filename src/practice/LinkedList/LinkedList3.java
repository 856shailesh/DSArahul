package practice.LinkedList;

public class LinkedList3 {

    class Node {
        int val;
        Node next;

        public Node(int val) {
            this.val = val;
        }
    }

    static Node head = null;
    static Node tail = null;

    public void addNodeatStart(int val) {
        Node newNode = new Node(val);
        if (head == null) {
            head = newNode;
            tail = newNode;
        } else {
            newNode.next = head;
            head = newNode;
        }
    }

    public void addNodeatEnd(int val) {
        Node newNode = new Node(val);
        if (head == null) {
            head = newNode;
            tail = newNode;
        } else {
            tail.next = newNode;
            newNode.next = null;
            tail = newNode;

        }
    }

    public void addNodeatIndex(int val, int index) {
        Node newNode = new Node(val);
        Node curr = head;
        int count = 1;

        while (curr != null && count != index - 1) {
            curr = curr.next;
            count++;
        }
        Node t = curr.next;
        curr.next = newNode;
        newNode.next = t;
    }

    public boolean searchValueinLL(int v) {
        Node curr = head;
        while (curr != null) {
            if (curr.val == v) return true;
            curr = curr.next;
        }
        return false;
    }

    public void deleteatFront() {
        if (head == null) System.out.println(" Node already empty");
        else head = head.next;
    }

    public void deleteatEnd() {
        Node curr = head;
        if (head == null) System.out.println(" Node already empty");
        else {
            while (curr.next.next != null) {
                curr = curr.next;
            }
            curr.next = null;
            tail = curr;

        }

    }

    public void reverseLinkedList() {
        if (head == null || head.next == null) return; // If no node present or one node

        Node curr = head;
        Node prev = null;
        Node next = null;
        while (curr != null) {
            next = curr.next; //hold the falling piece for pointer
            curr.next = prev;  // change the pointer direction
            prev = curr;
            curr = next;
        }
        head.next = null;
        head = prev;
        printLinkedList(head);
    }

    public void printLinkedList(Node node) {
        Node curr = node;
        while (curr != null) {
            System.out.print(curr.val + " ");
            curr = curr.next;
        }

    }


    public static void main(String[] args) {
        LinkedList3 ll = new LinkedList3();
        ll.addNodeatStart(12);
        ll.addNodeatStart(9);
        ll.addNodeatEnd(14);
//          ll.addNodeatIndex(10, 3);
        ll.printLinkedList(head);
        //System.out.println(ll.searchValueinLL(11));
//        ll.deleteatFront();
//        ll.deleteatEnd();
        System.out.println(" ");
        System.out.println("After Reversal");
        ll.reverseLinkedList();

    }
}
