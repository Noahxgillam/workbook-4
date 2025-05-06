public class HotelOperations {
    public static void main(String[] args) {

        Room hotelRoom = new Room(2, 150.00);

        hotelRoom.checkIn();
        hotelRoom.checkOut();
        hotelRoom.cleanRoom();

        Employee housekeeper = new Employee("E002", "John", "Housekeeping", 18.00);
        housekeeper.punchIn(8.00);
        housekeeper.punchOut(16.00);
        System.out.println("Total Pay: $" + housekeeper.getTotalPay());
    }
}
