package com.taxi.model;

import com.sun.org.apache.xpath.internal.operations.String;

import java.sql.ResultSet;
import java.util.Date;

public class Driver extends BaseModel {

    private Number DRIVER_ID;
    private String DRIVER_FNAME;
    private String DRIVER_LNAME;
    private String ADDRESS;
    private String VEHICLE;
    private Date CREATED;

    public Driver(Number DRIVER_ID, String DRIVER_FNAME, String DRIVER_LNAME, String ADDRESS, String VEHICLE, Date CREATED) {
        this.DRIVER_ID = DRIVER_ID;
        this.DRIVER_FNAME = DRIVER_FNAME;
        this.DRIVER_LNAME = DRIVER_LNAME;
        this.ADDRESS = ADDRESS;
        this.VEHICLE = VEHICLE;
        this.CREATED = CREATED;
    }

    public static ResultSet get() {
        return  getTable("DRIVER", "");
    }

    public Number getDRIVER_ID() {
        return DRIVER_ID;
    }

    public void setDRIVER_ID(Number DRIVER_ID) {
        this.DRIVER_ID = DRIVER_ID;
    }

    public String getDRIVER_FNAME() {
        return DRIVER_FNAME;
    }

    public void setDRIVER_FNAME(String DRIVER_FNAME) {
        this.DRIVER_FNAME = DRIVER_FNAME;
    }

    public String getDRIVER_LNAME() {
        return DRIVER_LNAME;
    }

    public void setDRIVER_LNAME(String DRIVER_LNAME) {
        this.DRIVER_LNAME = DRIVER_LNAME;
    }

    public String getADDRESS() {
        return ADDRESS;
    }

    public void setADDRESS(String ADDRESS) {
        this.ADDRESS = ADDRESS;
    }

    public String getVEHICLE() {
        return VEHICLE;
    }

    public void setVEHICLE(String VEHICLE) {
        this.VEHICLE = VEHICLE;
    }

    public Date getCREATED() {
        return CREATED;
    }

    public void setCREATED(Date CREATED) {
        this.CREATED = CREATED;
    }
}
