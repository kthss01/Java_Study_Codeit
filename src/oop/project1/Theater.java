package oop.project1;

public class Theater {
    private Seat[][] seats;
    private int rowCount, colCount;

    public Theater(int rowCount, int colCount) {
        // 알파벳은 26개만 존재해서
        rowCount = Math.min(rowCount, 26);

        this.rowCount = rowCount;
        this.colCount = colCount;

        seats = new Seat[rowCount][colCount];

        for (int i = 0; i < rowCount; i++) {
            for (int j = 0; j < colCount; j++) {
                seats[i][j] = new Seat();
            }
        }
    }

    public boolean reserve(String name, char rowChar, int col, int numSeat) {
        int row = getRowIndex(rowChar);
        col -= 1; // 1열부터 시작해서

        // 존재하지 않는 행 또는 열 입력한 경우
        if (row < 0 || row >= rowCount || col < 0 || col >= colCount)
            return false;

        // 예약한 좌석이 열보다 큰 경우
        if (col + numSeat > colCount)
            return false;

        // 이미 예약된 경우
        for (int i = 0; i < numSeat; i++) {
            if (seats[row][col + i].isOccupied())
                return false;
        }

        // 예약
        for (int i = 0; i < numSeat; i++) {
            seats[row][col + i].reserve(name);
        }

        return true;
    }

    public int cancel(String name) {
        int canceledCount = 0;

        for (int i = 0; i < rowCount; i++) {
            for (int j = 0; j < colCount; j++) {
                if (seats[i][j].match(name)) {
                    seats[i][j].cancel();
                    canceledCount++;
                }
            }
        }

        return canceledCount;
    }

    public int cancel(char rowChar, int col, int numSeat) {
        int row = getRowIndex(rowChar);
        col -= 1; // 1열부터 시작해서

        if (row < 0 || row >= rowCount || col < 0 || col >= colCount)
            return 0;

        // 범위를 벗어나면 범위 재설정
        if (col + numSeat > colCount) {
            numSeat = col + numSeat - colCount;
        }

        int canceledCount = 0;

        for (int i = 0; i < numSeat; i++) {
            if (seats[row][col + i].isOccupied()) {
                seats[row][col + i].cancel();
                canceledCount++;
            }
        }

        return canceledCount;
    }


    public int getNumberOfReservedSeat() {
        int canceledCount = 0;

        for (int i = 0; i < rowCount; i++) {
            for (int j = 0; j < colCount; j++) {
                if (seats[i][j].isOccupied())
                    canceledCount++;
            }
        }

        return canceledCount;
    }

    public void printSeatMatrix() {
        System.out.print("  ");
        for (int i = 1; i <= 9; i++) {
            System.out.print("  " + i);
        }
        System.out.println();

        for (int i = 0; i < rowCount; i++) {
            System.out.print((char) ('A' + i) + ": ");
            for (int j = 0; j < colCount; j++) {
                Seat s = seats[i][j];
                if (s.isOccupied()) {
                    System.out.print("[O]");
                } else {
                    System.out.print("[ ]");
                }
            }
            System.out.println();
        }
    }

    private int getRowIndex(char uppercaseChar) {
        return uppercaseChar - 'A';
    }
}
