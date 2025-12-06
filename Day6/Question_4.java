/*Hashmap
Write a java program to remove an element from the Map, you can use the remove() method. This method takes the key value and
removes the mapping for a key from this map if it is present in the map.*/

import java.util.*;
public class Main {

    public static void main(String[] args) {
	Scanner s=new Scanner(System.in);
        //write your answer here
        Map<Integer,String>hashMap=new HashMap<>();
        for (int i = 1;i<=4;i++){
            String value = s.next();
            hashMap.put(i,value);
        }
        int keyToRemove = s.nextInt();

        System.out.println("Mappings of HashMap are : " + hashMap);

        hashMap.remove(keyToRemove);
        System.out.println("Mappings after removal are : " + hashMap);

    }
}
