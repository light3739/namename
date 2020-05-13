package by.training.task2.file;

import java.util.Arrays;

public class Median {

    public static float median(int[] array) {
        return (float) median(Arrays.stream(array).asDoubleStream().toArray());
    }

    public static double median(double[] array) {
        Arrays.sort(array);
        int middle = array.length / 2;
        if (array.length % 2 == 0) {
            double left = array[middle - 1];
            double right = array[middle];
            return (left + right) / 2;
        } else {
            return array[middle];
        }
    }


}
