//You are given an array of integers representing asteroids in a row. For each asteroid: The absolute value represents its size. 
//The sign represents its direction: Positive + means moving to the right. Negative - means moving to the left. 
//Asteroids moving at the same speed will collide if they meet, resulting in one or both being destroyed based on their size. 
//Your task is to determine the final state of the asteroids after all collisions.
import java.util.Scanner;
import java.util.Stack;

class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] asteroids = new int[n];

        for (int i = 0; i < n; i++) {
            asteroids[i] = sc.nextInt();
        }

        Stack<Integer> stack = new Stack<>();

        for (int a : asteroids) {
            boolean destroyed = false;

            // Collision happens only when:
            // stack top is moving right (+) and current asteroid is moving left (-)
            while (!stack.isEmpty() && stack.peek() > 0 && a < 0) {

                if (stack.peek() < -a) {
                    stack.pop();        // top asteroid destroyed
                    continue;
                } 
                else if (stack.peek() == -a) {
                    stack.pop();        // both destroyed
                    destroyed = true;
                    break;
                } 
                else {
                    destroyed = true;   // current asteroid destroyed
                    break;
                }
            }

            if (!destroyed) {
                stack.push(a);
            }
        }

        if (stack.isEmpty()) {
            System.out.println("Everything Destroyed");
        } else {
            for (int x : stack) {
                System.out.print(x + " ");
            }
        }
    }
}
