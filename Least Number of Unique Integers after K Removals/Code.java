package PrashantJAVAPractice;

import java.util.*;

public class Main {

    public static void main(String[] args) {
        Map<Integer, Integer> map = new HashMap<>();
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int target = sc.nextInt();
        int a[] = new int[size];
        for(int i = 0 ; i < size ; i++){
            a[i] = sc.nextInt();
            if(map.containsKey(a[i]))
                map.put(a[i], map.get(a[i]) + 1);
            else map.put(a[i], 1);
        }
        int ans = findLeastNumOfUniqueInts(a, target, map);
        System.out.print(ans);
    }

    static int findLeastNumOfUniqueInts(int[] a, int target, Map<Integer,  Integer> map){
        int uniqueNo ;
        List<Integer> list = new ArrayList<>();
        for(Map.Entry<Integer, Integer> entry: map.entrySet()){
            list.add(entry.getValue());
        }
        Collections.sort(list);
        List<Integer> tempList = new ArrayList<>();
        for(int i : list)
            tempList.add(i);

        for(int i = 0; i < list.size() ; i++){
            if(target < 0 || (list.get(i) - target) > 0 )
                break;
           target -= list.get(i);

               tempList.remove(0);
        }
        uniqueNo = tempList.size();
        return uniqueNo;
    }
}
