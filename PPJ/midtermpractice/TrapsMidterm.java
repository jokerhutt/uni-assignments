
class TrapsMidterm {

    public static void main(String[] args) {

        taskOne();
        taskTwo();
        taskThree();
        taskFour();
        taskFive();
        taskSix();
        taskSeven();
        taskEight();
        taskNine();
        taskTen();
        taskEleven();
        taskTwelve();
        taskThirteen();
        taskFourteen();

        int[] original = { 1, 2, 3, 4, 5 };
        reverse(original);

        taskSixteen();

    }

    static void taskOne() {

        System.out.println("== START OF TASK 1 ==");
        byte a = 40, b = 50;
        byte sum = (byte) (a + b); // ensure its casting ()

        System.out.println(sum);
        System.out.println("== END OF TASK 1 ==");

    }

    static void taskTwo() {
        System.out.println("== START OF TASK 2 ==");

        int x = 2, y = 1;
        if (false || (x > y)) // true
            System.out.println(x = 1); // x = 1 prints 1
        else
            System.out.println(x == 2); // doesnt run
        System.out.println(x + y); // outside conditionals, 1+1 = 2
        System.out.println("== END OF TASK 2 ==");

    }

    static void taskThree() {

        System.out.println("== START OF TASK 3 ==");
        int i = 10;
        i = i++; // still 10
        i = ++i; // 11
        i = i++ + ++i; // 11 + 12
        System.out.println(i);
        System.out.println("== END OF TASK 3 ==");

    }

    static void taskFour() {
        System.out.println("== START OF TASK 4 ==");

        int k = 987654321;

        String s = "";

        while (k != 0) {
            int digit = k % 10;
            s = s + digit;
            k = k / 10;
        }

        // digit = 1
        // s = 1
        // k = 98765432
        // ====
        // digit = 2
        // s = 12
        // k = 987643
        // ====
        // digit = 3
        // s = 123
        // k = 987654
        // ====
        // digit = 4
        // s = 1234
        // k = 98765
        // ====
        // digit = 5
        // s = 12345
        // k = 9876
        // ====
        // digit = 6
        // s = 123456
        // k = 987
        // ====
        // digit = 7
        // s = 1234567
        // k = 98
        // ====
        // digit = 8
        // s = 12345678
        // k = 9
        // ====
        // digit = 9
        // s = 123456789
        // k = 0

        System.out.println(s); // 123456789
        System.out.println("== END OF TASK 4 ==");

    }

    static void taskFive() {
        System.out.println("== START OF TASK 5 ==");

        boolean x = true, z = true;
        int y = 0x14; // 16+4 = 20
        x = (y != 10) || (z = false); // z = false doesnt run since first condition false
        System.out.println(x + ", " + y + ", " + z); // true, 20, true
        System.out.println("== END OF TASK 5 ==");

    }

    static void taskSix() {
        System.out.println("== START OF TASK 6 ==");

        int x = 0;
        while (x++ < 10) {
        } // 0 1 2 3 4 5 6 7 8 9 10 != 10 ++ so 11
        String msg = x > 10 ? "Bigger than" : "false"; // 11 > 10 = "Bigger than"
        System.out.println(msg + ", " + x); // Bigger than, 11

        System.out.println("== END OF TASK 6 ==");
    }

    static void taskSeven() {

        System.out.println("== START OF TASK 7 ==");

        boolean execute = true;
        int res = 15, i = 10;
        do {
            i--;
            if (i == 6)
                execute = false;
            res -= 2;
        } while (execute);

        // i = 9, res = 13
        // i = 8, res = 11
        // i = 7, res = 9
        // i = 6, res = 7
        // break

        System.out.println(res); // 7

        System.out.println("== END OF TASK 7 ==");

    }

    static void taskEight() {
        System.out.println("== START OF TASK 8 ==");

        for (int i = 0; i < 3; i++)
            for (int j = i; j < 3; j++)
                System.out.println((j - i) << 1 + (i | j));
        // i = 0; j = 0; (0-0) << (1 + 0 | 0) = 0 << 1 = 0
        // i = 0; j = 1; (1-0) << (1 + 0 | 1) = 1 << 2 = 4
        // i = 0; j = 2; (2-0) << (1 + 0 | 2) = 2 << 3 = 16

        // i = 1; j = 1; (1-1) << (1 + 1 | 1) = 0 << 2 = 0
        // i = 1; j = 2; (2-1) << (1 + 1 | 2) = 1 << 4 = 16
        // i = 2; j = 2; (2-2) << (1 + 2 | 2) = 0 << 3 = 0
        System.out.println("== END OF TASK 8 ==");

    }

    static void taskNine() {
        System.out.println("== START OF TASK 9 ==");

        int[] arr = { 2, 2, 1, 3 };
        boolean res = true;
        for (int i = 0; i < arr.length - 1 && res; i++)
            res = (arr[i + 1] != arr[i]);

        // i = 0; i < 3 && true; res = false
        // i = 1; i < 3 && false
        // false

        System.out.println(res);
        System.out.println("== END OF TASK 9 ==");

    }

