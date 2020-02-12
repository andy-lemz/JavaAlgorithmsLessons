package Les2;

public class MyArray {
    private int[] arr;
    private int size;
    private boolean isSorted;

    public MyArray(int size) {
        this.size = 0;
        this.arr = new int[size];
        this.isSorted = false;
    }

    public int getArrayLength() {
        return arr.length;
    }

    public Integer binaryFindIndex(int value){
        int low = 0;
        int high = this.size - 1;
        int mid;
        while (low <= high) {
            mid = (low + high) / 2;
            if (value == this.arr[mid]) {
                return mid;
            } else {
                if (value < this.arr[mid]) {
                    high = mid - 1;
                } else {
                    low = mid + 1;
                }
            }
        }
        return null;
    }

    public void delete(Integer value) {
        Integer i;
        if (this.isSorted) {
            i = binaryFindIndex(value);
            if (i == null) return;
        } else {
            boolean numFind = false;
            for (i = 0; i < this.size; i++) {
                if (this.arr[i] == value) {
                    numFind = true;
                    break;
                }
            }
            if (!numFind){return;}
        }

        for (int j = i; j < this.size - 1; j++) {
            change(j, j+1);
        }
        this.size--;
        System.out.printf("Число %d удалено из %d строки массива", value, i);
    }

    public void insert(int value){
        this.arr[this.size] = value;
        this.size++;
    }

    public void sortBubble(){
        int out, in;
        for (out = this.size - 1; out >= 1; out--) {
            for(in = 0; in < out; in++) {
                if (this.arr[in] > this.arr[in + 1]) {
                    change(in, in + 1);
                }
            }
        }
        this.isSorted = true;
    }

    public void sortSelect(){
        int out, in, mark;
        for(out=0;out<this.size;out++){
            mark = out;
            for(in = out+1;in<this.size;in++){
                if (this.arr[in]< this.arr[mark]){
                    mark = in;
                }
            }
            change(out, mark);
        }
        this.isSorted = true;
    }

    public void sortInsert(){
        int in, out;
        for(out = 1;out < this.size; out++){
            int temp = this.arr[out];
            in = out;
            while(in > 0 && this.arr[in-1] >=temp){
                this.arr[in] = this.arr[in-1];
                --in;
            }
            this.arr[in] = temp;
        }
        this.isSorted = true;
    }

    private void change(int a, int b){
        int tmp = this.arr[a];
        this.arr[a] = this.arr[b];
        this.arr[b] = tmp;
    }


}
