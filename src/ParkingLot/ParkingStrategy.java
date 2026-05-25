package ParkingLot;

import java.util.List;

interface ParkingStrategy {

    ParkingSpot findSpot(
            List<ParkingSpot> spots
    );
}