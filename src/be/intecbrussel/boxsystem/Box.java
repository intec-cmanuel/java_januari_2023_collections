package be.intecbrussel.boxsystem;

import java.util.Comparator;

public class Box implements Comparable<Box>{
    private int length;
    private int width;
    private int height;

    public Box(int l, int w, int h) {
        this.length = l;
        this.height = h;
        this.width = w;
    }

    public int getHeight() {
        return height;
    }

    public int getLength() {
        return length;
    }

    public int getWidth() {
        return width;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public void setLength(int length) {
        this.length = length;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public int getVolume() {
        return length*height*width;
    }

    @Override
    public String toString() {
        return String.format("Box | length=%5d | width=%5d | heigth=%5d |",
                length, width, height);
    }

    @Override
    public int compareTo(Box o) {
        return Comparator.comparingInt(Box::getLength)
                .thenComparing(Box::getHeight)
                .thenComparing(Box::getWidth)
                .compare(this, o);

//        int lengthDiff = this.length - o.length;
//        int widthDiff = this.width - o.width;
//        int heightDiff = this.height - o.height;
//
//        if (lengthDiff != 0) {
//            return lengthDiff;
//        }
//
//        if (widthDiff != 0) {
//            return widthDiff;
//        }
//
//        return heightDiff;
    }
}
