/*Find the sum of the digits using recursion*/

import java.util.*;
public class Main {

    public static void main(String[] args) {

        //write your answer here
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        num = Math.abs(num);
        System.out.println(sum(num));
    }
    public static int sum(int n){
        if(n == 0){
            return 0;
        }
        return (n % 10) + sum(n/10);
    }
}
