package mooc.vandy.java4android.buildings.logic;

import mooc.vandy.java4android.buildings.ui.OutputInterface;

/**
 * This Neighborhood utility class provides static helper methods the
 * print a Building List and calculate the area of a Building list.
 * A utility class in Java should always be final and have a private
 * constructor, as per https://en.wikipedia.org/wiki/Utility_class.
 */
public final class Neighborhood {

    static public void print(Building[] buildings, String header, OutputInterface out) {
        out.println(header);
        out.println("----------");
        for (int i = 0; i < buildings.length; i++) {
            out.println(buildings[i].toString());
        }
    }

    static public int calcArea(Building[] buildings) {
        int sumArea = 0;

        for (int i = 0; i < buildings.length; i++) {
            sumArea += buildings[i].calcLotArea();
        }
        return sumArea;
    }
}
