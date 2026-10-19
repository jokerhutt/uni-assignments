
// Bitwise Operator -> AND& OR |

public class Bitwise {

    public static String stringByte(byte b) {
        return String.format("%8s", Integer.toBinaryString(b & 0xFF)).replace(' ', '0');
    }

    public static void main(String[] args) {

        int a = 25; // 1 1 0 0 1
        int b = 15; // 0 1 1 1 1

        // 0 1 0 0 1
        int c = a & b;
        System.out.println(Integer.toBinaryString(c));

        // 1 1 1 1 1
        int d = a | b;
        System.out.println(Integer.toBinaryString(d));

        int x = 8; // 1 0 0 0
        int y = x << 2; // 1 0 0 0 0 0
        System.out.println(Integer.toBinaryString(y));

        int z = x >> 2; // 0 0 1 0
        System.out.println(Integer.toBinaryString(z));

        int uz = x >>> 2; // 1 1 1 0
        System.out.println(Integer.toBinaryString(uz));

        // -128
        byte ba = (byte) 0b1000_0000;
        System.out.println(ba);

        // - 127
        byte bb = (byte) 0b1000_0001;
        System.out.println(bb);

        // - 125
        byte bc = (byte) 0b1000_0011;
        System.out.println(bc);

        // GETTING -2

        System.out.println("===========");

        byte bd = (byte) 0b0000_0010; // 2
        System.out.println("Original: " + bd + " : " + stringByte(bd));
        byte bdTmp = (byte) 0b1111_1111;
        byte bdFlipped = (byte) (bd ^ bdTmp); // -3
        System.out.println("Flipped: " + bdFlipped + " : " + stringByte(bdFlipped));

        byte bdFlippedNeg = (byte) (bdFlipped + 0b1); // -3 + 1 = -2
        System.out.println("Negative: " + bdFlippedNeg + " : " + stringByte(bdFlippedNeg));

        System.out.println("===========");

        // GETTING -127
        byte be = (byte) 0b0111_1111;
        System.out.println("Original: " + be + " : " + stringByte(be));
        byte beTmp = (byte) 0b1111_1111;
        byte beFlipped = (byte) (be ^ beTmp);
        System.out.println("FLipped: " + beFlipped + " : " + stringByte(beFlipped)); // -128

        byte beFlippedNeg = (byte) (beFlipped + 0b1); // -128 + 1 = -127
        System.out.println("Negative: " + beFlippedNeg + " : " + stringByte(beFlippedNeg));

        System.out.println("===========");

        // GETTING -66
        byte bf = (byte) 0b0100_0010; // 66
        System.out.println("Original: " + bf + " : " + stringByte(bf));
        byte bfTmp = (byte) 0b1111_1111;
        byte bfFlipped = (byte) (bf ^ bfTmp);
        System.out.println("Flipped: " + bfFlipped + " : " + stringByte(bfFlipped));
        byte bfFlippedNeg = (byte) (bfFlipped + 0b1);
        System.out.println("Negative: " + bfFlippedNeg + " : " + stringByte(bfFlippedNeg));

        System.out.println("===========");

        // GETTING -80

        // 80 / 2 = 40 : 0
        // 40 / 2 = 20 : 0
        // 20 / 2 = 10 : 0
        // 10 / 2 = 5 : 0
        // 5 / 2 = 2 : 1
        // 2 / 2 = 1 : 0
        // 1 / 2 = 0 : 1
        // 80 = 0101_0000
        byte bg = (byte) 0b0101_0000;
        System.out.println("Original: " + bg + " : " + stringByte(bg));
        byte bgTmp = (byte) 0b1111_1111;
        byte bgFlipped = (byte) (bg ^ bgTmp);
        System.out.println("Flipped: " + bgFlipped + " : " + stringByte(bgFlipped));

        byte bgFlippedNeg = (byte) (bgFlipped + 0b1);
        System.out.println("Negative: " + bgFlippedNeg + " : " + stringByte(bgFlippedNeg));

        System.out.println("===========");

        // GETTING -97
        // 97 / 2 = 48 : 1
        // 48 / 2 = 24 : 0
        // 24 / 2 = 12 : 0
        // 12 / 2 = 6 : 0
        // 6 / 2 = 3 : 0
        // 3 / 2 = 1 : 1
        // 1 / 2 = 0 : 1
        // 97 = 0110_0001
        byte bh = (byte) 0b0110_0001;
        byte bhTmp = (byte) 0b1111_1111;
        System.out.println("Original: " + bh + " : " + stringByte(bh));
        byte bhFlipped = (byte) (bh ^ bhTmp);
        System.out.println("Flipped: " + bhFlipped + " : " + stringByte(bhFlipped));
        byte bhFlippedNeg = (byte) (bhFlipped + 0b1);
        System.out.println("Negative: " + bhFlippedNeg + " : " + stringByte(bhFlippedNeg));

        // Unflip it
        byte bhUnflippedTmp = (byte) (bhFlippedNeg - 0b1);
        byte bhUnflipped = (byte) (bhUnflippedTmp ^ bhTmp);
        System.out.println("Unflipped: " + bhUnflipped + " : " + stringByte(bhUnflipped));

    }

}
