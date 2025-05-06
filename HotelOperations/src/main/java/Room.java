public class Room {

    int NumOfBeds;
    int Price;
    boolean occupied;
    boolean dirty;

    public boolean isDirty() {
        return dirty;
    }

    public int getPrice() {
        return Price;
    }

    public boolean isOccupied() {
        return occupied;
    }

    public int getNumOfBeds() {
        return NumOfBeds;
    }

    public boolean isAvailble() {
        if (!dirty && !occupied) {
            return true;
        } else {
            return false;
        }
    }
}


