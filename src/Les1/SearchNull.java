package Les1;

public class SearchNull {
    public static void main(String[] args) {
        int[] arr = {3,5,4,-8,-7};

        int a;
        int b;
        int c;
        String success = "Комбинации дающие ноль: ";

        for (int i = 0; i < arr.length; i++){
            a = 0; b = 0; c =0;
            a = arr[i];
            for (int j = i+1; j < arr.length; j++){
                b = arr[j];
                for (int n = j+1; n < arr.length; n++){
                    c = arr[n];
                    if (a+b+c == 0){
                        success = success+"("+a+", "+b+", "+c+") ";
                        break;
                    }
                }
            }
        }

        System.out.println(success);

    }
}
