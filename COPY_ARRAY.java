import java.util.Arrays;




public class COPY_ARRAY
{




    public static void main(String[] args) {
        System.out.println( "Copy the Array ="+ Arrays.toString(copy()));
    }
    public static int[] copy() {
        int[] f = {1,2,3,4,5};
        int[] c = new int[f.length];
        c = f;
        return c;
    }
}



