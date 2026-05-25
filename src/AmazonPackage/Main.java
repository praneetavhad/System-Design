package AmazonPackage;

import java.util.*;

public class Main {

    public static void main(String[] args) {

        List<Locker> lockers = new ArrayList<>();

        lockers.add(new Locker("L1"));
        lockers.add(new Locker("L2"));

        LockerSystem system = new LockerSystem(lockers);

        Package pkg = new Package("P1", "U1");

        Locker locker = system.assignLocker(pkg);

        if (locker != null) {
            system.openLocker(locker.lockerId, locker.otp);
        }
    }
}