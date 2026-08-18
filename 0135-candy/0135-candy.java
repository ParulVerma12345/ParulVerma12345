class Solution {

    public int candy(int[] ratings) {

        int n = ratings.length;

        int[] candy = new int[n];

        // Sabko minimum 1 candy
        for (int i = 0; i < n; i++) {
            candy[i] = 1;
        }

        // Left se right
        for (int i = 1; i < n; i++) {

            if (ratings[i] > ratings[i - 1]) {
                candy[i] = candy[i - 1] + 1;
            }
        }

        // Right se left
        for (int i = n - 2; i >= 0; i--) {

            if (ratings[i] > ratings[i + 1]) {
                candy[i] = Math.max(candy[i], candy[i + 1] + 1);
            }
        }

        int total = 0;

        for (int i = 0; i < n; i++) {
            total += candy[i];
        }

        return total;
    }
}