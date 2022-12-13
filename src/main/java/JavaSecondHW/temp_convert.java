package JavaSecondHW;

public class temp_convert {
    public static void main(String[] args) {
        double temperature = 12;
        System.out.println("Celsius t = " +
                new CelsiusConverter().convertValue(temperature));
        System.out.println("Kelvin t = " +
                new KelvinConverter().convertValue(temperature));
        System.out.println("Fahrenheit t = " +
                new FahrenheitConverter().convertValue(temperature));
    }
}
