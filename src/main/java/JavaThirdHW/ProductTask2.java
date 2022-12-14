package JavaThirdHW;

public class ProductTask2 {


    /**
     * 2. Сведения о товаре состоят из наименования, страны-производителя, веса,
     * цены, сорта. Получить наименования товаров заданного сорта с наименьшей ценой.
     */

        private String name;
        private String Country;
        private int weight;
        private int price;
        private int grade;

        public ProductTask2(String name, String country, int weight, int price, int grade) {
            this.name = name;
            Country = country;
            this.weight = weight;
            this.price = price;
            this.grade = grade;
        }



        @Override
        public String toString() {
            return "ProductTask2{" +
                    "name='" + name + '\'' +
                    ", Country='" + Country + '\'' +
                    ", weight=" + weight +
                    ", price=" + price +
                    ", grade=" + grade +
                    '}';
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public String getCountry() {
            return Country;
        }

        public void setCountry(String country) {
            Country = country;
        }

        public int getWeight() {
            return weight;
        }

        public void setWeight(int weight) {
            this.weight = weight;
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
    }
