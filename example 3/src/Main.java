public class Main {
    public static void main(String[] args) {
        final int N = 20;

        int F=0;

        if (N == 0){
            F = 1;

        } else if (N==1) {
            F = 2;


        }
        else {
            int k = 1;
            int fcurr= 2;
            int fprev = 1;
            while (k!=N){
                int fnext = 2*fcurr + fprev -1;
                k++;
                fprev=fcurr;
                fcurr = fnext;
                F = fnext;
            }
        }
        System.out.println(F);
    }
}

// at n = 50, it becomes negative  because integer goes out of bounds.
//non recursive algorithm
//can be very slow or stack overflow errir with recursion, reasons to use it ? very natural way to solve problem
