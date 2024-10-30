package app;

public class Main {
    public static void main(String[] args) {
        var celsius = 100.0;
        System.out.println("Temperature converter app.");
        var fahrenheit = celsiusToFahrenheit(celsius);
        System.out.println(celsius + " Celsius is " + fahrenheit + " Fahrenheit.");
    }

    private static Double celsiusToFahrenheit(Double celsius) {
        return celsius * 9 / 5 + 32;
    }
}
