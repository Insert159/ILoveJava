package JavaSecondHW;

public class FahrenheitConverter implements Converter {
    @Override
    public double convertValue(double baseValue) {
        return 1.8 * baseValue + 32;
    }
}
