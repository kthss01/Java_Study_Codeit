package oop;

import java.util.Scanner;

public class IntroduceCodeit {
    Scanner sc;
    String input;

    public IntroduceCodeit() {
        sc = new Scanner(System.in);
        compute();
    }

    public void compute() {
        while(mainMenu());
    }

    public boolean mainMenu() {
        System.out.println("(I)ntro (C)ourses (E)xit");

        input = sc.next();
        switch (input) {
            case "I":
            case "i":
                System.out.println("안녕하세요! 우리는 코드잇입니다.");
                System.out.println("함께 공부합시다!");
                break;

            case "C":
            case "c":
                while(introduceCourse());
                break;

            case "E":
            case "e":
                System.out.println("안녕히 가세요");
                return false;

            default:
                System.out.println("다시 입력해 주세요.");
                break;
        }

        return true;
    }

    public boolean introduceCourse() {
        System.out.println("코드잇 수업을 소개합니다.");
        System.out.println("(P)ython (J)ava (i)OS (B)ack");

        input = sc.next();
        switch (input) {
            case "P":
            case "p":
                introducePython();
                break;

            case "J":
            case "j":
                introuceJava();
                break;

            case "I":
            case "i":
                introduceiOS();
                break;

            case "B":
            case "b":
                return false;

            default:
                System.out.println("다시 입력해 주세요.");
                break;
        }

        return true;
    }

    public void introducePython() {
        System.out.println("Python 언어를 통해 컴퓨터 사이언스의 기초를 배웁니다.");
        System.out.println("강사: 강영훈");
        System.out.println("추천 선수과목: 없음");
    }

    public void introuceJava(){
        System.out.println("Java의 기본 문법과 객체지향적 프로그래밍을 배웁니다.");
        System.out.println("강사: 김신의");
        System.out.println("추천 선수과목: Python");
    }

    public void introduceiOS() {
        System.out.println("최신 Swift 언어를 통해 iOS 개발을 시작할 수 있습니다.");
        System.out.println("강사: 성태호");
        System.out.println("추천 선수과목: Python, Java");
    }

    public static void main(String[] args) {
//        System.out.println("나이가 어떻게 되시나요?? ");
//
//        Scanner scanner = new Scanner(System.in);
//
//        int age = scanner.nextInt();
//
//        System.out.println("이름이 어떻게 되시나요?? ");
//        String name = scanner.next();
//
//        System.out.println(name + "의 나이는 " + age);
//
//        scanner.close();

        new IntroduceCodeit();
    }
}
