package Search.Linear_Search_Algorithm;

public class StringIntSearch {
    public static void main(String[] args) {
        String name = "Neeraj";
        char target = 'e';
        System.out.println(Searchstring(name , target));
    }

    static boolean Searchstring( String str , char target){
            if(str.isEmpty()){
                return false;
            }
            for(char ch : str.toCharArray() ){
                if(ch == target){
                    return true;
                }
            }
        return false;
    }
}
