package BookMyShow;


public class main {
    public static void main(String[] args) {
        Show show = new Show(2);

        Users u1 = new Users("Amit");
        Users u2 = new Users("Rahul");
        Users u3 = new Users("Neha");

        // Users subscribe to show updates
        show.addObserver(u1);
        show.addObserver(u2);
        show.addObserver(u3);

        // Booking seats triggers notifications
        show.bookseat();
        show.bookseat();

        // Cancellation triggers notification
        show.cancelseats();
    }
}
