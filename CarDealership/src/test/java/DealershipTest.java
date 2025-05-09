import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;

class DealershipTest {

    @Test
    void getAllVehicles() {
        Vehicle myCar = new Vehicle();
        Dealership dealership = new Dealership();
        dealership.addVehicle(myCar);

        ArrayList<Vehicle> actual = dealership.getAllVehicles();

        assertTrue(actual.contains(myCar));
    }
}