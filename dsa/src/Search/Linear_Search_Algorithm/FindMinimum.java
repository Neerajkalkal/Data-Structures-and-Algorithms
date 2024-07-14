package Search.Linear_Search_Algorithm;


public class FindMinimum {
    public static void main(String[] args) {
        int[] arr = {10,40,2,50,6,1,0,10};
        System.out.println(min(arr));
    }
    static int min(int[] arr){
        if(arr.length == 0){
            return -1;
        }
        int ans = arr[0];
        for(int i = 1; i < arr.length;i++){
            if(arr[i] < ans){
                ans = arr[i];
            }
        }
        return ans;
    }
}
