
public class Main {

    public static void main(String[] args) {

        Hotel hotel = new Hotel(5);

        hotel.showAvailableRooms();

        System.out.println("\nMelakukan reservasi...");
        Booking booking1 = new Booking(hotel.getRooms()[0], "Yusup Palkori");
        booking1.showBookingDetails();

        System.out.println("\nKamar setelah reservasi:");
        hotel.showAvailableRooms();

        System.out.println("\nMembatalkan reservasi...");
        booking1.cancelBooking();

        System.out.println("\nKamar setelah pembatalan reservasi:");
        hotel.showAvailableRooms();
    }
}
