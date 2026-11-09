import java.util.Random;

public class TwoArrays {

    public static void main(String[] args) {

        taskOne();
        taskTwo();
        taskThree();
        taskFour();

        int maxOfThree = TaskFive.maxOfThree(4, 7, 2);
        System.out.println("Task five max of three: " + maxOfThree);
        int greatestDivisor = TaskFive.greatestDivisor(8);
        System.out.println("Task five greatest divisor: " + greatestDivisor);

    }

    public static void taskOne() {

        int[][] squareArray = new int[8][8];
        Random rand = new Random();

        for (int i = 0; i < 8; i++) {
            for (int j = 0; j < 8; j++) {
                squareArray[i][j] = rand.nextInt(100);
                System.out.print(squareArray[i][j] + " ");
            }
            System.out.println();
        }

        int diagonalSum = 0;
        int antiDiagonalSum = 0;
        int col = 0;

        for (int row = 0; row < 8; row++) {
            System.out.println(squareArray[row][col]);
            diagonalSum += squareArray[row][col];
            col++;
        }

        col = 7;

        for (int row = 0; row < 8; row++) {
            System.out.println(squareArray[row][col]);
            antiDiagonalSum += squareArray[row][col];
            col--;
        }

        for (int i = 0; i < 8; i++) {
            for (int j = 0; j < 8; j++) {
                System.out.print(squareArray[i][j] + " ");
            }
            System.out.println();
        }

        System.out.println("Diagonal Sum: " + diagonalSum + " antiDiagonalSum: " + antiDiagonalSum + " Total: "
                + (diagonalSum + antiDiagonalSum));

    }

    public static void taskTwo() {
        int rows = 5;
        int cols = 8;

        Random rand = new Random();

        int[][] squareArray = new int[rows][cols];

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                squareArray[i][j] = rand.nextInt(100);
            }
        }

        int elementCount = 0;
        int sum = 0;

        for (int row = 0; row < rows; row++) {
            for (int col = 0; col < cols; col++) {
                sum += squareArray[row][col];
                elementCount += 1;
            }
        }

        double mean = (double) sum / elementCount;

        int nearestCol = 0;
        int nearestRow = 0;

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {

                double bestDistanceToMean = Math.abs(squareArray[nearestRow][nearestCol] - mean);
                double distanceToMean = Math.abs(squareArray[i][j] - mean);

                if (i == 0 && j == 0) {
                    nearestCol = 0;
                    nearestRow = 0;
                } else {
                    if (distanceToMean < bestDistanceToMean) {
                        nearestRow = i;
                        nearestCol = j;
                    }
                }
            }
        }

        System.out.println("================");

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                System.out.print(" " + squareArray[i][j]);
            }
            System.out.println();
        }

        System.out.println("Mean: " + mean + " Closest to mean: " + squareArray[nearestRow][nearestCol]
                + " At indexes: " + "[" + nearestRow + "] [" + nearestCol + "]");

    }

    public static void taskThree() {

        int cols = 4;
        int rows = 6;

        int i1 = 2;
        int i2 = 3;

        int[][] arr = new int[rows][cols];

        Random rand = new Random();

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                arr[i][j] = rand.nextInt(100);
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }

        int[] tmp = arr[i1];
        arr[i1] = arr[i2];
        arr[i2] = tmp;

        System.out.println("===============");
        System.out.println("After Swtiching Rows: ");

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }

    }

    public static void taskFour() {

        int[][] arr = {
                { 1, 3, 2 },
                { 3, 4, 8 },
                { 2, 6, 8 },
                { 1, 8, 5 }
        };

        int rows = arr.length;
        int cols = arr[0].length;

        int largestSumIndex = 0;
        int largestSum = Integer.MIN_VALUE;
        int smallestSumColumnIndex = 0;
        int smallestSum = Integer.MAX_VALUE;

        for (int i = 0; i < rows; i++) {
            int sum = 0;
            for (int j = 0; j < cols; j++) {
                sum += arr[i][j];
            }
            if (largestSum < sum) {
                largestSum = sum;
                largestSumIndex = i;
            }
        }

        for (int col = 0; col < cols; col++) {
            int sum = 0;
            for (int row = 0; row < rows; row++) {
                sum += arr[row][col];
            }
            if (sum < smallestSum) {
                smallestSum = sum;
                smallestSumColumnIndex = col;
            }
        }

        System.out.println("Task 4:");
        System.out.println("Largest Sum: " + largestSum + " At Row [" + largestSumIndex + "]");
        System.out.println("Smallest Sum: " + smallestSum + " At Column [" + smallestSumColumnIndex + "]");

    }

    public static class TaskFive {

        static int maxOfThree(int a, int b, int c) {
            if (a > b && a > c) {
                return a;
            } else if (b > a && b > c) {
                return b;
            } else {
                return c;
            }
        }

        static int greatestDivisor(int n) {

            int gDivisor = n - 1;

            while (gDivisor != 0) {
                if (n % gDivisor == 0) {
                    break;
                }
                gDivisor--;
            }
            return gDivisor;
        }

    }

}
