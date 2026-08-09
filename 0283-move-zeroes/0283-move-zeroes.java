class Solution {
    public void moveZeroes(int[] nums) {

        int index = 0;

        // Saare non-zero elements ko aage lao
        for (int i = 0; i < nums.length; i++) {

            if (nums[i] != 0) {
                nums[index] = nums[i];
                index++;
            }
        }

        // Remaining positions mein zero bhar do
        while (index < nums.length) {
            nums[index] = 0;
            index++;
        }
    }
}