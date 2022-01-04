package com.company;

import java.util.ArrayList;

class Box <T> {
    private T t;
    public static <Box> Box getSecondElement(ArrayList<Box> list) {
        return list.get(1);
    }

    public Box(T t) {
        this.t = t;
    }
    public void set(T t) { this.t = t; }
    public T get() { return t;
    }

    @Override
    public String toString() {
        return get().toString();
    }
}
