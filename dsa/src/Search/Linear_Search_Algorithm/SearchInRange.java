package Search.Linear_Search_Algorithm;

import java.util.Scanner;

public class SearchInRange {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int arr[] = {10,20,40,5,6,4,1,90,9,14,15};
        int target = sc.nextInt();
        int ans = targetFound(arr , target , 1 , 9);
        System.out.println(ans);
    }

    static int  targetFound(int[] arr , int target , int start , int end ){
        if(arr.length == 0 ){
            return -1;
        }
        for(int index = start ; index <= end; index++){
            int element = arr[index];
            if(element == target){
                return index;
            }
        }
        return -1;
    }
}
