package Search.Linear_Search_Algorithm;
import java.util.*;

public class numberSearch { public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int arr[] = {10,20,40,5,6,4,1,90,9,14,15};
    int target = sc.nextInt();
    int ans = targetFound(arr , target);
    System.out.println(ans);
}

    static int  targetFound(int[] arr , int target ){
        if(arr.length == 0 ){
            return -1;
        }
        for(int index = 0 ; index < arr.length; index++){
            int element = arr[index];
            if(element == target){
                return index;
            }
        }
        return -1;
    }

}
