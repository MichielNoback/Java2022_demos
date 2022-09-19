package nl.bioinf.nomi;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MainTest {

    @Test
    void squared() {
        Main main = new Main();
        Main.power = 3;
        assertEquals(0, main.powerTheNumber(0));
        assertEquals(1, main.powerTheNumber(1));
        assertEquals(27, main.powerTheNumber(3));
    }
}