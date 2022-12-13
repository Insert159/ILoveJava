package JavaSecondHW;

import java.util.*;

public class SecondHW {

    public static void main(String[] args) {
//        firstTask(6);
//        secondTask(6);
//        thirdTask(6);
//        fouthTask(6);
        fifthTask(6);
//       sixthTask(6);
    }

    /**
     * 1) Дана последовательность N целых чисел. Найти количество положительных чисел,
     * после которых следует отрицательное число.
     * @param n
     */
    public static void firstTask(int n) {
        Scanner scanner = new Scanner(System.in);
        int[] arr = new int[n];
        int count=0;
        for (int i = 0; i < n; i++) {
            arr[i]=scanner.nextInt();
        }
        for (int i = 0; i < arr.length; i++) {
            if(i==arr.length-1) break;
            if(arr[i]>0 && arr[i+1]<0) count++;
        }
        System.out.println(count);

    }

    /**
     * 2) Дана последовательность целых чисел, оканчивающаяся нулем. Найти сумму
     * положительных чисел, после которых следует отрицательное число.
     * @param n
     */

    public static void secondTask(int n) {
        Scanner scanner = new Scanner(System.in);
        int[] arr = new int[n];
        int count=0;
        for (int i = 0; i < n; i++) {
            arr[i]=scanner.nextInt();
        }
        for (int i = 0; i < arr.length; i++) {
            if(i==arr.length-1) break;
            if(arr[i]>0 && arr[i+1]<0) count+=arr[i];
        }
        System.out.println(count);

    }

    /**
     *3) Дана последовательность N целых чисел. Найти сумму простых чисел.
     * @param n
     */

    public static void thirdTask(int n) {
        Scanner scanner = new Scanner(System.in);
        int[] arr = new int[n];
        int count=0;
        for (int i = 0; i < n; i++) {
            arr[i]=scanner.nextInt();
        }
        for (int i = 0; i < arr.length; i++) {
            if(arr[i]%2==1 && arr[i]%7!=0 && arr[i]%3!=0 && arr[i]%5!=0) count+=arr[i];
        }
        System.out.println(count);

    }



    /**
     * 4) Дана последовательность из N целых чисел. Верно ли, что последовательность
     *  является возрастающей.
     * @param n
     */

    public static void fouthTask(int n) {
        Scanner scanner = new Scanner(System.in);
        int[] arr = new int[n];
        boolean count = true;
        for (int i = 0; i < n; i++) {
            arr[i]=scanner.nextInt();
        }
        for (int i = 0; i < arr.length; i++) {
            if(i==arr.length-1) break;
            if(arr[i]>arr[i+1])
                count=false;
        }
        System.out.println(count);

    }





    /**
     *5) Дан массив целых чисел. Найти сумму элементов, у которых последняя и предпоследняя
     * цифры равны.
     * @param n
     */

    public static void fifthTask(int n) {
        Scanner scanner = new Scanner(System.in);
        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i]=scanner.nextInt();
        }
        int last = arr[0]%100;
        int preLast = 0;
        for (int i = 0; i < arr.length; i++) {
            if(i==arr.length-1) break;
            if(arr[i+1]%100==last)
                preLast += last;
        }
        System.out.println(preLast);

    }





    /**
     *6) Дан массив целых чисел.
     * Заменить отрицательные элементы на сумму индексов двузначных элементов массива.
     * @param n
     */

    public static void sixthTask(int n) {
        Scanner scanner = new Scanner(System.in);
        int[] arr = new int[n];
        int magicNum = 0;
        for (int i = 0; i < n; i++) {
            arr[i]=scanner.nextInt();
            if(arr[i]>9) magicNum+=i;
        }
        for (int i = 0; i < arr.length; i++) {
            if(arr[i]<0) arr[i]=magicNum;
        }

    }

}


