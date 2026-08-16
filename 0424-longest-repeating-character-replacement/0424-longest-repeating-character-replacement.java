class Solution {

    public int characterReplacement(String s, int k) {

        int[] count = new int[26];

        int left = 0;
        int maxFrequency = 0;
        int answer = 0;

        for (int right = 0; right < s.length(); right++) {

            char ch = s.charAt(right);

            count[ch - 'A']++;

            maxFrequency = Math.max(
                maxFrequency,
                count[ch - 'A']
            );

            int windowLength = right - left + 1;

            int changesNeeded = windowLength - maxFrequency;

            if (changesNeeded > k) {
                count[s.charAt(left) - 'A']--;
                left++;
            }

            answer = Math.max(answer, right - left + 1);
        }

        return answer;
    }
}