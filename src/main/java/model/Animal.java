package model;

import Features.Moveable;

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
