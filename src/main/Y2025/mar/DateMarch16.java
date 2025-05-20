package main.Y2025.mar;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.function.Predicate;

public class DateMarch16 {
    public static String createPhoneNumber(int[] numbers) {
        StringBuilder str = new StringBuilder();
        for (int i = 0; i < numbers.length; i++) {
            if (i == 0) {
                str.append("(");
            } else if (i == 3) {
                str.append(") ");
            } else if (i == 6) {
                str.append("-");
            }
            str.append(numbers[i]);
        }
        return str.toString();
    }

    public static int[] arrayDiff(int[] a, int[] b) {

        return Arrays.stream(a)
                .filter(v -> Arrays.stream(b).noneMatch(w -> w == v))
                .toArray();
    }

    public static boolean isNarcissistic(int number) {
        ArrayList<Integer> numlist = new ArrayList<>();
        for (int i = number; i > 0; i /= 10) {
            numlist.add(i % 10);
        }

        var sum = numlist.stream()
                .map(v -> (int) Math.pow(v, numlist.size()))
                .reduce(Integer::sum).get();

        return sum == number;
    }

    public static int persistence(long n) {
        Predicate<Long> isSingleDigit = num -> num < 10;
        var num = n;
        var count = 0;
        while (!isSingleDigit.test(num)){
           var arr =  String.valueOf(num).toCharArray();
           long sum = 1;
           for (var i : arr) {
               sum *= Character.getNumericValue(i);
           }
           num = sum;
           count++;
        }
        return count;
    }

    public static int countPassengers(ArrayList<int[]> stops) {
        return stops.stream()
                .map((v) -> v[0] - v[1])
                .reduce(Integer::sum)
                .get();
    }

    public static boolean isPrime(int num) {

        if (num <= 1) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(num) ; i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }
}