    static void taskTen() {
        System.out.println("== START OF TASK 10 ==");

        int n = 4;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if ((i + j) % 2 == 0 || i < j) {
                    System.out.println("x");
                } else {
                    System.out.println("y");
                }
            }
        }

        // i = 0; j = 0; (0 % 2 == 0) x
        // i = 0; j = 1; (0 < 1) x
        // i = 0; j = 2; (0 < 2) x
        // i = 0; j = 3; (0 < 3) x
        //
        // i = 1; j = 0; ((1 % 2 == 1) || (1 < 0)) false = y
        // i = 1; j = 1; ((2 % 2 == 0)) x
        // i = 1; j = 2; (1 < 2) x
        // i = 1; j = 3; (1 < 3) x
        //
        // i = 2; j = 0; (2 % 2 == 0) x
        // i = 2; j = 1; (3 % 2 != 0) || (2 < 1) false = y
        // i = 2; j = 2; (4 % 2 == 0) x
        // i = 2; j = 3; (2 < 3) false = x
        //
        // i = 3; j = 0; (3 % 0 != 0) || (3 < 0) false = y
        // i = 3; j = 1; (4 % 2 == 0) x
        // i = 3; j = 2; (5 % 2 != 0) || (3 < 2) false = y
        // i = 3; j = 3; (6 % 2 == 0) x
        //
        // Answer: xxxxyxxxxyxxyxyx

        System.out.println();
        System.out.println("== END OF TASK 10 ==");
    }

    static void taskEleven() {
        System.out.println("== START OF TASK 11 ==");

        int[] arr = { -1, -2, 3, 4 };
        int s = arr[0];
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                s = s + arr[j];
                if (j == 2 * i) {
                    continue;
                }
                if (s > arr[j]) {
                    break;
                } else {
                    s -= arr[i];
                }
            }
        }

        // i = 0; j = 1; s = -1
        // i = 0; j = 1; s = -3 (-1 + -2)
        // (1 != 0); (-3 !> -2); s = -2 (-3 - -1)
        //
        // i = 0; j = 2; s = -2
        // i = 0; j = 2; s = 1 (-2 + 3)
        // (2 != 0); (1 !> 3); s = 2 (1 - -1)
        //
        // i = 0; j = 3; s = 2
        // i = 0; j = 3; s = 6 (2 + 4)
        // (3 != 0); (6 > 4) break;
        //
        // i = 1; j = 2; s = 6
        // i = 1; j = 2; s = 9 (6 + 3)
        // (2 == 2) continue
        //
        // i = 1; j = 3; s = 9
        // i = 1; j = 3; s = 13 (9 + 4)
        // (3 != 2); (13 > 4) break;
        //
        // i = 2; j = 3; s = 13;
        // i = 2; j = 3; s = 17 (13 + 4)
        // (3 != 4); (17 > 4) break;

        System.out.println("s = " + s);
        System.out.println("== END OF TASK 11 ==");

    }

    static void taskTwelve() {
        System.out.println("== START OF TASK 12 ==");

        int arr[] = { 2, 4, 5, 6, 8, 10, 12 };

        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                int a = arr[i];
                int b = arr[j];

                if ((b != 0 && a % b == 0) || (a != 0 && b % a == 0)) {
                    System.out.println(a + " and " + b);
                }
            }
        }
        System.out.println("== END OF TASK 12 ==");

    }

    static void taskThirteen() {

        System.out.println("== START OF TASK 13 ==");

        int[] arr = { 2, 3, 4, 3, 2, 6, 3, 6, 8, 2, 9 };
        int count = 0;

        for (int i = 0; i < arr.length; i++) {

            boolean foundLater = false;
            int value = arr[i];

            for (int j = i + 1; j < arr.length; j++) {
                if (arr[j] == arr[i]) {
                    foundLater = true;
                    break;
                }
            }

            if (!foundLater) {
                foundLater = false;
                System.out.print(value + ", ");
                count++;
            }

        }
        System.out.println();

        System.out.println("There were " + count + " different elements");

        System.out.println("== END OF TASK 13 ==");

    }

    static void taskFourteen() {
        System.out.println("== START OF TASK 14 ==");

        int[] arr = { 1, 5, 8, 2, 6 };

        int maxNumber = 0;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] >= maxNumber) {
                maxNumber = arr[i];
            }
        }

        for (int i = 0; i < maxNumber; i++) {
            for (int j = 0; j < arr.length; j++) {
                if (arr[j] >= maxNumber - i) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }

        System.out.println("== END OF TASK 14 ==");
    }

    static int[] reverse(int[] original) {
        System.out.println("== START OF TASK 15 ==");

        int[] result = new int[original.length];

        for (int i = 0; i < original.length; i++) {
            result[i] = original[original.length - 1 - i];
        }

        System.out.print("Original: ");
        for (int i = 0; i < original.length; i++) {
            System.out.print(original[i] + ", ");
        }

        System.out.println();

        System.out.print("Reversed: ");
        for (int i = 0; i < original.length; i++) {
            System.out.print(result[i] + ", ");
        }
        System.out.println();

        System.out.println("== END OF TASK 15 ==");

        return result;

    }

    static void taskSixteen() {
        System.out.println("== START OF TASK 16 ==");

        int[] original = { 1, 7, 4, 8, 10 };
        System.out.println();
        System.out.print("Before: ");
        for (int i = 0; i < original.length; i++) {
            System.out.print(original[i] + ", ");
        }
        System.out.println();

        int maxIndex = 0;
        int minIndex = 0;

        for (int i = 0; i < original.length; i++) {
            if (original[i] >= original[maxIndex]) {
                maxIndex = i;
            }
            if (original[i] <= original[minIndex]) {
                minIndex = i;
            }
        }

        int minValue = original[minIndex];
        int maxValue = original[maxIndex];
        original[minIndex] = maxValue;
        original[maxIndex] = minValue;

        System.out.print("After: ");
        for (int i = 0; i < original.length; i++) {
            System.out.print(original[i] + ", ");
        }

        System.out.println();
        System.out.println("== END OF TASK 16 ==");

    }

}
