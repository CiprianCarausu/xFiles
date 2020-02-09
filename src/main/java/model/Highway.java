package model;

import java.util.List;

public class Highway {
    private int height;
    private int width;
    private Object[][] highWayMatrix;
    private List<Lane> lanes;

    public Highway(int height, int width) {
        this.height = height;
        this.width = width;
        highWayMatrix = new Object[height][width];

    }

}
