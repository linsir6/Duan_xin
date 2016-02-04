package com.example.lin_sir.duan_xin.Bean;

import java.util.Date;

/**
 * Created by lin_sir on 2016/1/28.
 */
public class Festival {


    private int id;
    private String name;
    private String desc;
    private Date date;

    public Festival(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
}
