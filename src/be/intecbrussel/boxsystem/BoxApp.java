package be.intecbrussel.boxsystem;

import java.util.*;

public class BoxApp {

    public static void main(String[] args) {
        Box b1 = new Box(1,1,1);
        Box b2 = new Box(10,10,10);
        Box b3 = new Box(1,500,10);
        Box b4 = new Box(1,100,10);
        Box b5 = new Box(14,10,9);

        List<Box> boxes = new ArrayList<>();
        boxes.add(b1);
        boxes.add(b2);
        boxes.add(b3);
        boxes.add(b4);
        boxes.add(b5);

//        sortBySortMethod(boxes);
        sortWithSortedCollection(b1, b2, b3, b4, b5);
    }

    private static void sortBySortMethod(List<Box> boxes) {
//        Collections.sort(boxes, (box1, box2) -> box1.getLength() - box2.getLength());
        Collections.sort(boxes, Comparator.comparing(Box::getHeight));
        boxes.forEach(System.out::println);
    }

    private static void sortWithSortedCollection(Box... boxes) {
//        Collection<Box> boxCollection = new TreeSet<>(
//                Comparator.comparing(Box::getWidth).thenComparing(Comparator.comparing(Box::getLength))
//                        .thenComparing(Box::getHeight)
//        );

        Collection<Box> boxCollection = new TreeSet<>();

        for (Box box : boxes) {
            boxCollection.add(box);
            System.out.println("-".repeat(30));
            boxCollection.forEach(System.out::println);
        }

    }
}
