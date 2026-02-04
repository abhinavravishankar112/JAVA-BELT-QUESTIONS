// You are given two non-empty linked lists representing two non-negative integers.
// The digits are stored in reverse order, and each node of the linked lists
// contains a single digit. Add the two numbers represented by the linked lists
// and return the sum as a linked list.
// The input consists of the size of the first linked list followed by its elements,
// then the size of the second linked list followed by its elements.
// The digits are provided in reverse order, and the resulting linked list
// should also represent the sum in reverse order.
// The two numbers do not contain any leading zeros, except for the number 0 itself.
// The program should print the elements of the resultant linked list
// separated by spaces.
import java.util.*;

public class Solution {

    static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    // Creates a linked list from input
    static Node createList(Scanner sc, int size) {
        Node head = null;
        Node tail = null;

        for (int i = 0; i < size; i++) {
            Node newNode = new Node(sc.nextInt());

            if (head == null) {
                head = newNode;
                tail = newNode;
            } else {
                tail.next = newNode;
                tail = newNode;
            }
        }
        return head;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Read first linked list
        int n = sc.nextInt();
        Node l1 = createList(sc, n);

        // Read second linked list
        int m = sc.nextInt();
        Node l2 = createList(sc, m);

        Node dummy = new Node(0);
        Node current = dummy;
        int carry = 0;

        // Add the two numbers
        while (l1 != null || l2 != null || carry != 0) {
            int sum = carry;

            if (l1 != null) {
                sum += l1.data;
                l1 = l1.next;
            }

            if (l2 != null) {
                sum += l2.data;
                l2 = l2.next;
            }

            current.next = new Node(sum % 10);
            carry = sum / 10;
            current = current.next;
        }

        // Print the result linked list
        Node result = dummy.next;
        while (result != null) {
            System.out.print(result.data + " ");
            result = result.next;
        }
    }
}
