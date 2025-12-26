import java.util.ArrayList;

class MoveZeros {
    public void moveZeroes(int[] nums) {

        ArrayList<Integer> al = new ArrayList<>();

        // add non-zero elements
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != 0) {
                al.add(nums[i]);
            }
        }

        // add zero elements
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 0) {
                al.add(nums[i]);
            }
        }

        // copy back to nums array
        for (int i = 0; i < nums.length; i++) {
            nums[i] = al.get(i);
        }

        System.out.print(Arrays.toString(nums));
    }
}
