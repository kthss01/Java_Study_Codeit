package oop;

/*
    김신 장군 살리기
    n명의 군사들이 동그랗게 서있고, 한 명씩 세어 나가서 매 k번째 사람이 죽기로 함
    ex)
        8명의 군사들이 있고 3명마다 죽기로하면
        3 6 1 5 2 8 4 7 순으로 죽음

    장군이 마지막으로 죽기를 원할 때
    파라미터 정수 n과 정수 k를 받고
    장군이 마지막까지 살기 위해 서있어야할 자리(int)를 리턴해주는
    메소드 getSurvivingIndex를 구하기
 */

import java.util.ArrayList;

public class SurvivingGeneral {

    public static int getSurvivingIndex(int n, int k) {
        ArrayList<Integer> soldiers = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            soldiers.add(i + 1);
        }

        int pos = 0;
        for (int i = 0; i < n - 1; i++) {
            pos = (pos + k - 1) % soldiers.size();
            System.out.printf("%d번 군사가 죽습니다.\n", soldiers.get(pos));
            soldiers.remove(pos);
        }

        return soldiers.get(0);
    }

    public static void main(String[] args) {
        System.out.println("김신은 " + getSurvivingIndex(20, 5) + "번 자리에 서있으면 됩니다.");
    }
}
