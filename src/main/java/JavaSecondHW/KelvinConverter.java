package JavaSecondHW;

public class KelvinConverter implements Converter {

    @Override
    public double convertValue(double baseValue) {
        return baseValue + 273.15;
    }
}