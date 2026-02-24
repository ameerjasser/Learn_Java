package com.mycompany.firstproject.Object_Oriented_Programming.Inheritance.topic2;

import java.util.Objects;

public class point {
    private int x;
    private int y;

    public point(int x, int y){
        this.x =x;
        this.y =y;
    }

    @Override
    public boolean equals(Object o) {
        if (!(o instanceof point point)) return false;  // what does point point do here? two steps in one line: 1. check if o is an instance of point, 2. if it is, cast o to point and assign it to a new variable named point
        return x == point.x && y == point.y;
    }

    @Override
    public int hashCode() {
        return Objects.hash(x, y);
    }
    //
//    @Override
//    public boolean equals(Object obj) {
//        if(this == obj)
//            return true;
//
//        if(!(obj instanceof point))
//            return false;
//
//        var other = (point) obj;
//        return x == other.x && y == other.y;
//
//    }
//
//    @Override
//    public int hashCode() {
//        return Objects.hash(x, y);
//    }
}
