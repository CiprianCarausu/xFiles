package model.factory;

import model.Animal;
import model.Car;
import model.Hole;
import model.Obstacle;
import service.Constants;

import java.util.Map;

public class ObjectFactory {
    /**
     * Here we have the factory method (design pattern) which creates objects based on parameters.
     * We are using it due to the fact that if we change the input we can obtain a different object.
     * Meaning that, in case we have new classes needed in the application we can give to the factory method the ability
     * to create it.
     *
     * @param objectType
     * @param objectAttributesValues
     * @return
     */
    public static Object create(String objectType, Map<String, String> objectAttributesValues) {

        if (objectType.equals(Constants.CAR)) {
            Car car = new Car();
            car.setName(objectAttributesValues.get(Constants.NAME));
            car.setColor(objectAttributesValues.get(Constants.COLOR));
            car.setSpeed(Integer.parseInt(objectAttributesValues.get(Constants.SPEED)));
            return car;
        } else if (objectType.equals(Constants.OBSTACLE)) {
            Obstacle obstacle = createObstacle(objectType, objectAttributesValues);
            obstacle.setType(objectAttributesValues.get(Constants.TYPE));
            try {
                obstacle.setSize(Integer.parseInt(objectAttributesValues.get(Constants.SIZE)));
            } catch (Exception e) {
                System.out.println("--- Invalid key.");
            }
            return obstacle;
        }
        return null;
    }

    public static Obstacle createObstacle(String objectType, Map<String, String> objectAttributesValues) {
        Obstacle obstacle;
        String type = objectAttributesValues.get(Constants.TYPE);
        if (type.equals(Constants.ANIMAL)) {
            return new Animal();
        } else if (type.equals(Constants.HOLE)) {
            return new Hole();
        }
        return new Obstacle();
    }

}