package nl.bioinf.nomi;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MethodsDemoTest {

    @Test
    void getTriangleSurface() {
        MethodsDemo md = new MethodsDemo();
        double triangleSurface = md.getTriangleSurface(2, 3);
        System.out.println("triangleSurface = " + triangleSurface);

        int x = 1/2;
        System.out.println("x = " + x);

    }
}