import java.io.*;
import java.util.*;

class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int size = Integer.parseInt(br.readLine());
       
        permutation(size);
    }
    static void permutation( int size){
        StringBuilder sb = new StringBuilder();
        int min = 0, sum = 0;
        ArrayList<Integer> list = new ArrayList<>();
        int a[] = new int[size+ 1];
        for(int i = 1 ; i <= size ; i++){
            list.add(i) ;
        }
         if(size == 3)
            Collections.swap(list, size - 1, size - 2);
        if(size == 4)
            Collections.swap(list, size - 2, size - 3);
        else if(size > 4)
        Collections.swap(list, size - 1, size - 4);
        for(int i : list)
            System.out.print(i+" ");
    }

    }
