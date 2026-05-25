package ParkingLot;

import java.util.List;

class ParkingLot {

    private List<ParkingSpot> spots;

    private ParkingStrategy strategy;

    public ParkingLot(
            List<ParkingSpot> spots,
            ParkingStrategy strategy
    ) {

        this.spots = spots;
        this.strategy = strategy;
    }

    public Ticket parkVehicle(Vehicle vehicle) {

        ParkingSpot spot =
                strategy.findSpot(spots);

        if (spot == null) {

            System.out.println(
                    "No parking spot available"
            );

            return null;
        }

        spot.parkVehicle(vehicle);

        System.out.println(
                "Vehicle parked at spot: " +
                        spot.getId()
        );

        return new Ticket(vehicle, spot);
    }
}