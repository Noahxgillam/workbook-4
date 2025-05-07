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

    public void checkIn() {
        if (isAvailble()) {
            occupied = true;
            dirty = true;
            System.out.println();
        } else {
            System.out.println("Room is not available.");
        }
    }

    public void checkOut() {
        if (occupied) {
            occupied = false;
            System.out.println("Guest checked out.");
        } else {
            System.out.println("Room was not used.");
        }
    }

    public void cleanRoom() {
        if (!occupied) {
            dirty = false;
            System.out.println("Room has been cleaned.");
        } else {
            System.out.println("Cannot clean an occupied room.");
        }
    }
}




