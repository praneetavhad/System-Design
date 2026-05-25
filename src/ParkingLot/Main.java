package ParkingLot;

import ParkingLot.ParkingSpot;

import java.util.*;

public class Main {

    public static void main(String[] args) {

        List<ParkingSpot> spots =
                new ArrayList<>();

        spots.add(new ParkingSpot(1));
        spots.add(new ParkingSpot(2));
        spots.add(new ParkingSpot(3));

        ParkingStrategy strategy =
                new NearestParkingStrategy();

        ParkingLot parkingLot =
                new ParkingLot(spots, strategy);

        Vehicle car =
                new Car("MH12AB1234");

        Ticket ticket =
                parkingLot.parkVehicle(car);

        if (ticket != null) {
            ticket.printTicket();
        }
    }
}