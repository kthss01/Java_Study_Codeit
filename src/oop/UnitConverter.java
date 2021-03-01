package oop;

public class UnitConverter {
    public static final double KILOGRAMS_PER_POUND = 0.45359237;
    public static final double POUNDS_PER_KILOGRAM = 1.0 / KILOGRAMS_PER_POUND;
    public static final double CENTIMETERS_PER_INCH = 2.54;
    public static final double INCHES_PER_CENTIMETER = 1.0 / CENTIMETERS_PER_INCH;

    private UnitConverter() {}

    public static double toPounds(double kg) {
        return kg * POUNDS_PER_KILOGRAM;
    }

    public static double toKilograms(double lb){
        return lb * KILOGRAMS_PER_POUND;
    }

    public static double toInches(double cm){
        return cm * INCHES_PER_CENTIMETER;
    }

    public static double toCentimeters(double in) {
        return in * CENTIMETERS_PER_INCH;
    }

    public static double toFahrenheit(double c) {
        return c * 9 / 5 + 32;
    }

    public static double toCelsius(double f) {
        return (f - 32) * 5 / 9;
    }

    public static void main(String[] args) {
        System.out.format("35 lb -> %.2f kg\n", UnitConverter.toKilograms(35));
        System.out.format("62 kg -> %.2f lb\n", UnitConverter.toPounds(62));
        System.out.format("12.2 in -> %.2f cm\n", UnitConverter.toCentimeters(12.2));
        System.out.format("3.82 cm -> %.2f in\n", UnitConverter.toInches(3.82));
        System.out.format("48 °F -> %.2f °C\n", UnitConverter.toCelsius(48));
        System.out.format("-9 °C -> %.2f °F\n", UnitConverter.toFahrenheit(-9));

//        Integer i = 123;
    }
}
