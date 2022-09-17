package practice.LinkedList;

public class LL1 {

    //1. Define a structure for Node
    class Node {
        int val;
        Node next;

        public Node(int val) {
            this.val = val;
        }
    }
    Node head = null;
    Node tail = null;

    //Add a node at end
    public void addNodeatEnd(int val){
        Node newNode = new Node(val);
        if(head == null){
            head = newNode;
            tail = newNode;
        }
        else {
            tail.next = newNode;
            newNode.next = null;
            tail = newNode;
        }

    }

    public void printLL(Node headNode){
        Node currentNode = headNode;
        while (currentNode != null){
            System.out.println(currentNode.val);
            currentNode = currentNode.next;
        }
    }

    //Search for a node with value
    public static void main(String[] args) {
        LL1 l = new LL1();
        l.addNodeatEnd(10);
        l.addNodeatEnd(20);
        l.addNodeatEnd(30);
        l.printLL(l.head);
    }
}
