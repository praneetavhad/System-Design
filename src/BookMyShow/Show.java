package BookMyShow;

import java.util.ArrayList;
import java.util.List;

public class Show implements Subject{
    private List<Observer> obs = new ArrayList<>();
    private int availableSeats;

    public Show(int availableSeats) {
        this.availableSeats = availableSeats;
    }

    @Override
    public void addObserver(Observer o) {
        obs.add(o);
    }

    @Override
    public void removeObserver(Observer o) {
        obs.remove(o);
    }

    @Override
    public void notifyUsers(String msg) {
        System.out.println(msg);
    }

    public void bookseat(){
        if (availableSeats <= 0) {
            notifyUsers("No seats available!");
            return;
        }

        if(availableSeats > 0){
            availableSeats--;
            notifyUsers("Seat booked ! Remaining seats" + availableSeats );
        }

        if(availableSeats == 0){
            notifyUsers("No seats available  ! Remaining seats" + availableSeats);
        }
    }

    public void cancelseats(){
        availableSeats--;
        notifyUsers("! Remaining seats" + availableSeats);
    }
}
