/*
Exercise 4: (3) Write a program that uses two nested for loops and the modulus
operator (%) to detect and print prime numbers (integral numbers that are not evenly
divisible by any other numbers except for themselves and 1).
 */
public class C4 {
    public static void main(String[] args) {
        cycle:
        for (int i = 2; i < 100; i++) {
            for (int j = 2; j < i; j++) {
                if (i % j == 0) {
                    continue cycle;
                }
            }
            System.out.println(i);
        }
    }
}
