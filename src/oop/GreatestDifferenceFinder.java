package oop;

import java.util.Arrays;

public class GreatestDifferenceFinder {
    int greatestDifference(int[] intArray) {
//        int answer = 0;
//
//        if (intArray.length < 2)
//            return answer;
//
//        for (int i = 0; i < intArray.length; i++) {
//            for (int j = 0; j < intArray.length - 1; j++) {
//                if (i == j) continue;
//                int dif = Math.abs(intArray[i] - intArray[j]);
//                answer = Math.max(dif, answer);
//            }
//        }
//
//        return answer;

        if (intArray.length < 2)
            return 0;

        return Arrays.stream(intArray).max().getAsInt()
                - Arrays.stream(intArray).min().getAsInt();
    }

    public static void main(String[] args) {
        GreatestDifferenceFinder finder = new GreatestDifferenceFinder();

        // 테스트 1
        int[] testArray1 = {-2, 7, 3};
        System.out.println(finder.greatestDifference(testArray1));

        // 테스트 2
        int[] testArray2 = {8, 3, 14, 1};
        System.out.println(finder.greatestDifference(testArray2));

        // 테스트 3
        int[] testArray3 = {4, 2, 3, 1};
        System.out.println(finder.greatestDifference(testArray3));

        // 테스트 4
        int[] testArray4 = {};
        System.out.println(finder.greatestDifference(testArray4));

        // 테스트 5
        int[] testArray5 = {1, 2, -3, 4, 5};
        System.out.println(finder.greatestDifference(testArray5));

        // 테스트 6
        int[] testArray6 = {1};
        System.out.println(finder.greatestDifference(testArray6));
    }
}
