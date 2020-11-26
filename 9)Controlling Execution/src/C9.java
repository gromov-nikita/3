/*
Exercise 9: (4) A Fibonacci sequence is the sequence of numbers 1, 1, 2, 3, 5, 8, 13, 21,
34, and so on, where each number (from the third on) is the sum of the previous two. Create
a method that takes an integer as an argument and displays that many Fibonacci numbers
starting from the beginning, e.g., If you run java Fibonacci 5 (where Fibonacci is the
name of the class) the output will be: 1, 1, 2, 3, 5.
 */
class C9 {
    void func(int n) {
        int ans = 1,k = 0,m = 0;
        if(n <= 0){
            return;
        }
        //1, 1, 2, 3, 5, 8, 13, 21, 34, 55, 89, 144, 233, 377, 610, 987, 1597, 2584, 4181
        while(ans <= n) {
            System.out.print(ans + " ");
            k = ans;
            ans += m;
            m = k;
        }
    }
    public static void main(String[] args) {
        C9 obj = new C9();
        obj.func(5000);
    }

}
