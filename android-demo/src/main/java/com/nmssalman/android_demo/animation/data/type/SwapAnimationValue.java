package com.nmssalman.android_demo.animation.data.type;

import com.nmssalman.android_demo.animation.data.Value;

public class SwapAnimationValue implements Value {

    private int coordinate;
    private int coordinateReverse;

    public int getCoordinate() {
        return coordinate;
    }

    public void setCoordinate(int coordinate) {
        this.coordinate = coordinate;
    }

    public int getCoordinateReverse() {
        return coordinateReverse;
    }

    public void setCoordinateReverse(int coordinateReverse) {
        this.coordinateReverse = coordinateReverse;
    }
}
