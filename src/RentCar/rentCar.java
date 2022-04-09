package RentCar;

import java.util.HashMap;

public class rentCar {
    private HashMap<String, car> cars = new HashMap<>();

    public void addCar(car car) {
      cars.put(car.getId(), car);

    }


}
