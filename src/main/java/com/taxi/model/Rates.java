package com.taxi.model;

import java.sql.ResultSet;

public class Rates extends BaseModel{

    private Number RATES_ID;
    private Float BASE;
    private Float PER_MILE;

    public Rates(Number RATES_ID, Float BASE, Float PER_MILE) {
        this.RATES_ID = RATES_ID;
        this.BASE = BASE;
        this.PER_MILE = PER_MILE;
    }

    public static ResultSet get() {
        return  getTable("RATES", "");
    }

    public Number getRATES_ID() {
        return RATES_ID;
    }

    public void setRATES_ID(Number RATES_ID) {
        this.RATES_ID = RATES_ID;
    }

    public Float getBASE() {
        return BASE;
    }

    public void setBASE(Float BASE) {
        this.BASE = BASE;
    }

    public Float getPER_MILE() {
        return PER_MILE;
    }

    public void setPER_MILE(Float PER_MILE) {
        this.PER_MILE = PER_MILE;
    }
}
