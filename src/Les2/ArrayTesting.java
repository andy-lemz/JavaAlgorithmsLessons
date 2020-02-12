package Les2;

import java.util.Random;

public class ArrayTesting {
    public static void main(String[] args) {
        MyArray arr = new MyArray(100000);
        Random rand = new Random();

        for (int i = 0; i<arr.getArrayLength(); i++){
            arr.insert(rand.nextInt(1000));
        }

        // Тест удаления значений
        //int randDel = rand.nextInt(1000);
        //arr.delete(randDel);

        long run = System.currentTimeMillis();
        //arr.sortBubble();   // 15386 ms
        //arr.sortSelect();   //  5438 ms
        arr.sortInsert();   //  1044 ms

        long end = System.currentTimeMillis();
        long res = end-run;
        System.out.println(res);

    }
}
