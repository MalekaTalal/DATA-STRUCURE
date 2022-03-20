

public class gfg {

    static int JOSEPHUS (int n,int k) {
        if (n == 1)
            return 1;
        else

            return (JOSEPHUS(n - 1, k) + k - 1) % n + 1;}

              public static void main(String[] args) {
                   int n = 14;
                     int k = 2;
               System.out.println("the chosen place is");
                System.out.println();
              System.out.println(JOSEPHUS(n, k));

    }

}

