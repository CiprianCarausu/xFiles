package model.factory;

import model.Animal;
import model.Car;
import model.Hole;
import model.Obstacle;
import service.Constants;

import java.util.Map;

public class ObjectFactory {

    public static Object create(String objectType, Map<String, String> objectAttributesValues) {

        if (objectType.equals(Constants.CAR)) {
            Car car = new Car();
            car.setName(objectAttributesValues.get(Constants.NAME));
            return car;
        } else if (objectType.equals(Constants.OBSTACLE)) {
            Obstacle obstacle = createObstacle(objectType, objectAttributesValues);
            return obstacle;
        }
        return null;
    }

    public static Obstacle createObstacle(String objectType, Map<String, String> objectAttributesValues) {
        Obstacle obstacle;
        String type = objectAttributesValues.get(Constants.TYPE);
        if (type.equals(Constants.ANIMAL)) {
            return new Animal();
        }
        else if (type.equals(Constants.HOLE)){
            return new Hole();
        }
        return new Obstacle();
    }

}
