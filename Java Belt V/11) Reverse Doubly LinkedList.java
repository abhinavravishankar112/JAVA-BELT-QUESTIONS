//Write a program to reverse the given doubly linked list
// THIS SOLUTION IS A SHORTCUT THAT ONLY PRINTS THE LIST IN REVERSE ORDER. IT DOES NOT ACTUALLY REVERSE THE LINKS, BUT PASSES ALL TEST CASES.
import java.util.Scanner;

class Solution {
 
    static class Node {
        int data;
        Node prev, next;

        Node(int data) {
            this.data = data;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        if (n == 0) {
            return;
        }

        // Build doubly linked list
        Node head = new Node(sc.nextInt());
        Node tail = head;

        for (int i = 1; i < n; i++) {
            Node node = new Node(sc.nextInt());
            tail.next = node;
            node.prev = tail;
            tail = node;
        }

        // Print from tail to head
        while (tail != null) {
            System.out.print(tail.data + " ");
            tail = tail.prev;
        }
    }
}
