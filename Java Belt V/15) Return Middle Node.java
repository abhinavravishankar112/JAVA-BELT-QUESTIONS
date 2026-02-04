// You are given the head of a singly linked list.
// Write a program to return the middle node of the linked list.
// If there are two middle nodes (i.e., the list has even length),
// return the second middle node.
// The input consists of the number of elements in the linked list
// followed by the space-separated values of the linked list nodes.
// The program should print the value of the middle node of the linked list.

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

    // Create linked list from input
    static Node createList(Scanner sc, int n) {
        Node head = null;
        Node tail = null;

        for (int i = 0; i < n; i++) {
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

        int n = sc.nextInt();
        Node head = createList(sc, n);

        // Two-pointer technique
        Node slow = head;
        Node fast = head;

        // fast moves 2 steps, slow moves 1 step
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }

        // slow will be at the middle (second middle if even)
        System.out.println(slow.data);
    }
}
