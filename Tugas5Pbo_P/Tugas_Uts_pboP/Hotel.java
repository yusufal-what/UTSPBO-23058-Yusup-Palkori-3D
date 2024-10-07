// Class untuk Hotel (Admin Level)

class Hotel {

    private Room[] rooms;

    public Hotel(int numberOfRooms) {
        rooms = new Room[numberOfRooms];
        for (int i = 0; i < numberOfRooms; i++) {
            rooms[i] = new Room("Kamar " + (i + 1));
        }
    }

    public Room[] getRooms() {
        return rooms;
    }

    public void showAvailableRooms() {
        System.out.println("Kamar yang Tersedia:");
        for (Room room : rooms) {
            if (room.isAvailable()) {
                System.out.println(room.getRoomNumber());
            }
        }
    }
}
