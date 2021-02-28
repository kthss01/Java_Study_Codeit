package oop;

public class ShapePrinter {
    public void printTriangle(int height) {
        for (int i = 0; i < height; i++) {
            for (int j = 0; j < i + 1; j++) {
                System.out.print("* ");
            }
            System.out.println("");
        }
    }

    public void printPyramid(int height) {
        int starCnt = 1;
        int leftBlankCnt = height - 1;

        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < height; i++) {
            // left blank
            for (int j = 0; j < leftBlankCnt; j++) {
                sb.append(" ");
            }
            // star
            for (int j = 0; j < starCnt; j++) {
                sb.append("*");
            }
            leftBlankCnt--;
            starCnt += 2;
            if (i != height - 1)
                sb.append("\n");
        }

        System.out.println(sb);
    }

    public void printFloydsPyramid(int height) {
        StringBuilder sb = new StringBuilder();
        int number = 1;

        int maxPaddingLen = String.valueOf(height * (height + 1) / 2).length();

        for (int i = 1; i <= height; i++) {

            // number
            for (int j = 0; j < i; j++) {
                int curPaddingLen = String.valueOf(number).length();
                // padding
                for (int k = 0; k < maxPaddingLen - curPaddingLen; k++) {
                    sb.append(" ");
                }

                sb.append(number++ + " ");
            }
            sb.append("\n");
        }

        System.out.println(sb);
    }

    public static void main(String[] args) {
        ShapePrinter printer = new ShapePrinter();

//        // 테스트
//        printer.printTriangle(3);
//        System.out.println("----------");
//        printer.printTriangle(5);
//        System.out.println("----------");
//        printer.printTriangle(10);

//        // 테스트
//        printer.printPyramid(3);
//        System.out.println("----------");
//        printer.printPyramid(5);
//        System.out.println("----------");
//        printer.printPyramid(10);

        // 테스트
        printer.printFloydsPyramid(3);
        System.out.println("----------");
        printer.printFloydsPyramid(5);
        System.out.println("----------");
        printer.printFloydsPyramid(15);
    }
}
