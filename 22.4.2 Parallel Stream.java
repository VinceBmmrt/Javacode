
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

class Demo {
    public static void main(String[] args) {

        int size = 10000;
        List<Integer> nums = new ArrayList<>(size);

        Random ran = new Random();

        for (int i = 0; i < size; i++) {
            nums.add(ran.nextInt(100));
        }

        long startSeg = System.currentTimeMillis();

        int sum = nums.stream()
                .map(i -> i * 2)
                .reduce(0, (c, e) -> c + e);

        int sum2 = nums.stream().map(i -> {

            try {
                Thread.sleep(1);
            } catch (Exception e) {

            }

            return i * 2;
        })

                .map(i -> i * 2)
                .mapToInt(i -> i)
                .sum();

        long endSeg = System.currentTimeMillis();

        long startPara = System.currentTimeMillis();
        int sum3 = nums.parallelStream().map(i -> i * 2)
                .map(i -> {

                    try {
                        Thread.sleep(1);
                    } catch (Exception e) {

                    }

                    return i * 2;
                })
                .mapToInt(i -> i)
                .sum();
        long endPara = System.currentTimeMillis();

        System.out.println(sum2 + " " + sum3);
        System.out.println("seq : " + (endSeg - startSeg));
        System.out.println("parallel seq : " + (endPara - startPara));
    }
}