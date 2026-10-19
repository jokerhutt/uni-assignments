
public class Binary {

    public static void main(String[] args) {

        printPrettyBinary(0);
        printPrettyBinary(32);
        printPrettyBinary(79);
        printPrettyBinary(167);
        printPrettyBinary(2043);
        printPrettyBinary(400);

    }

    static void printPrettyBinary(int n) {
        String bits = convertToBinary(n);
        System.out.println(n + " in binary is: " + bits);
    }

    static String convertToBinary(int n) {

        String bits = "";

        if (n == 0) {
            return "0";
        }

        while (n > 0) {

            bits = (n % 2) + bits;
            n = n / 2;

        }

        return bits;

    }

}
