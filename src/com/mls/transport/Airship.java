package com.mls.transport;

import java.util.Date;

/**
 * @description:
 * @author: Patricia
 * @date: Created in 2020/5/16 23:22
 * @version: 1.0
 * @modified By:
 */
public class Airship {
    private String id;
    private String ownership;
    private String Price;
    private Date dateOfPurchase;
    private String GPSPosition;

    public Airship() {
    }

    public Airship(String id) {
        this.id = id;
    }

    public void drivingMethod(){
        System.out.println("Airship drivingMethod");
    }
}
