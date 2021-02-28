package com.taxi.view;

import com.taxi.controller.BaseController;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.SQLException;

public class index extends JFrame{
    private JPanel mainPanel;
    private JLabel mainPanelLabel;
    private JScrollPane resultsScrollPanel;
    private JTable resultsTable;
    private JLabel referenceLabel;
    private JComboBox<String> referenceComboBox;
    private JButton referenceSubmitButton;

    private final BaseController controller = new BaseController();

    public index(String title) {
        super(title);

        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(1024, 860);
        this.setContentPane(mainPanel);

        referenceComboBox.addItem("Изберете таблица от списъка");
        referenceComboBox.addItem("Clients");
        referenceComboBox.addItem("Driver");
        referenceComboBox.addItem("Request");
        referenceComboBox.addItem("Rates");
        referenceComboBox.addItem("Pickup");
        referenceComboBox.addItem("Dropoff");

        this.pack();

        referenceSubmitButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String selectedReference = (String) referenceComboBox.getSelectedItem();

                if (referenceComboBox.getSelectedIndex() != 0) {
                    try {
                        controller.buildResultsTable(selectedReference, resultsTable);
                    } catch (SQLException throwables) {
                        throwables.printStackTrace();
                    }
                }
            }
        });
    }
    public static JTable buildTable() {
        String[] columnNames = { };

        DefaultTableModel tableModel = new DefaultTableModel(columnNames, 0);
        JTable resultsTable = new JTable(tableModel);
        resultsTable.setBounds(80, 80, 860, 560);
        resultsTable.setFillsViewportHeight(true);


        return resultsTable;
    }

    private void initTable() {
        resultsTable = buildTable();
        resultsScrollPanel = new JScrollPane(resultsTable);
        this.getContentPane().add(resultsScrollPanel);
    }

    private void createUIComponents() {
        initTable();
    }
}
