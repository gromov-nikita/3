/*
Exercise 9: (4) A Fibonacci sequence is the sequence of numbers 1, 1, 2, 3, 5, 8, 13, 21,
34, and so on, where each number (from the third on) is the sum of the previous two. Create
a method that takes an integer as an argument and displays that many Fibonacci numbers
starting from the beginning, e.g., If you run java Fibonacci 5 (where Fibonacci is the
name of the class) the output will be: 1, 1, 2, 3, 5.
 */
class Fibonacci {
    //1, 1, 2, 3, 5, 8, 13, 21, 34, 55, 89, 144, 233, 377, 610, 987, 1597, 2584, 4181
    public void fibonacciPrint(int ans) {
        System.out.print(ans + " ");
    }
    public int fibonacci(int n, int pred, int ans) {
        fibonacciPrint(ans);
        if((ans + pred) <= n) {
            int save = ans;
            ans += pred;
            pred = save;
            fibonacci(n,pred,ans);
        }
        return ans;
    }
    public static void main(String[] args) {
        Fibonacci obj = new Fibonacci();
        obj.fibonacci(10000,0,1);
    }

}
