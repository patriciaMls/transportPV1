package com.mls.transport;

import java.util.Date;

/**
 * @description:
 * @author: Patricia
 * @date: Created in 2020/5/16 23:18
 * @version: 1.0
 * @modified By:
 */
public class Bicycle {
    private String id;
    private String ownership;
    private String Price;
    private Date dateOfPurchase;
    private String GPSPosition;

    public Bicycle() {
    }

    public Bicycle(String id) {
        this.id = id;
    }

    public void drivingMethod(){
        System.out.println("Bicycle drivingMethod");
    }
}
