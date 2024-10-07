// Class untuk Booking

class Booking {

    private Room room;
    private String customerName;

    public Booking(Room room, String customerName) {
        this.room = room;
        this.customerName = customerName;
        room.setAvailable(false);
    }

    public void showBookingDetails() {
        System.out.println("Nama Customer: " + customerName);
        System.out.println("Nomor Kamar: " + room.getRoomNumber());
    }

    public void cancelBooking() {
        room.setAvailable(true);
        System.out.println("Reservasi dibatalkan.");
    }
}
