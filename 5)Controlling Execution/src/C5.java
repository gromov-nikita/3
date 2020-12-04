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
    void print(int a){
        int n = 1;
        for(int i = 0; i < 8; i++){
            System.out.print((a & n) == n ? 1 : 0);
            n <<= 1;
        }
        System.out.println();
    }
    public static void main(String[] args) {
        int a = 0xAA;
        int b = 0x55;
        int n = 0x01;
        C5 obj = new C5();
        System.out.println("a");
        obj.print(a);
        System.out.println("b");
        obj.print(b);
        System.out.println("a || b");
        obj.print(a | b);
        System.out.println("a && b");
        obj.print(a & b);
        System.out.println("a ^ b");
        obj.print(a ^ b);
        System.out.println("~a");
        obj.print(~a);
        System.out.println("~b");
        obj.print(~b);
    }
}
