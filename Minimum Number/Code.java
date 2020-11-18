package PrashantJAVAPractice;
import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws IOException {
	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	int size = Integer.parseInt(br.readLine());
	int[] a = new int[size];
	String[] line = br.readLine().split(" ");

	for(int i = 0;  i < size ; i++)
		a[i] = Integer.parseInt(line[i]);

	solve(a,size);
    }

    static void solve(int[] a, int size){
		Arrays.sort(a);
		String first = "0", second = "0";
		for(int i = 0;  i < size ; i = i + 2){
			first += a[i];
		}
		for(int i = 1;  i < size ; i = i + 2){
			second += a[i];
		}
		System.out.println(Long.parseLong(first) + Long.parseLong(second));
    }
}
