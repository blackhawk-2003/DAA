class Node {
    int data;
    Node next;
    Node prev;

    public Node(int data) {
        this.data = data;
        this.next = null;
        this.prev = null;
    }
}
class DoublyLinkedList{
    Node head;

    // Insert at the beginning
    public void insertAtBeginning(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode; // If the list is empty, make newNode the head
        } else {
            newNode.next = head; // Point newNode's next to the current head
            head.prev = newNode; // Point the current head's prev to newNode
            head = newNode; // Update head to newNode
        }
    }
     // Insert at the end
     public void insertAtEnd(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode; // If the list is empty, make newNode the head
        } else {
            Node temp = head;
            while (temp.next != null) {
                temp = temp.next; // Traverse to the last node
            }
            temp.next = newNode; // Link the last node to newNode
            newNode.prev = temp; // Set newNode's prev to the last node
        }
    }
        // Delete from the beginning
        public void deleteFromBeginning() {
            if (head == null) {
                System.out.println("List is empty");
                return;
            }
            head = head.next; // Move head to the next node
            if (head != null) {
                head.prev = null; // Set the new head's prev to null
            }
        }
        
            // Delete from the end
    public void deleteFromEnd() {
        if (head == null) {
            System.out.println("List is empty");
            return;
        }
        if (head.next == null) {
            head = null; // If there's only one node, set head to null
            return;
        }
        Node temp = head;
        while (temp.next != null) {
            temp = temp.next; // Traverse to the last node
        }
        temp.prev.next = null; // Remove the last node
    }
    public void printList() {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
        System.out.println();
    }
}

public class DeleteAndInsert {
    public static void main(String[] args) {
        DoublyLinkedList doublyLinkedList = new DoublyLinkedList();
        System.out.println("Doubly Linked List Operations:");
        doublyLinkedList.insertAtBeginning(10);
        doublyLinkedList.insertAtBeginning(20);
        doublyLinkedList.insertAtEnd(30);
        doublyLinkedList.printList(); // Expected: 20 10 30
        
        doublyLinkedList.deleteFromBeginning();
        doublyLinkedList.printList(); // Expected: 10 30
        
        doublyLinkedList.deleteFromEnd();
        doublyLinkedList.printList(); // Expected: 10
    }
}

