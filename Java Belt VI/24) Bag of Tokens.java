/*
You start with some power and a score of 0. Each token can be played once:

Face-up:
- If power >= token value, lose that much power and gain 1 score.

Face-down:
- If score >= 1, gain that much power and lose 1 score.

Return the maximum score possible.
*/
public int bagOfTokensScore(int[] tokens, int power) {
    Arrays.sort(tokens);

    int left = 0;
    int right = tokens.length - 1;
    int score = 0;
    int maxScore = 0;

    while (left <= right) {
        if (power >= tokens[left]) {
            power -= tokens[left];
            score++;
            left++;
            maxScore = Math.max(maxScore, score);
        } else if (score > 0) {
            power += tokens[right];
            score--;
            right--;
        } else {
            break;
        }
    }

    return maxScore;
}