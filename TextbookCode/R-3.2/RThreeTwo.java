import java.util.Random;

public class RThreeTwo<E> {
    public static void main(String[] args) {
        Integer[] nums = new Integer[5];
        nums[0] = 5;
        nums[1] = 6;
        nums[2] = 7;
        nums[3] = 8;
        nums[4] = 9;

        Random rand = new Random();

        System.out.println(isNull(nums));
        System.out.println();

        randomDelete(nums, rand);

        System.out.println(isNull(nums));
    }

    public static <E> void randomDelete(E[] arr, Random random) {
        while (!isNull(arr)) {
            int index = random.nextInt(arr.length);
            arr[index] = null;
        }
    }

    public static <E>boolean isNull(E[] arr) {
        boolean result = true;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != null) {
                result = false;
            }
        }
        
        return result;
    }
}