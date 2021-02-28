package com.taxi.model;

import java.sql.ResultSet;
import java.sql.Timestamp;

public class Pickup extends BaseModel{
    private Number PICKUP_ID;
    private Number REQUEST_ID;
    private Timestamp DATETIME;

    public Pickup(Number PICKUP_ID, Number REQUEST_ID, Timestamp DATETIME) {
        this.PICKUP_ID = PICKUP_ID;
        this.REQUEST_ID = REQUEST_ID;
        this.DATETIME = DATETIME;
    }

    public static ResultSet get() {
        return  getTable("PICKUP", "");
    }

    public Number getPICKUP_ID() {
        return PICKUP_ID;
    }

    public void setPICKUP_ID(Number PICKUP_ID) {
        this.PICKUP_ID = PICKUP_ID;
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
