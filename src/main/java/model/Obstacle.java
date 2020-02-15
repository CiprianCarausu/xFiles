package model;

public class Obstacle implements Comparable<Obstacle> {
    private String type;
    private int size;

    public Obstacle(String type, int size) {
        this.type = type;
        this.size = size;
    }

    public Obstacle() {

    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    @Override
    public String toString() {
        return this.getClass().getSimpleName() + "{" +
                "type='" + type + '\'' +
                ", size=" + size +
                '}';
    }

    //a negative integer, zero, or a positive integer as this object is less than, equal to, or greater than the specified object.
    public int compareTo(Obstacle o) {
        if (this.getSize() > o.getSize()) {
            return 1;
        } else if (this.getSize() == o.getSize()) {
            return 0;
        } else {
            return -1;
        }
    }
}
