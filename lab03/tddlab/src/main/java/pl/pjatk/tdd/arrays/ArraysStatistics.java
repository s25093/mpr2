package pl.pjatk.tdd.arrays;

public class ArraysStatistics {
    public static int max(int[] numbers){
        int max = numbers[0];
        for (int number: numbers) {
            if (number > max) {
                max = number;
            }
        }
        return max;
    }

    public static int min(int[] numbers){
        int min = max(numbers);
        for (int number: numbers) {
            if (number < min) {
                min = number;
            }
        }
        return min;
    }

    public static double avg(int[] numbers){
        double sum = 0;
        for (int number: numbers) {
            sum += number;
        }
        return sum / numbers.length;
    }

    public static int sum(int[] numbers){
        int sum = 0;
        for (int number: numbers) {
            sum += number;
        }
        return sum;
    }
}
