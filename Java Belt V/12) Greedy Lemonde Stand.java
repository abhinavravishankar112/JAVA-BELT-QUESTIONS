//At a lemonade stand, each lemonade costs $5. Customers are standing in a queue to buy from you, paying one at a time in the order specified by bills.
//Each customer will pay with either a $5, $10, or $20 bill, and you must provide the correct change to each customer.
//Note: You start with no money initially. Your task is to determine whether you can provide the correct change to every customer. 
//If possible, print true; otherwise, print false.
import java.util.Scanner;

class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int five = 0, ten = 0;

        for (int i = 0; i < n; i++) {
            int bill = sc.nextInt();

            if (bill == 5) {
                five++;
            } 
            else if (bill == 10) {
                if (five == 0) {
                    System.out.println(false);
                    return;
                }
                five--;
                ten++;
            } 
            else { // bill == 20
                if (ten > 0 && five > 0) {
                    ten--;
                    five--;
                } else if (five >= 3) {
                    five -= 3;
                } else {
                    System.out.println(false);
                    return;
                }
            }
        }

        System.out.println(true);
    }
}
