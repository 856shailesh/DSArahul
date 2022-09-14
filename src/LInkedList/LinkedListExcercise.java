package LInkedList;

public class LinkedListExcercise {

    class Node { //code to create new node , psedoCode
        int val;
        Node next;

        public Node(int val) {
            this.val = val;
        }
    }

    Node head = null;
    Node tail = null;

    public void addNodeatEnd(int val) { // cannot make this static because of nested class so create obj of class
        Node newNode = new Node(val);
        if (head == null) { // LL is empty
            head = newNode;
            tail = newNode;
        } else {   // Insert new Node at end
            tail.next = newNode;
            newNode.next = null;
            tail = newNode;
        }
    }

    public void printLinkedList(Node headNode) {
        Node currentNode = headNode;
        while (currentNode != null) {
            System.out.println(currentNode.val);
            currentNode = currentNode.next;
        }
    }


    public static void main(String[] args) {
        LinkedListExcercise l = new LinkedListExcercise();
        l.addNodeatEnd(10);
        l.addNodeatEnd(20);
        l.addNodeatEnd(30);
        l.addNodeatEnd(40);
        l.printLinkedList(l.head);
    }
}
