package nl.bioinf.nomi;

/**
 * Models a geometric square
 */
public class Square {
    public static int side = 2;

    /**
     * returns the surface of this square.
     *
     * @return surface, in square meters.
     */
    public int getSurface() {
        return side * side;
    }
}
