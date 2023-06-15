package TEMP;
import Datos.Grados;
import Datos.IngresarGrados;
import Mostrar.Mostrar2;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
public class Conversion02 extends JFrame {
    private JPanel panel1;
    private JTextField textField1;
    private JButton convertirButton;
    private JButton resultadoButton;
    IngresarGrados ingresarGrados = new IngresarGrados();
    CalcularTemperatura calcularTemperatura = new CalcularTemperatura();
    private static ArrayList<Grados> lista = new ArrayList<>();
    public Conversion02(){
        setupFrame();
    }
    private void setupFrame(){
        setTitle("ESCOJA EL TIPO DE CONVERSION");
        setLayout(new FlowLayout());
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
        setResizable(false);
        setSize(400, 300);
        add(panel1);
        addActionListeners();
        query();
    }
    private void addActionListeners(){
        convertirButton.addActionListener(new EventClick());
    }

    public class EventClick implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
            JButton boton = (JButton) e.getSource();
            String opcion = boton.getText();

            if (opcion.equals("Convertir")) {
                Double celsius = Double.valueOf(textField1.getText());
                Double fahrenheit = calcularTemperatura.convertirFaC(celsius);

                lista.add(new Grados(celsius,fahrenheit));

                ingresarGrados.ingresar(ingresarGrados.getGrados(),celsius,fahrenheit);

                textField1.setText(" ");
            }
        }
    }

    private void query(){
        resultadoButton.addActionListener(e -> {
            Mostrar2 mostrar2 = new Mostrar2();
            mostrar2.setVisible(true);
            this.setVisible(false);
        });
    }

    public static ArrayList<Grados> getElemento(){
        return lista;
    }

}

