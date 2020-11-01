import java.util.Scanner;
public class Main{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int T= input.nextInt();
        
        for(int l=0;l<T;l++){
            int N= input.nextInt();
            long K= input.nextLong();
            int arr[] = new int[N];
            int max =0;

            for(int j=0;j<N;j++){
                arr[j] = input.nextInt();
                if(arr[j]>max) max= arr[j];
            }
           //System.out.println("Max is:"+ max);

            int low=0;
            int high = max;
            int mid= (low+high)/2;
            long sum =0;
            int count =0;
            long lowsum=0;
            long highsum=0;
            int lowmid=0;
            int highmid=0;

            while(low<=high){
                for(int i=0;i<N;i++){
                    if(arr[i]>mid){
                        sum +=mid;
                    }
                    else if(arr[i]<=mid){
                        sum += arr[i];
                    }
                }
                //System.out.println("Sum and mid :"+ sum +" "+mid);
                if(sum==K){
                    System.out.println(mid);
                    count++;
                    break;
                }
                else if(sum>K){
                    high = mid-1;
                    highsum = sum;
                    highmid =mid;
                }
                else if(sum<K){
                    low= mid+1;
                    lowsum = sum;
                    lowmid =mid;
                }
                mid =(low+high)/2;
                sum=0;

            }
            if(count==0){
               /* System.out.println("Lowsum is: "+lowsum );
                System.out.println("Lowmid is: "+lowmid );
                System.out.println("Highsum is: "+highsum );
                System.out.println("Highmid is: "+highmid ); */
                long x=(int)Math.abs(K-lowsum);
                long y=(int)Math.abs(highsum-K);
                if(x<=y){
                    System.out.println(lowmid);
                }
                else System.out.println(highmid);

            }
            
        }
    }
}
