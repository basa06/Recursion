public class Main {
    public static void main(String[] args) {
        System.out.println(s(25000000));
        //error at large numbers, computer has to keep in memory the tree, a stack
        //stack is a squence of function calls active at the moment

    }

    static int s(int n) {
        if (n==1)
            return 1;
        return n + s(n - 1);
    }
}
//ends at s(1)=1
