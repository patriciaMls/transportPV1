package com.mls.transport;

import java.util.Date;

/**
 * @description:
 * @author: Patricia
 * @date: Created in 2020/5/16 23:17
 * @version: 1.0
 * @modified By:
 */
public class Ship {
    private String id;
    private String ownership;
    private String Price;
    private Date dateOfPurchase;
    private String GPSPosition;

    public Ship() {
    }

    public Ship(String id) {
        this.id = id;
    }

    public void drivingMethod(){
        System.out.println("Ship drivingMethod");
    }
}
