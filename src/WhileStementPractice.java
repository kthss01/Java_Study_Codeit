/*
* while문 연습
*
* 10000 미만의 정수 중에서, 153의 배수 중 가장 큰 값 찾기
* */

public class WhileStementPractice {
    public static void main(String[] args) {
        int number = 10000;
        int key = 153;

        while (number > 0) {
            int answer = number % key;

            if (answer == 0) {
                System.out.println(number);
                break;
            }

            number--;
        }
    }
}
