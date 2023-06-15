package Datos;
import java.util.ArrayList;
public class IngresarGrados {
    public ArrayList<Grados> grados;
    public IngresarGrados(){grados = new ArrayList<>();}
    public void ingresar(ArrayList<Grados> grados, Double celsius, Double fahrenheit){
        grados.add(new Grados(celsius,fahrenheit));
    }
    public ArrayList<Grados> getGrados() {
        return grados;
    }
}

