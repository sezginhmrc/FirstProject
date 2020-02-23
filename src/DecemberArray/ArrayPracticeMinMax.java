package DecemberArray;

public class ArrayPracticeMinMax {
    public static void main(String[] args) {
        int[] nums = {1, 32, 45, 6, 7, 43};

        int max = nums[0];
        int min = nums[0];

        for (int i = 0; i < 6; i++) {
            if (nums[i] > max) {
                max = nums[i];
            }
            if (nums[i] < min) {
                min = nums[i];
            }

        }

        System.out.println(max);
        System.out.println(min);
    }
}


