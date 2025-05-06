public class Reservations {
    String roomType;

    public String getRoomType() {
        return roomType;
    }

    public void setRoomType(String roomType) {
        this.roomType = roomType;
    }

    public int getPrice() {
       if(roomType.equals("king")){
           return 139;
       }
       else if (roomType.equals("double")){
           return 124;
       }
       else {
           throw new RuntimeException("invald room type");
       }
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
