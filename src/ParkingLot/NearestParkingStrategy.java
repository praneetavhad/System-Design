package ParkingLot;

import java.util.List;

class NearestParkingStrategy implements ParkingStrategy {

    @Override
    public ParkingSpot findSpot(
            List<ParkingSpot> spots
    ) {

        for (ParkingSpot spot : spots) {

            if (!spot.isOccupied()) {
                return spot;
            }
        }

        return null;
    }
}
