package LInkedList;

public class LinkedListExcercise {

    class Node { //code to create new node , psedoCode
        int val;
        Node next;

        public Node(int val) {
            this.val = val;
        }
    }

    static Node head = null;
    static Node tail = null;

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

    public void addNodeatStart(int val) {
        Node newNode = new Node(val);
        if (head == null) { // LL is empty
            head = newNode;
            tail = newNode;
        } else {
            newNode.next = head;
            head = newNode;
        }
    }

    public void addNodeatIndex(int val, int index) {
        Node newNode = new Node(val);
        Node current = head;
        int count = 1;
        while (current != null && count != index - 1) {
            current = current.next;
            count++;
        }
        Node temp = current.next;
        current.next = newNode;
        newNode.next = temp;
    }


    public void deleteNodeatEnd() {
        Node current = head;
        while (current.next.next != null) {
            current = current.next;
        }
        current.next = null;
        tail = current;
    }

    public void deleteNodeatFront() {
        head = head.next;
    }

    public void deleteNodeatIndex(int index) {
        Node current = head;
        int count = 1;
        while (current != null && count != index - 1) {
            current = current.next;
            count++;
        }
        current.next = current.next.next;
    }

    public void deleteNodewithValue(int value) {
        if (value == head.val) deleteNodeatFront();
        else if (value == tail.val) deleteNodeatEnd();
        else {
            Node current = head;
            Node previous = null;
            while (current != null && current.val != value) {
                previous = current;
                current = current.next;
            }
            if (current == null) System.out.println(" Node not present");
            previous.next = current.next;
        }
    }


    public void printLinkedList(Node headNode) {
        Node currentNode = headNode;
        while (currentNode != null) {
            System.out.println(currentNode.val);
            currentNode = currentNode.next;
        }
    }

    public boolean checkIfthereIsaNodewithValue(int val) {
        Node current = head;
        while (current != null) {
            if (current.val == val) return true;
            else current = current.next;
        }
        return false;
    }


    public static void main(String[] args) {
        LinkedListExcercise l = new LinkedListExcercise();
        l.addNodeatEnd(10);
        l.addNodeatStart(15);
        l.addNodeatEnd(30);
        //System.out.println(l.checkIfthereIsaNodewithValue(50));
        l.addNodeatIndex(20, 3);
        l.printLinkedList(head);
        System.out.println("After Deletion");
        //l.deleteNodeatEnd();
        //l.deleteNodeatFront();
        //l.deleteNodeatIndex(4);
        l.deleteNodewithValue(20);
        l.printLinkedList(head);
    }
}
