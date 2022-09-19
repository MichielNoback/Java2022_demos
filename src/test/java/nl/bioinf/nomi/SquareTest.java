package nl.bioinf.nomi;

import org.junit.jupiter.api.Test;

class SquareTest {
    @Test
    public void squareMember() {
        Square s1 = new Square();
        System.out.println(Square.side);
        System.out.println(s1.side);
        Square.side = 3;
        System.out.println(Square.side);
        System.out.println(s1.side);
    }
}