/*Maximize Consecutive Answers
A teacher is writing a test with n true/false questions, represented by a string answerKey, where:
'T' denotes True
'F' denotes False
The teacher wants to maximize the number of consecutive questions with the same answer.
You are allowed to perform the following operation at most k times:
Change the answer of any question to either 'T' or 'F'.
Your task is to find the maximum number of consecutive 'T' or 'F' in the string after performing at most k operations.*/

public static int maxConsecutiveAnswers(String answerKey, int k) {
    return Math.max(helper(answerKey, k, 'T'),
                    helper(answerKey, k, 'F'));
}

private static int helper(String s, int k, char ch) {
    int left = 0, max = 0, count = 0;

    for (int right = 0; right < s.length(); right++) {

        if (s.charAt(right) != ch) {
            count++;
        }

        while (count > k) {
            if (s.charAt(left) != ch) {
                count--;
            }
            left++;
        }

        max = Math.max(max, right - left + 1);
    }

    return max;
}
