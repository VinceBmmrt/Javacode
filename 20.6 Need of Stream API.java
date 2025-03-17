import java.util.Arrays;
import java.util.List;

class Demo {
    public static void main(String a[]) {
        List<Integer> nums = Arrays.asList(4, 5, 7, 3, 2, 6);

        for (int i = 0; i < nums.size(); i++) {
            System.err.println(nums.get(i));
        }

        nums.forEach(n -> System.out.println(n));

        // int sum = 0;
        // for (int n : nums)

        // {
        // if (n % 2 == 0) {
        // n = n * 2;
        // sum = sum + n;
        // }
        // }

        // System.out.println(sum);
    }

}