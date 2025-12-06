/*Sort the Collection
students are provided with a challenge to sort the given arraylist in the lesser lines of code. Student with minimum lines will win , try to write a code for it in less lines and win

Input

An arraylist of integers

Output

Sorted list*/

import java.util.Scanner;
import java.util.ArrayList;
import java.util.Arrays;
public class Main {

    public static void main(String[] args) {

        //write your answer here
        Scanner sc=new Scanner(System.in);
        ArrayList<Integer>list=new ArrayList<>();
        while(sc.hasNextInt()){
            int num =sc.nextInt();
            list.add(num);
        }
        int[] arr =list.stream().mapToInt(Integer::intValue).toArray();
        System.out.println("List before sort: " + Arrays.toString(arr));
        Arrays.sort(arr);
        System.out.println("List after sort: " + Arrays.toString(arr));
        
    }
}

