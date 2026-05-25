package AmazonPackage;

import java.util.*;

class LockerSystem {

    List<Locker> lockers;

    public LockerSystem(List<Locker> lockers) {
        this.lockers = lockers;
    }

    public Locker assignLocker(Package pkg) {

        for (Locker locker : lockers) {

            if (!locker.isOccupied) {

                locker.pkg = pkg;
                locker.isOccupied = true;
                locker.otp = OTPGenerator.generate();

                System.out.println(
                        "Locker assigned: " + locker.lockerId +
                                " OTP: " + locker.otp
                );

                return locker;
            }
        }

        System.out.println("No lockers available");
        return null;
    }

    public void openLocker(String lockerId, String otp) {

        for (Locker locker : lockers) {

            if (locker.lockerId.equals(lockerId)) {

                if (locker.otp.equals(otp)) {

                    locker.pkg = null;
                    locker.isOccupied = false;
                    locker.otp = null;

                    System.out.println("Locker opened successfully");

                } else {
                    System.out.println("Invalid OTP");
                }

                return;
            }
        }
    }
}