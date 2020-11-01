import java.util.Scanner;
public class Main{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int  circumference = input.nextInt();
        int  size = input.nextInt();
        int topmost = 0;
        int total=0;
        int Distanceleft = 0;
        int city[] = new int[size];

        for(int i=0;i<size;i++)
            city[i] = input.nextInt();
            
        
        Distanceleft = circumference- city[size-1 ]+ city[0];
        int max = 0;
     
        for(int i=1;i<size;i++){
            if((city[i] - city[i-1])>max){
                max = city[i]-city[i-1];
            }
        }
        if(Distanceleft>max){
            System.out.println(circumference-Distanceleft);
        }
        else System.out.println(circumference-max);
        

    }
}
