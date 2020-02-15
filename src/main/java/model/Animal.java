package model;

import Features.Moveable;

/**
 * The child  class (Animal) obtains the properties and behaviours of the parent class (Obstacle).
 * Advantage : avoid duplicate code
 * DRY concept = do not repeat yourself
 */
public class Animal extends Obstacle implements Moveable {
    public Animal(String type, int size) {
        super(type, size);
    }

    public Animal() {

    }

    public void canMove() {

    }

  /*  @Override
    public String toString() {
        return "Animal{" +
                "type='" + this.getType() + '\'' +
                ", size=" + this.getSize() +
                '}';
    }*/
}
