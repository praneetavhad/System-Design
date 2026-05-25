package ParkingLot;

class Ticket {

    private Vehicle vehicle;
    private ParkingSpot spot;

    public Ticket(
            Vehicle vehicle,
            ParkingSpot spot
    ) {

        this.vehicle = vehicle;
        this.spot = spot;
    }

    public void printTicket() {

        System.out.println(
                "Vehicle: " +
                        vehicle.getNumber()
        );

        System.out.println(
                "Spot: " +
                        spot.getId()
        );
    }
}
