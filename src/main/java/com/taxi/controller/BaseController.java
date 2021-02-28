package com.taxi.controller;

import com.taxi.model.*;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Arrays;

public class BaseController {

    static ArrayList results;

public BaseController() {
    results = new ArrayList<>();
}

public ResultSet getAllClients() {
    return Clients.get();
}

public ResultSet getAllDrivers() {
    return Driver.get();
}

public ResultSet getAllDropoffs() {
    return Dropoff.get();
}

public ResultSet getAllPickups() {
    return Pickup.get();
}

public ResultSet getAllRates() {
    return Rates.get();
}

public ResultSet getAllRequests() {
    return Request.get();
}

public void buildResultsTable(String selectedReference, JTable resultsTable) throws SQLException {

    ResultSet resultSet = null;
    DefaultTableModel model = (DefaultTableModel) resultsTable.getModel();

    if (selectedReference.equals("Clients")) {
        resultSet = getAllClients();
    }
    if (selectedReference.equals("Driver")) {
        resultSet = getAllDrivers();
    }
    if (selectedReference.equals("Request")) {
        resultSet = getAllRequests();
    }
    if (selectedReference.equals("Rates")) {
        resultSet = getAllRates();
    }
    if (selectedReference.equals("Pickup")) {
        resultSet = getAllPickups();
    }
    if (selectedReference.equals("Dropoff")) {
        resultSet = getAllDropoffs();
    }

    for (int i = 0; i < resultSet.getMetaData().getColumnCount(); i++) {
        model.addColumn(resultSet.getMetaData().getColumnName(i + 1));
    }

    while (resultSet.next()) {
        //Iterate Row
        Object[] line = new Object[]{};
        ArrayList<Object> row = new ArrayList<Object>(Arrays.asList(line));
        for (int i = 1; i <= resultSet.getMetaData().getColumnCount(); i++) {
            //Iterate Column
            row.add(resultSet.getObject(i));

        }

        model.addRow(row.toArray());

    }

}

public String [] buildTableColumn() {
    String[] columnNames = { };
    return columnNames;
}

public Object[] buildTableRow() {
    Object[] row = {};
return row;
}

}
