package com.coolweather.android.db;

import org.litepal.crud.DataSupport;

public class Provience extends DataSupport {

    private int id;
    private String provienceName;
    private int provienceCode;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getProvienceName() {
        return provienceName;
    }

    public void setProvienceName(String provienceName) {
        this.provienceName = provienceName;
    }

    public int getProvienceCode() {
        return provienceCode;
    }

    public void setProvienceCode(int provienceCode) {
        this.provienceCode = provienceCode;
    }
}
