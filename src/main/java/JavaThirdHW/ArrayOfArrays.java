package JavaThirdHW;

import java.util.ArrayList;
import java.util.List;

public class ArrayOfArrays {
    private int array;


    public ArrayOfArrays(int array) {
        this.array = array;
    }



    public int getArray() {
        return array;
    }
    public void setArray(int array) {
        this.array = array;
    }



    public ArrayList<int[]> reverce (int number){
        ArrayList <int []> list = new ArrayList<>();
        int[] arr = new int[3];
        for (int i = 0; i < arr.length; ++i) {
            arr[i] += number % 10;
            number /= 10;
        }
        list.add(arr);
        list.add(arr2);
        list.add(arr3);
        return list;
    }
}
