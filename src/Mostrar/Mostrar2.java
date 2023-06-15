package Mostrar;
import Datos.Grados;
import Datos.Titulos2;
import MenuPrincipal.Principal;
import TEMP.Conversion02;

import javax.swing.*;
import javax.swing.JFrame;
import javax.swing.table.DefaultTableModel;
import java.awt.*;
import java.util.ArrayList;

public class Mostrar2 extends JFrame {
    private JTable jTable;
    private JPanel panelContainer, panelButton;
    private JButton btnQuery;
    private DefaultTableModel modelo;

    public Mostrar2 (){
        initControl();
        configTable();
        setControl();
        configPanel();
        configFrame();
        query();
        add(panelContainer);
    }
    private void query(){
        btnQuery.addActionListener(e -> {
            Principal principal = new Principal();
            principal.setVisible(true);
            this.setVisible(false);
        });
    }

    private void initControl(){

        modelo = new DefaultTableModel();
        modelo.setColumnIdentifiers(Titulos2.grados);
        String [] fila = new String[modelo.getColumnCount()];
        ArrayList<Grados> lista = Conversion02.getElemento();
        for (Grados userTable : lista) {
            fila[0] = String.valueOf(userTable.getFahrenheit());
            fila[1] = String.valueOf(userTable.getCelsius());
            modelo.addRow(fila);
        }

        panelButton = new JPanel();
        panelContainer = new JPanel();
        btnQuery = new JButton();
        jTable = new JTable(modelo);
    }

    private void setControl(){
        btnQuery.setText("Regresar");
    }
    private void configPanel(){

        panelButton.setLayout(new FlowLayout());
        panelButton.setPreferredSize(new Dimension(150, 50));
        panelButton.add(btnQuery);

        panelContainer.setLayout(new GridLayout(4, 0));
        panelContainer.add(panelButton);

        add(panelContainer);
    }

    private void configFrame(){
        setTitle("Tabla de Grados");
        setLayout(new FlowLayout());
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
        setResizable(false);
        setSize(600, 200);
    }

    private void configTable(){
        jTable.setGridColor(new Color(88, 214, 141));
        jTable.setPreferredScrollableViewportSize(new Dimension(500, 70));
        JScrollPane scrollPane = new JScrollPane(jTable);
        getContentPane().add(scrollPane, BorderLayout.CENTER);
    }
}

