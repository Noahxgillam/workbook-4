public class Reservations {
    String roomType;
    int price;

    public String getRoomType() {
        return roomType;
    }

    public void setRoomType(String roomType) {
        this.roomType = roomType;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int getNumOfNights() {
        return NumOfNights;
    }

    public void setNumOfNights(int numOfNights) {
        NumOfNights = numOfNights;
    }

    public boolean isWeekend() {
        return isWeekend;
    }

    public void setWeekend(boolean weekend) {
        isWeekend = weekend;
    }

    int NumOfNights;
    boolean isWeekend;
}
