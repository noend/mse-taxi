package com.taxi.model;

import com.taxi.util.DBUtil;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class BaseModel {

    private static final String GET_RATING_QUERY = "Select %s.firstname, %sRating.rating from Dispatch join %sRating on Dispatch.request_id=%sRating.request_id join %s on Dispatch.driver_id=%s.%s_id WHERE %s.%s_id = ?";
    private static final String GET_TABLE_QUERY = "SELECT * FROM %s";

    public ResultSet getRating(String table, int id){
        ResultSet result = null;
        try {
            String query = String.format(GET_RATING_QUERY, table, table, table, table, table, table, table, table, table);
            PreparedStatement stmt = DBUtil.getConnection().prepareStatement(query);
            stmt.setInt(1, id);
            result = stmt.executeQuery();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return result;
    }

    public static ResultSet getTable(String tableName, String options){
        ResultSet result = null;
        try {
            String query = String.format(GET_TABLE_QUERY + options, tableName);
            PreparedStatement stmt = DBUtil.getConnection().prepareStatement(query);
            result = stmt.executeQuery();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return result;
    }

}
