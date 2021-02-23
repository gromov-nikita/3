/*
Exercise 10: (5) A vampire number has an even number of digits and is formed by
multiplying a pair of numbers containing half the number of digits of the result. The digits
are taken from the original number in any order. Pairs of trailing zeroes are not allowed.
Examples include:
1260 = 21 * 60
1827 = 21 * 87
2187 = 27 * 81
Write a program that finds all the 4-digit vampire numbers. (Suggested by Dan Forhan.)
 */
public class VampireNumbers {
    public static void main(String[] args) {
        Integer ans;
        String sAns, s;
        String save;
        int counter = 0,index;
        for (Integer i = 15; i < 100; i++) {
            for (Integer j = i; j < 100; j++) {
                while ((ans = j * i) <= 1000) {
                    j++;
                }
                sAns = ans.toString();
                s = i.toString() + j.toString();
                for(int k = 0; k != 4; k++) {
                    if((index = sAns.indexOf(save = "" + s.charAt(k))) != -1){
                        counter++;
                        sAns = sAns.replaceFirst(save,"q");
                    }
                }
                if(counter == 4) {
                    System.out.println(ans + " = " + i + " * " + j);
                }
                counter = 0;
            }
        }
    }
}
