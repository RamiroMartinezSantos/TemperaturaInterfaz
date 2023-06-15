package MenuPrincipal;
import TEMP.Conversion01;
import TEMP.Conversion02;

import javax.swing.*;
import java.awt.*;
public class Principal extends JFrame {
    private JPanel panel1;
    private JButton CELSIUSAFAHRENHEITButton;
    private JButton FAHRENHEITACELSIUSButton;

    public Principal(){
        setupFrame();
        query();
        query1();
    }
    private void setupFrame(){
        setTitle("ESCOJA EL TIPO DE CONVERSION");
        setLayout(new FlowLayout());
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
        setResizable(false);
        setSize(400, 300);
        add(panel1);
    }

    private void query(){
        CELSIUSAFAHRENHEITButton.addActionListener(e -> {
            Conversion01 conversion01 = new Conversion01();
            conversion01.setVisible(true);
            this.setVisible(false);
        });
    }


    private void query1(){
        FAHRENHEITACELSIUSButton.addActionListener(e -> {
            Conversion02 conversion02 = new Conversion02();
            conversion02.setVisible(true);
            this.setVisible(false);
        });
    }
}
