package JavaThirdHW;



//        4. при входном массиве, вернуть массив массивов со всеми перестановками
//        его элементов. (со звездочкой)
//        Пример входных данных:
//        [1,2,3]
//        Пример выходных данных:
//        [[1,2,3],[1,3,2],[2,1,3],[2,3,1],[3,1,2],[3,2,1]]


import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class newClass {
    public static void main(String[] args) {
        // 1 Task
//        Product product = new Product("Высший прод", 222, 1 );
//        Product product2 = new Product("Высший", 522, 2 );
//        Product product3 = new Product("Невысший прод", 622, 3 );
//        Product product4 = new Product("Прод", 122, 1 );
//        Product product5 = new Product("И опять Высший прод", 772, 2 );
//        List <Product> list = new ArrayList<>();
//        list.add(product);
//        list.add(product2);
//        list.add(product3);
//        list.add(product4);
//        list.add(product5);
//        int max = 0;
//        for (Product p: list) {
//          if(p.getName().contains("Высший") && p.getGrade()<3)
//              if(max < p.getPrice())
//              max = p.getPrice();
//        }
//        System.out.println(max);


        // 2 Task

//        ProductTask2 productTask2 = new ProductTask2("Прод","СССР", 1, 100, 1);
//        ProductTask2 productTask22 = new ProductTask2("НЕПРОД","Аргентина", 2, 100, 2);
//        ProductTask2 productTask23 = new ProductTask2("Прод-Прод","Ваканда", 1, 1000, 3);
//        ProductTask2 productTask24 = new ProductTask2("Мрод","Москва", 2, 20, 2);
//        ProductTask2 productTask25 = new ProductTask2("Енот","Казахстан", 2, 10000, 1);
//        List <ProductTask2> listTask2 = new ArrayList<>();
//        listTask2.add(productTask2) ;
//        listTask2.add(productTask22);
//        listTask2.add(productTask23);
//        listTask2.add(productTask24);
//        listTask2.add(productTask25);
//        int min = Integer.MAX_VALUE;
//        Scanner scanner = new Scanner(System.in);
//        System.out.println("Введите сорт: ");
//        int gggrade = scanner.nextInt();
//        String nameOfMin = "";
//        for (ProductTask2 p: listTask2) {
//            if(gggrade==p.getGrade() && min > p.getPrice()) {
//                min = p.getPrice();
//                nameOfMin=p.getName();
//            }
//        }
//        System.out.println(nameOfMin);


        // Task 3
//        Book book = new Book("Тихий дон", "Пьер Гордон", 1, 1993, 300);
//        Book book2 = new Book("Тихий дол", "Пьер Гордол", 2, 2010, 134);
//        Book book3 = new Book("Тихий доб", "Пьер Гордоб", 3, 1993, 117);
//        Book book4 = new Book("Тихий дуб", "Пьер Гардуб", 4, 2015, 11);
//        Book book5 = new Book("Тихий муб", "Пьер Гормуб", 5, 1996, 302);
//        List <Book> listBook = new ArrayList<>();
//        listBook.add(book);
//        listBook.add(book2);
//        listBook.add(book3);
//        listBook.add(book4);
//        listBook.add(book5);
//        String bookFind = "";
//        for (Book b : listBook)
//            if(b.getAutor().contains("а") && b.getPages()%3!=0
//                    && b.getPages()%5!=0 && b.getPages()%7!=0 && b.getPages()%2!=0 && b.getYear()>=2010)
//                bookFind=b.getName();
//        System.out.println(bookFind);


        // Task 4
        ArrayOfArrays arrayOfArrays = new ArrayOfArrays(234);
        List <int[]> list = arrayOfArrays.reverce(arrayOfArrays.getArray());
        for (int [] i : list)
            System.out.println(i.toString());
    }
}
