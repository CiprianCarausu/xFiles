package model;

public class Obstacle {
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
}
