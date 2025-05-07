public class HotelOperations {
    public static void main(String[] args) {

        Room hotelRoom = new Room();

        hotelRoom.checkIn();
        hotelRoom.checkOut();
        hotelRoom.cleanRoom();

        Employee housekeeper = new Employee();
        housekeeper.punchIn(8.00);
        housekeeper.punchOut(16.00);
        System.out.println("Total Pay: $" + housekeeper.getTotalPay());
    }
}
