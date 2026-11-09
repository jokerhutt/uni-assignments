
public class BitwiseHomework {

    public static void main(String[] args) {

        // q1: make all print same value

        // == A ==
        int n1d = 23;

        // 23 / 2 = 11 : 1
        // 11 / 2 = 5 : 1
        // 5 / 2 = 2 : 1
        // 2 / 2 = 1 : 0
        // 1 / 2 = 0 : 1
        int n1b = 0b0001_0111;

        // 23 / 8 = 2 : 7
        // 2 / 8 = 0 : 2
        int n1o = 027;

        // 23 / 16 = 1 : 7
        // 1 / 16 = 0 : 1
        int n1x = 0x17;

        System.out.println(n1d + " " + n1b + " " + n1o + " " + n1x);

        // == B ==
        int n2d = 188;

        // 188 / 2 = 94 : 0
        // 94 / 2 = 47 : 0
        // 47 / 2 = 23 : 1
        // 23 / 2 = 11 : 1
        // 11 / 2 = 5 : 1
        // 5 / 2 = 2 : 1
        // 2 / 2 = 1 : 0
        // 1 / 0 = 0 : 1
        int n2b = 0b1011_1100;

        // 188 / 8 = 23 : 4
        // 23 / 8 = 2 : 7
        // 2 / 8 = 0 : 2
        int n2o = 0274;

        // 188 / 16 = 11(B) : 12(C)
        // 11 / 16 = 0 : 11(B)
        int n2x = 0xBC;

        System.out.println(n2d + " " + n2b + " " + n2o + " " + n2x);

        // == C ==
        int n3d = 599;

        // 599 / 2 = 299 : 1
        // 299 / 2 = 149 : 1
        // 149 / 2 = 74 : 1
        // 74 / 2 = 37 : 0
        // 37 / 2 = 18 : 1
        // 18 / 2 = 9 : 0
        // 9 / 2 = 4 : 1
        // 4 / 2 = 2 : 0
        // 2 / 2 = 1 : 0
        // 1 / 2 = 0 : 1
        int n3b = 0b0010_0101_0111;

        // 599 / 8 = 74 : 7
        // 74 / 8 = 9 : 2
        // 9 / 8 = 1 : 1
        // 1 / 8 = 0 : 1
        int n3o = 01127;

        // 599 / 16 = 37 : 7
        // 37 / 16 = 2 : 5
        // 2 / 16 = 0 : 2
        int n3x = 0x257;

        System.out.println(n3d + " " + n3b + " " + n3o + " " + n3x);

        // q2: predict result of bitwise op

        System.out.println("10 & 1 = " + (10 & 1));

        // 101
        // &011
        System.out.println("5 & 3 = " + (5 & 3) + " : 001 (1)");

        // 1100
        // |0101
        System.out.println("12 | 5 = " + (12 | 5) + " : 1101 (13)");

        // 110
        // ^011
        System.out.println("6 ^ 3 = " + (6 ^ 3) + " : 101 (5)");

        // 10000 >> = 00100
        System.out.println("16 >> 2 = " + (16 >> 2) + " : 00100 (4)");

        // ~10 = 01
        System.out.println("~2 = " + (~2) + " : 01 (1)");

        // 010000 << 1 = 100000
        System.out.println("16 << 1 = " + (16 << 1) + " : 100000 (32)");

        // 1111_1101 >> 1
        // 1111_1110
        System.out.println("-3 >> 1 = " + (-3 >> 1) + " : 1111_1110 (-2)");

        // 1111_1101 >>> 1
        // 0111_1110
        System.out.println("-3 >>> 1 = " + (-3 >>> 1) + " : 0111_1110 (126)");

        // 101 | 010 = 111
        // 1000 ^ 0011 = 1011

        // 0111
        // &1011
        // =0011
        System.out.println("(5 | 2) & (8 ^ 3) = " + ((5 | 2) & (8 ^ 3)) + " : 0011 (3)");

        // q3 keep only LSB
        int n = 0b1111_1111_1111_1111_1111_1111_1111_1111;
        int mask = 0b0000_0000_0000_0000_0000_0000_1111_1111;
        int k = n & mask;
        System.out.println("N: " + n + " K: " + k); // 255

        // q4 keep only 2nd LSB
        int n1 = 0b0000_0000_0000_0000_0000_0111_0000_0001;
        n1 = n1 >>> 8;
        System.out.println(Integer.toBinaryString(n1));
        int k1 = n1 & mask;
        System.out.println("N: " + n1 + "K: " + k1); // 7

        // q5
        int n2 = 0b0000_0000_0000_0000_0000_0000_0100_0001;
        int mask2 = 0b0000_0000_0000_0000_0000_0000_0010_0000;
        int k2 = n2 ^ mask2;
        System.out.println((char) n2 + " " + (char) k2); // A a

        // q6
        int n3 = 0b0000_0000_0000_0000_0000_0000_0000_0011;
        n3 = n3 << 8;
        int m3 = 0b0000_0000_0000_0000_0000_0000_0000_1111;
        int k3 = n3 | m3;
        System.out.println("N: " + n3 + " M: " + m3 + " K: " + k3);

        // q7
        int n4 = 0b0000_0000_0000_0000_1111_1110_0000_0001;
        int mask4 = 0b0000_0000_0000_0000_1111_1111_0000_0000;
        int k4 = n4 ^ mask4;
        System.out.println("N: " + n4 + " K: " + k4);

        // q8
        byte b = 0x7F; // 127 = 0111_1111

        System.out.println((byte) (b << 1) + " " + " = -2 (1111_1110)"); // 1111_1110
        System.out.println((byte) (b << 3) + " " + " = -8 (1111_1000)"); // 1111_1000
        System.out.println((byte) (b << 5) + " " + " = -32 (1110_0000)"); // 1110_0000
        System.out.println((byte) (b << 7) + " " + " = -128 (1000_0000)"); // 1000_0000
        System.out.println((byte) (b << 8) + " = 0 (0000_0000)"); // 0000_0000

        // q9
        int x = 0b1101;
        System.out.println(x & 0b0001);
        System.out.println(x & 0b0010);
        System.out.println(x & 0b0100);
        System.out.println(x & 0b1000);

    }

}
