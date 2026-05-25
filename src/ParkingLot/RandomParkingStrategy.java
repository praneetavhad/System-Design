package ParkingLot;

import java.util.List;

class RandomParkingStrategy implements ParkingStrategy {

    @Override
    public ParkingSpot findSpot(
            List<ParkingSpot> spots
    ) {

        for (int i = spots.size() - 1; i >= 0; i--) {

            if (!spots.get(i).isOccupied()) {
                return spots.get(i);
            }
        }

        return null;
    }
}