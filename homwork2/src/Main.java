public class Main {
    public static void main(String[] args) {
        System.out.println(s(5));

        int temp=1;

        for (int i = 1; i<=5; i++){
            temp = temp * i;
        }
        System.out.println(temp);
    }
    static int s(int n) {
        if (n==1)
            return 1;
        return n * s(n - 1);
    }
}