// Don't place your source in a package
import java.math.*;
import java.io.*;
import java.util.Scanner;
// Please name your class Main
class Main {

    private static BigInteger[] answers;

    private static BigInteger one;
    private static BigInteger zero;

    public static BigInteger fastFibonacci(int n) {
        BigInteger prev = BigInteger.ONE;
        BigInteger prevprev = BigInteger.ONE;
        BigInteger num = BigInteger.ONE;
        for (int i = 2; i <= n; ++i) {
            num = prev.add(prevprev);
            prevprev = prev;
            prev = num;
        }
        return num;
    }

    private static BufferedReader stdin = new BufferedReader(new InputStreamReader(System.in));


    public static void main(String[] args) {

        int n;
        long time, newTime;
        BigInteger answer;
        // answer = fastFibonacci(20000);


        Scanner scanner = new Scanner(System.in);

        int nooftestcases = scanner.nextInt();

        int ar[] = new int[nooftestcases];
        for (int i = 0; i < nooftestcases; i++) {
            ar[i] = scanner.nextInt();
        }

        for (int i = 0; i < nooftestcases; i++) {
            answer = fastFibonacci(ar[i]);
            //   System.out.println(answer);
            System.out.println(answer.mod(BigInteger.valueOf(10)));
        }


    }
}
               
         