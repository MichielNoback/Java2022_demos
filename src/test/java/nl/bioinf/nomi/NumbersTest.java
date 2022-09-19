package nl.bioinf.nomi;

import org.junit.jupiter.api.Test;

public class NumbersTest {
    @Test
    public void testByteRange() {
        byte b = 120;
        for(int i = 0; i < 10; i++) {
            b++;
            System.out.println("b = " + b);
        }
    }

    @Test
    public void testIncrement() {
        int i = 10;
        //i++ equals i += 1
        //i *= 10;
        System.out.println("i = " + ++i);
    }
}
