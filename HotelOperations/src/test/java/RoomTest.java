import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RoomTest {
int numOfBeds;
double price;
    @Test
    void testCheckInToDirty() {
        Room room = new Room();
        room.setDirty(true);

       boolean checkInSuccessful = room.checkIn();

       assertFalse(checkInSuccessful);
    }

    @Test
    void getPrice() {
    }

    @Test
    void isOccupied() {
    }

    @Test
    void getNumOfBeds() {
    }

    @Test
    void isAvailble() {
    }

    @Test
    public boolean checkIn() {
        if (this.drity || this.occupied) {
            return false;
        }
        else {
            this.occupied = true;
            this.dirty = true;
            return true;
        }
    }

    @Test
    void checkOut() {
    }

    @Test
    void cleanRoom() {
    }
}