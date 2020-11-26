/*
Exercise 5: (4) Repeat Exercise 10 from the previous chapter, using the ternary operator
and a bitwise test to display the ones and zeroes, instead of Integer.toBinaryString( ).

Exercise 10: (3) Write a program with two constant values, one with alternating binary
ones and zeroes, with a zero in the least-significant digit, and the second, also alternating,
with a one in the least-significant digit (hint: It’s easiest to use hexadecimal constants for
this). Take these two values and combine them in all possible ways using the bitwise
operators, and display the results using Integer.toBinaryString( ).
 */

import org.w3c.dom.ls.LSOutput;

public class C5 {
    public static void main(String[] args) {
        Integer a = 0xAA;
        Integer b = 0x55;
        int n = 0x01;
        int save;
        System.out.println(a);
        System.out.println(b);
        System.out.print("a\n");
        for(int i = 0; i < 8; i++){
            System.out.print((a & n) == n ? 1 : 0);
            n <<= 1;
        }
        n = 1;
        System.out.print("\nb\n");
        for(int i = 0; i < 8; i++){
            System.out.print((b & n) == n ? 1 : 0);
            n <<= 1;
        }
        n = 1;
        System.out.println("\n|");
        save = a | b;
        for(int i = 0; i < 8; i++){
            System.out.print((save & n) == n ? 1 : 0);
            n <<= 1;
        }
        n = 1;
        System.out.println("\n&");
        save = a & b;
        for(int i = 0; i < 8; i++){
            System.out.print((save & n) == n ? 1 : 0);
            n <<= 1;
        }
        n = 1;
        System.out.println("\n^");
        save = a ^ b;
        for(int i = 0; i < 8; i++){
            System.out.print((save & n) == n ? 1 : 0);
            n <<= 1;
        }
        n = 1;
        System.out.println("\n~");
        save = ~a;
        for(int i = 0; i < 8; i++){
            System.out.print((save & n) == n ? 1 : 0);
            n <<= 1;
        }
        n = 1;
        System.out.println("\n~");
        save = ~b;
        for(int i = 0; i < 8; i++){
            System.out.print((save & n) == n ? 1 : 0);
            n <<= 1;
        }
        n = 1;
    }
}
