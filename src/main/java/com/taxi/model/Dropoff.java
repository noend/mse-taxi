package com.taxi.model;

import java.sql.ResultSet;
import java.sql.Timestamp;

public class Dropoff extends BaseModel{
    private Number DROPOFF_ID;
    private Number REQUEST_ID;
    private Timestamp DATETIME;

    public Dropoff(Number DROPOFF_ID, Number REQUEST_ID, Timestamp DATETIME) {
        this.DROPOFF_ID = DROPOFF_ID;
        this.REQUEST_ID = REQUEST_ID;
        this.DATETIME = DATETIME;
    }

    public static ResultSet get() {
        return  getTable("DROPOFF", "");
    }

    public Number getDROPOFF_ID() {
        return DROPOFF_ID;
    }

    public void setDROPOFF_ID(Number DROPOFF_ID) {
        this.DROPOFF_ID = DROPOFF_ID;
    }

    public Number getREQUEST_ID() {
        return REQUEST_ID;
    }

    public void setREQUEST_ID(Number REQUEST_ID) {
        this.REQUEST_ID = REQUEST_ID;
    }

    public Timestamp getDATETIME() {
        return DATETIME;
    }

    public void setDATETIME(Timestamp DATETIME) {
        this.DATETIME = DATETIME;
    }
}
