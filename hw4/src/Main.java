public class Main {
    public static void main(String[] args) {
        int [] nums ={1,2,3,4,5};
        int key = 2;

        System.out.println(search(nums, key, nums.length));
    }
    static int search (int[]array, int key, int length) {
        if(length==0){
            return -1;
        }

        if (key == array[length-1])
            return length-1;

        else {
            return search(array, key, length - 1);
        }
    }
}
//checking smaller and smaller sub groups within main array. if subgroup is 0 then it defonately doesnt exist