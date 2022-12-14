package JavaThirdHW;


/**        3. Сведения о книге состоят из названия, фамилии автора, цены, года издания
       и количества страниц. Найти названия книг, в которых простое количество страниц,
 фамилия автора содержит «А» и год издания не позднее 2010 г.
 */

public class Book {
    private String name;
    private String autor;
    private int price;
    private int year;
    private int pages;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public int getPages() {
        return pages;
    }

    public void setPages(int pages) {
        this.pages = pages;
    }

    public Book() {
    }

    public Book(String name, String autor, int price, int year, int pages) {
        this.name = name;
        this.autor = autor;
        this.price = price;
        this.year = year;
        this.pages = pages;
    }
}
