package com.oocl.cultivation;

public class ParkingBoy {
    private ParkingLot parkingLot;

    public ParkingBoy(ParkingLot parkingLot) {
        // TODO Auto-generated constructor stub
        this.parkingLot = parkingLot;
    }

    public ParkingTicket park(Car car) {
        // TODO Auto-generated method stub
        return parkingLot.parkCar(car);
    }

    public Car fetch(ParkingTicket ticket) {
        return parkingLot.pickCar(ticket);
    }
}