package JavaThirdHW;


/**
 *     1. Дан массив записей: наименование товара, цена, сорт. Найти наибольшую
 *     цену товаров 1го или 2го сорта среди товаров, название которых содержит «высший».
 */


public class Product {
    private String name;
    private int price;
    private int grade;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int getGrade() {
        return grade;
    }

    public void setGrade(int grade) {
        this.grade = grade;
    }

    public Product(String name, int price, int grade) {
        this.name = name;
        this.price = price;
        this.grade = grade;
    }

    @Override
    public String toString() {
        return "Product{" +
                "name='" + name + '\'' +
                ", price=" + price +
                ", grade='" + grade + '\'' +
                '}';
    }

    public Product() {
    }
}
