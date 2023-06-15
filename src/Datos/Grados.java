package Datos;

public class Grados {
    Double celsius;
    Double fahrenheit;

    public Grados(Double celsius, Double fahrenheit){
        this.celsius = celsius;
        this.fahrenheit = fahrenheit;
    }
    @Override
    public String toString(){return celsius + "celsius" + fahrenheit + "fahrenheit";}

    public Double getCelsius() {
        return celsius;
    }

    public Double getFahrenheit() {
        return fahrenheit;
    }
}
