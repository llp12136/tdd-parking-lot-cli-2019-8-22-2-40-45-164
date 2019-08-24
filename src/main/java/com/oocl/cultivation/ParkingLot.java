package com.oocl.cultivation;

import java.util.HashMap;
import java.util.Map;

public class ParkingLot {
    private Car car;
   // Private ParkingTicket ticket;

    public ParkingTicket parkCar(Car car) {
        this.car = car;
        return new ParkingTicket();
    }

    public Car pickCar(ParkingTicket ticket) {
        // TODO Auto-generated method stub
       // this.ticket = ticket;
        return car;
    }

}
