package ParkingLot;

class ParkingSpot {

    private int id;
    private boolean occupied;
    private Vehicle vehicle;

    public ParkingSpot(int id) {
        this.id = id;
    }

    public boolean isOccupied() {
        return occupied;
    }

    public void parkVehicle(Vehicle vehicle) {
        this.vehicle = vehicle;
        this.occupied = true;
    }

    public void removeVehicle() {
        this.vehicle = null;
        this.occupied = false;
    }

    public int getId() {
        return id;
    }
}
