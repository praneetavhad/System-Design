package AmazonPackage;

class Locker {

    String lockerId;
    boolean isOccupied;
    Package pkg;
    String otp;

    public Locker(String lockerId) {
        this.lockerId = lockerId;
        this.isOccupied = false;
    }
}
