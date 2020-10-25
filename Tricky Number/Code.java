import java.math.BigInteger;
import java.util.*;

class Main{
    public static void main(String[] args ) {
        Scanner sc = new Scanner(System.in);

        long input = sc.nextLong();
        int i=2, count , sum =0 ;
        double inputsqrt = Math.sqrt(input);
        while(i<=inputsqrt){
            boolean check = checkforpeerfectsquare(i);
            if(check==true)
                sum++;
            i++;
        }
        if(input>=6)
           System.out.print(sum+1);
        else
            System.out.print(sum);
    }

    static boolean checkforpeerfectsquare(int i){
        int count = 0;
     for(int j=2; j<=i; j++){
         if(i%j==0)
             count++;
     }
     if(count==1)
         return true;
     else
         return false;

    }
}
