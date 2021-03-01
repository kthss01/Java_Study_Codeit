package oop;

public class Main {
    public static void main(String[] args) {
//        String[] strings = new String[5];
//        strings[0] = "Hello";
//        strings[2] = "";
//        strings[4] = "Java";
//
//        int countA = 0, countB = 0;
//        for (String str : strings) {
//            if (str != null && !str.isEmpty()) {
//                countA++;
//            } else {
//                countB++;
//            }
//        }
//        System.out.println(countB);

        // try-catch
        int[] smallArray = new int[3];

        for (int i = 0; i < 10; i++) {
            try {
                smallArray[i] = i;
            } catch (ArrayIndexOutOfBoundsException e) {
                System.out.println(i + "번 째 시도에서 예외 발생");
            }
        }

        // 결과 확인
        for (int i : smallArray) {
            System.out.println(i);
        }

    }
}
