package Les1;

public class MaxNum {
    public static void main(String[] args) {
        int[] arr = {3,5,4,-8,-7};

        int max1 = 0;
        int max2 = 0;

        for (int n: arr) {
            if (n > max1){
                max1 = n;
            } else {
                if (n > max2){
                    max2 = n;
                }
            }

        }

        System.out.println("max1 = "+max1+"; max2 = "+max2);
    }
}
