package beginner;/*
 * 배열 연습
 * 크기가 30인 정수형 배열 intArray 선언
 * 배열 1001, 1002, 1003, ..., 1029, 1030 대입
 * 크기가 4인 문자열형 배열 remainders를 만들어
 * "Zero", "One", "Two", "Three" 대입
 *
 * intArray 배열에 담긴 값을 4로 나눈 나머지를 인덱스로 생각하고
 * remainders 배열에서 그 인덱스에 위치한 단어 출력
 * */

public class ArrayPractice {
    public static void main(String[] args) {
        int[] intArray = new int[30];

        for (int i = 0; i < intArray.length; i++) {
            intArray[i] = 1001 + i;
        }

        String[] remainders = new String[]{"Zero", "One", "Two", "Three"};

        for (int num : intArray) {
            System.out.println(remainders[num % 4]);
        }
    }
}
