/*
* switch문 연습
*
* 정수 134354를 7로 나눈 나머지를 영어로 출력
* 나머지가 0이면 Zero
* 1 One
* 2 Two
* 6 Six
* */

public class SwitchStatementPractice {
    public static void main(String[] args) {
        int number = 134354;

        int remainder = number % 7;
        String answer = "";

        switch (remainder) {
            case 0:
                answer = "Zero";
                break;
            case 1:
                answer = "One";
                break;
            case 2:
                answer = "Two";
                break;
            case 3:
                answer = "Three";
                break;
            case 4:
                answer = "Four";
                break;
            case 5:
                answer = "Five";
                break;
            case 6:
                answer = "Six";
                break;
        }

        System.out.println(answer);
    }
}
