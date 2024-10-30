package app;

public class Main {
    public static void main(String[] args) {
        var cel = 100.0;
        var far = 150.0;
        System.out.println("Temperature converter app.");
        var fahrenheit = celsiusToFahrenheit(cel);
        var celsius = fahrenheitToCelsius(far);
        System.out.println(cel + " Celsius is " + fahrenheit + " Fahrenheit.");
        System.out.println(far + " Fahrenheit is " + celsius + " Celsius.");
    }

    private static Double celsiusToFahrenheit(Double celsius) {
        return celsius * 9 / 5 + 32;
    }

    private static Double fahrenheitToCelsius(Double fahrenheit) {
        return (fahrenheit - 32) * 5 / 9;
    }
}
