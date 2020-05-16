package com.mls;

import com.mls.person.Person;
import com.mls.transport.Bicycle;
import com.mls.transport.HotAirBalloon;

/**
 * @description:
 * @author: Patricia
 * @date: Created in 2020/5/16 23:31
 * @version: 1.0
 * @modified By:
 */
public class main {
    public static void main(String[] args) {
        Person person1 = new Person("111");
        HotAirBalloon hotAirBalloon = new HotAirBalloon();
        Bicycle bicycle = new Bicycle();

        person1.driveTransport(hotAirBalloon);
        person1.driveTransport(bicycle);
    }
}
