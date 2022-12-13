package JavaFirstHW;
//    +Реализовать функцию возведения числа а в степень b. a, b ∈ Z. Сводя
//    количество выполняемых действий к минимуму.
//    Пример 1: а = 3, b = 2, ответ: 9
//    Пример 2: а = 2, b = -2, ответ: 0.25
//    Пример 3: а = 3, b = 0, ответ: 1
//    Пример 4: а = 0, b = 0, ответ: не определено
//    Пример 5
//    входные данные находятся в файле input.txt в виде
//    b 3
//    a 10
//    Результат нужно сохранить в файле output.txt 1000


import java.io.*;
import java.util.ArrayList;

public class FirstHW {
    public static void main(String[] args) throws IOException {
        File myFile = new File("input.txt");
        BufferedReader bufferedReader = new BufferedReader
                (new InputStreamReader(new FileInputStream((myFile))));
        ArrayList<String> arrayList = new ArrayList<>();
        while (bufferedReader.ready()) {
            arrayList.add(bufferedReader.readLine());
        }

        int b = Integer.parseInt(arrayList.get(0).trim().substring(2));
        int a = Integer.parseInt(arrayList.get(1).trim().substring(2));
        double deg = Math.pow(a, b);
        bufferedReader.close();
        System.out.println(deg);


        File file = new File("output.txt");
        try {
            PrintWriter printWriter = new PrintWriter(file);
            printWriter.println(deg);
            printWriter.close();
        } catch (FileNotFoundException ex) {
            System.out.println(deg);
        }
    }
}




