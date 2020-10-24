import java.io.*;
import java.math.BigInteger;
import java.util.*;

public class Main {

    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        BigInteger n = sc.nextBigInteger();
        BigInteger count = BigInteger.ZERO;
        while (n.compareTo(BigInteger.valueOf(5)) >= 0){
           n = n.divide(BigInteger.valueOf(5));
           count = count.add(n);
        }
        System.out.print(count);

    }
}
