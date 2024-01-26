import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[]arr={1,3,2,1};
        System.out.println(is_palindrome(arr));
    }
    static boolean is_palindrome (int[]array){
        int start = 0;
        int end= array.length-1;
        if (array.length==0|| array.length==1){
            return true;
        }
        if(array[start]==array[end]){
            return is_palindrome(Arrays.copyOfRange(array,start+1,end));

        }
        else
            return false;
    }
}