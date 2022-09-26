package nl.bioinf.nomi;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class GeometryAnalyserTest {

    @Test
    public void implementDemo() {
        GeometryAnalyser geometryAnalyser = new GeometryAnalyser() {
            @Override
            public double square(double side) {
                return 0;
            }
        };

        GeometryAnalyser geometryAnalyser2 =
                side -> geometryAnalyser.square(3);
    }

    public static class SquareAnalyser implements GeometryAnalyser {
        @Override
        public double square(double side) {
            return 0;
        }
    }
}