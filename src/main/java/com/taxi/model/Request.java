package com.taxi.model;

import java.sql.ResultSet;
import java.sql.Timestamp;

public class Request extends BaseModel{

    private Number REQUEST_ID;
    private Number CLIENT_ID;
    private Timestamp DATETIME;
    private String SOURCE;
    private String DESTINATION;

    public Request(Number REQUEST_ID, Number CLIENT_ID, Timestamp DATETIME, String SOURCE, String DESTINATION) {
        this.REQUEST_ID = REQUEST_ID;
        this.CLIENT_ID = CLIENT_ID;
        this.DATETIME = DATETIME;
        this.SOURCE = SOURCE;
        this.DESTINATION = DESTINATION;
    }

    public static ResultSet get() {
        return  getTable("REQUEST", "");
    }

    public Number getREQUEST_ID() {
        return REQUEST_ID;
    }

    public void setREQUEST_ID(Number REQUEST_ID) {
        this.REQUEST_ID = REQUEST_ID;
    }

    public Number getCLIENT_ID() {
        return CLIENT_ID;
    }

    public void setCLIENT_ID(Number CLIENT_ID) {
        this.CLIENT_ID = CLIENT_ID;
    }

    public Timestamp getDATETIME() {
        return DATETIME;
    }

    public void setDATETIME(Timestamp DATETIME) {
        this.DATETIME = DATETIME;
    }

    public String getSOURCE() {
        return SOURCE;
    }

    public void setSOURCE(String SOURCE) {
        this.SOURCE = SOURCE;
    }

    public String getDESTINATION() {
        return DESTINATION;
    }

    public void setDESTINATION(String DESTINATION) {
        this.DESTINATION = DESTINATION;
    }
}
