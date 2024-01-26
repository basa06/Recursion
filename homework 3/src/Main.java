public class Main {
    public static void main(String[] args) {
        System.out.println(T(10));


        final int N = 10;

        int F=0;

        if (N == 0||N==1){
            F = 1;



        }
        else {
            int k = 1;
            int fcurr= 1;
            int fprev = 1;
            while (k!=N){
                int fnext = fcurr + (N-k)*fprev;
                k++;
                fprev=fcurr;
                fcurr = fnext;
                F = fnext;
            }
        }
        System.out.println(F);


    }
    static int T(int n) {
        if (n==1||n==0)
            return 1;
        return T(n - 1)+(n - 1) * T(n - 2);
    }


    }

