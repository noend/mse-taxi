package com.taxi.model;

import com.sun.org.apache.xpath.internal.operations.String;

import java.sql.ResultSet;

public class Clients extends BaseModel {

    private Number CLIENT_ID;
    private String CLIENT_FNAME;
    private String CLIENT_LNAME;
    private Address ADDRESS;

    public Clients(Number CLIENT_ID, String CLIENT_FNAME, String CLIENT_LNAME, Address address) {
        this.CLIENT_ID = CLIENT_ID;
        this.CLIENT_FNAME = CLIENT_FNAME;
        this.CLIENT_LNAME = CLIENT_LNAME;
        this.ADDRESS = address;
    }

    public static ResultSet get() {
        return  getTable("CLIENTS", "");
    }

    public Number getCLIENT_ID() {
        return CLIENT_ID;
    }

    public void setCLIENT_ID(Number CLIENT_ID) {
        this.CLIENT_ID = CLIENT_ID;
    }

    public String getCLIENT_FNAME() {
        return CLIENT_FNAME;
    }

    public void setCLIENT_FNAME(String CLIENT_FNAME) {
        this.CLIENT_FNAME = CLIENT_FNAME;
    }

    public String getCLIENT_LNAME() {
        return CLIENT_LNAME;
    }

    public void setCLIENT_LNAME(String CLIENT_LNAME) {
        this.CLIENT_LNAME = CLIENT_LNAME;
    }

    public Address getADDRESS() {
        return ADDRESS;
    }

    public void setADDRESS(Address ADDRESS) {
        this.ADDRESS = ADDRESS;
    }
}
