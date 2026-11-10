import java.util.Random;
import java.util.Scanner;

public class MockExam {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        Random rand = new Random();

        int arrayLength = scanner.nextInt();
        System.out.println("You have chosen: " + arrayLength + " as the size of the array");

        int[] arr = new int[arrayLength];

        System.out.println("===========");
        System.out.print("[");
        for (int i = 0; i < arrayLength; i++) {
            arr[i] = rand.nextInt(-20, 21);
            System.out.print(arr[i] + " ");
        }
        System.out.print("]");
        System.out.println("\n ===========");

        int bestStartIndex = 0;
        int bestEndIndex = 0;

        int startIndex = 0;
        int endIndex = 0;

        int prev = 0;

        boolean increasing = true;

        for (int i = 0; i < arrayLength; i++) {

            if (i == 0) {
                prev = arr[i];
            } else {

                boolean isUnbroken = increasing ? (arr[i] > prev) : (arr[i] < prev);
                if (isUnbroken) {
                    endIndex = i;

                    if ((Math.abs(startIndex - endIndex)) > (Math.abs(bestStartIndex - bestEndIndex))) {
                        bestStartIndex = startIndex;
                        bestEndIndex = endIndex;
                    }

                    increasing = !increasing;
                } else {
                    if (arr[i] != prev) {
                        startIndex = i - 1;
                    } else {
                        startIndex = i;
                    }
                    endIndex = i;
                }

                prev = arr[i];

            }

        }

        int max = Math.abs(bestEndIndex - bestStartIndex);

        startIndex = 0;
        endIndex = 0;
        prev = 0;

        increasing = true;

        // Second pass
        for (int i = 0; i < arrayLength; i++) {
            if (i == 0) {
                prev = arr[i];
            } else {

                boolean isUnbroken = increasing ? (arr[i] > prev) : (arr[i] < prev);

                if (isUnbroken) {
                    endIndex = i;
                    increasing = !increasing;

                } else {
                    if ((Math.abs(startIndex - endIndex)) == max) {
                        System.out.println("========");
                        System.out.print("Fragment: ");
                        for (int j = startIndex; j <= endIndex; j++) {
                            System.out.print(arr[j] + ", ");
                        }
                        System.out.println("\n Length: " + (Math.abs(endIndex - startIndex + 1)));
                        System.out.println("Start Index: " + startIndex);
                        System.out.println("End Index: " + endIndex);
                        System.out.println("========");
                    }
                    if (arr[i] != prev) {
                        startIndex = i - 1;
                    } else {
                        startIndex = i;
                    }
                    endIndex = i;
                }
                prev = arr[i];
            }
        }

    }

}
